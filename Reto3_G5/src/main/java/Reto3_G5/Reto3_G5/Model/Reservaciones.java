/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_G5.Reto3_G5.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Miguel Toquica
 */
@Entity
@Table(name = "reservation")
/**
 * Clase principal Reservation
 */
public class Reservaciones implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
/**
     * Variable id
     */
    private Integer idReservation;
/**
     * Variable fecha de inicio
     */
    private Date startDate;
/**
     * Variable fecha de entrega
     */
    private Date devolutionDate;
/**
     * Variable fija status
     */
    private String status="created";
    /**
     * Relacion Muchos a Uno de Reservation a Ortopedic
     */
    @ManyToOne
    @JoinColumn(name = "id")
    @JsonIgnoreProperties("reservations")
    private Ortopedic ortopedic;
/**
     * Relacion Muchos a Uno de Reservation a IdClient
     */
    @ManyToOne
    @JoinColumn(name = "idClient")
    @JsonIgnoreProperties({"reservations","messages"})
    private Cliente client;
/**
     * Variable Score
     */
    private String score; 

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }
/**
     * 
     * @return 
     */

    public Date getStartDate() {
        return startDate;
    }
/**
     * 
     * @param startDate 
     */

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getDevolutionDate() {
        return devolutionDate;
    }
/**
     * 
     * @param devolutionDate 
     */

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public String getStatus() {
        return status;
    }
/**
     * 
     * @param status
     */

    public void setStatus(String status) {
        this.status = status;
    }
/**
     * 
     * @return 
     */

    public Ortopedic getOrtopedic() {
        return ortopedic;
    }

    public void setOrtopedic(Ortopedic ortopedic) {
        this.ortopedic = ortopedic;
    }

    public Cliente getClient() {
        return client;
    }
/**
     * 
     * @param Client
     */

    public void setClient(Cliente client) {
        this.client = client;
    }
/**
     * 
     * @return 
     */

    public String getScore() {
        return score;
    }
/**
     * 
     * @param Score
     */

    public void setScore(String score) {
        this.score = score;
    }   
}
