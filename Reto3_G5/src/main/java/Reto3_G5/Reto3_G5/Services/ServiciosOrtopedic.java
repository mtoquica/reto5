/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_G5.Reto3_G5.Services;

import Reto3_G5.Reto3_G5.Model.Ortopedic;
import Reto3_G5.Reto3_G5.Repository.RepositorioOrtopedic;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Miguel Toquica
 */
@Service
public class ServiciosOrtopedic {
    @Autowired
    private RepositorioOrtopedic metodosCrud;

    public List<Ortopedic> getAll(){
        return metodosCrud.getAll();
    }

    public Optional<Ortopedic> getOrtopedic(int id) {
        return metodosCrud.getOrtopedic(id);
    }

    public Ortopedic save(Ortopedic ortopedic){
        if(ortopedic.getId()==null){
            return metodosCrud.save(ortopedic);
        }else{
            Optional<Ortopedic> example=metodosCrud.getOrtopedic(ortopedic.getId());
            if(example.isEmpty()){
                return metodosCrud.save(ortopedic);
            }else{
                return ortopedic;
            }
        }
    }

    public Ortopedic update(Ortopedic ortopedic){
        if(ortopedic.getId()!=null){
            Optional<Ortopedic> e=metodosCrud.getOrtopedic(ortopedic.getId());
            if(!e.isEmpty()){
                if(ortopedic.getName()!=null){
                    e.get().setName(ortopedic.getName());
                }
                if(ortopedic.getBrand()!=null){
                    e.get().setBrand(ortopedic.getBrand());
                }
                if(ortopedic.getYear()!=null){
                    e.get().setYear(ortopedic.getYear());
                }
                if(ortopedic.getDescription()!=null){
                    e.get().setDescription(ortopedic.getDescription());
                }
                if(ortopedic.getCategory()!=null){
                    e.get().setCategory(ortopedic.getCategory());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return ortopedic;
            }
        }else{
            return ortopedic;
        }
    }


    public boolean deleteOrtopedic(int id) {
        Boolean aBoolean = getOrtopedic(id).map(ortopedic -> {
            metodosCrud.delete(ortopedic);
            return true;
        }).orElse(false);
        return aBoolean;
    }
    
}
