/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.model;

import com.mycompany.conexionmotorcycle1.entities.Correousuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hortz
 */
@Local
public interface CorreousuarioFacadeLocal {

    void create(Correousuario correousuario);

    void edit(Correousuario correousuario);

    void remove(Correousuario correousuario);

    Correousuario find(Object id);

    List<Correousuario> findAll();

    List<Correousuario> findRange(int[] range);

    int count();
    
}
