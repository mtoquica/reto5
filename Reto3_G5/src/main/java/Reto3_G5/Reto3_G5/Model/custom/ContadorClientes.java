                                   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_G5.Reto3_G5.Model.custom;

import Reto3_G5.Reto3_G5.Model.Cliente;

/**
 *
 * @author PERSONALCASA
 */
public class ContadorClientes {
    //description amuont =descriptin es status 
    //count clientes 
    //en el servicio se arma el traigame todos 
    
    private Long total;
    private Cliente client;
    
    public ContadorClientes(Long total,Cliente client){
        this.total=total;
        this.client=client;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }
    
}
