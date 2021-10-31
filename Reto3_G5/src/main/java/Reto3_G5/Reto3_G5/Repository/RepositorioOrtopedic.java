/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_G5.Reto3_G5.Repository;

import Reto3_G5.Reto3_G5.Model.Ortopedic;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto3_G5.Reto3_G5.Interface.InterfaceOrtopedic;
/**
 *
 * @author Miguel Toquica
 */

@Repository
public class RepositorioOrtopedic {
    
    @Autowired
    private InterfaceOrtopedic crud;

    public List<Ortopedic> getAll(){
        return (List<Ortopedic>) crud.findAll();
    }

    public Optional<Ortopedic> getOrtopedic(int id){
        return crud.findById(id);
    }

    public Ortopedic save(Ortopedic ortopedic){
        return crud.save(ortopedic);
    }
    public void delete(Ortopedic ortopedic){
        crud.delete(ortopedic);
    }
    
}
