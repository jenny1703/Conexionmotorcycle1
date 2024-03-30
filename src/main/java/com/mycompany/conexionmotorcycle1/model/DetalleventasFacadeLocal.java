/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.model;

import com.mycompany.conexionmotorcycle1.entities.Detalleventas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hortz
 */
@Local
public interface DetalleventasFacadeLocal {

    void create(Detalleventas detalleventas);

    void edit(Detalleventas detalleventas);

    void remove(Detalleventas detalleventas);

    Detalleventas find(Object id);

    List<Detalleventas> findAll();

    List<Detalleventas> findRange(int[] range);

    int count();
    
}
