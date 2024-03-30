/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.model;

import com.mycompany.conexionmotorcycle1.entities.Correocliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hortz
 */
@Local
public interface CorreoclienteFacadeLocal {

    void create(Correocliente correocliente);

    void edit(Correocliente correocliente);

    void remove(Correocliente correocliente);

    Correocliente find(Object id);

    List<Correocliente> findAll();

    List<Correocliente> findRange(int[] range);

    int count();
    
}
