/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.model;

import com.mycompany.conexionmotorcycle1.entities.Estadoventa;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hortz
 */
@Local
public interface EstadoventaFacadeLocal {

    void create(Estadoventa estadoventa);

    void edit(Estadoventa estadoventa);

    void remove(Estadoventa estadoventa);

    Estadoventa find(Object id);

    List<Estadoventa> findAll();

    List<Estadoventa> findRange(int[] range);

    int count();
    
}
