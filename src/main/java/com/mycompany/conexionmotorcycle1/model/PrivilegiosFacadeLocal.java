/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.model;

import com.mycompany.conexionmotorcycle1.entities.Privilegios;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hortz
 */
@Local
public interface PrivilegiosFacadeLocal {

    void create(Privilegios privilegios);

    void edit(Privilegios privilegios);

    void remove(Privilegios privilegios);

    Privilegios find(Object id);

    List<Privilegios> findAll();

    List<Privilegios> findRange(int[] range);

    int count();
    
}
