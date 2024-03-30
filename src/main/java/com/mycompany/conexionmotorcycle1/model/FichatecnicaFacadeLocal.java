/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.model;

import com.mycompany.conexionmotorcycle1.entities.Fichatecnica;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hortz
 */
@Local
public interface FichatecnicaFacadeLocal {

    void create(Fichatecnica fichatecnica);

    void edit(Fichatecnica fichatecnica);

    void remove(Fichatecnica fichatecnica);

    Fichatecnica find(Object id);

    List<Fichatecnica> findAll();

    List<Fichatecnica> findRange(int[] range);

    int count();
    
}
