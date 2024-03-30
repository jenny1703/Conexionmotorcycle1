/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.model;

import com.mycompany.conexionmotorcycle1.entities.PrivilegiosPoorUsuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hortz
 */
@Local
public interface PrivilegiosPoorUsuarioFacadeLocal {

    void create(PrivilegiosPoorUsuario privilegiosPoorUsuario);

    void edit(PrivilegiosPoorUsuario privilegiosPoorUsuario);

    void remove(PrivilegiosPoorUsuario privilegiosPoorUsuario);

    PrivilegiosPoorUsuario find(Object id);

    List<PrivilegiosPoorUsuario> findAll();

    List<PrivilegiosPoorUsuario> findRange(int[] range);

    int count();
    
}
