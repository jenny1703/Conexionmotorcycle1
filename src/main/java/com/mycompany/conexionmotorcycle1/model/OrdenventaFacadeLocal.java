/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.model;

import com.mycompany.conexionmotorcycle1.entities.Ordenventa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hortz
 */
@Local
public interface OrdenventaFacadeLocal {

    void create(Ordenventa ordenventa);

    void edit(Ordenventa ordenventa);

    void remove(Ordenventa ordenventa);

    Ordenventa find(Object id);

    List<Ordenventa> findAll();

    List<Ordenventa> findRange(int[] range);

    int count();
    
}
