/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto3_G5.Reto3_G5.Interface;

;
import Reto3_G5.Reto3_G5.Model.Reservaciones;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Miguel Toquica
 */
public interface InterfaceReservaciones  extends CrudRepository<Reservaciones,Integer>{
      // @Query("select c.client, COUNT(c.client) from Reservation AS c group by c.client order by COUNT(c.client) desc")

  public List<Reservaciones> findAllByStatus (String status); 
	    
	    public List<Reservaciones> findAllByStartDateAfterAndStartDateBefore(Date dateOne, Date dateTwo);
	    
	    // SELECT clientid, COUNT(*) AS total FROM reservacion group by clientid order by desc;
	    @Query ("SELECT c.client, COUNT(c.client) from Reservaciones AS c group by c.client order by COUNT(c.client)desc")
	    public List<Object[]> countTotalReservacionesByCliente();
   

}
