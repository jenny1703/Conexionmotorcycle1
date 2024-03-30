/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.model;

import com.mycompany.conexionmotorcycle1.entities.Movilcliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hortz
 */
@Local
public interface MovilclienteFacadeLocal {

    void create(Movilcliente movilcliente);

    void edit(Movilcliente movilcliente);

    void remove(Movilcliente movilcliente);

    Movilcliente find(Object id);

    List<Movilcliente> findAll();

    List<Movilcliente> findRange(int[] range);

    int count();
    
}
