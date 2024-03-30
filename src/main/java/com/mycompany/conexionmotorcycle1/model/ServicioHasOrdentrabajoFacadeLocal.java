/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.model;

import com.mycompany.conexionmotorcycle1.entities.ServicioHasOrdentrabajo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hortz
 */
@Local
public interface ServicioHasOrdentrabajoFacadeLocal {

    void create(ServicioHasOrdentrabajo servicioHasOrdentrabajo);

    void edit(ServicioHasOrdentrabajo servicioHasOrdentrabajo);

    void remove(ServicioHasOrdentrabajo servicioHasOrdentrabajo);

    ServicioHasOrdentrabajo find(Object id);

    List<ServicioHasOrdentrabajo> findAll();

    List<ServicioHasOrdentrabajo> findRange(int[] range);

    int count();
    
}
