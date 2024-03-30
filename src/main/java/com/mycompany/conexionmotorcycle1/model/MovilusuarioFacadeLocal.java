/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.model;

import com.mycompany.conexionmotorcycle1.entities.Movilusuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hortz
 */
@Local
public interface MovilusuarioFacadeLocal {

    void create(Movilusuario movilusuario);

    void edit(Movilusuario movilusuario);

    void remove(Movilusuario movilusuario);

    Movilusuario find(Object id);

    List<Movilusuario> findAll();

    List<Movilusuario> findRange(int[] range);

    int count();
    
}
