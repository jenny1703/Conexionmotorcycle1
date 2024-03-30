/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.model;

import com.mycompany.conexionmotorcycle1.entities.OrdentrabajoServicioHasProductos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hortz
 */
@Local
public interface OrdentrabajoServicioHasProductosFacadeLocal {

    void create(OrdentrabajoServicioHasProductos ordentrabajoServicioHasProductos);

    void edit(OrdentrabajoServicioHasProductos ordentrabajoServicioHasProductos);

    void remove(OrdentrabajoServicioHasProductos ordentrabajoServicioHasProductos);

    OrdentrabajoServicioHasProductos find(Object id);

    List<OrdentrabajoServicioHasProductos> findAll();

    List<OrdentrabajoServicioHasProductos> findRange(int[] range);

    int count();
    
}
