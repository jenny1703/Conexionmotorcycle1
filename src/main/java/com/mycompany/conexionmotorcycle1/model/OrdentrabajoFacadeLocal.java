/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.model;

import com.mycompany.conexionmotorcycle1.entities.Ordentrabajo;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author hortz
 */
@Local
public interface OrdentrabajoFacadeLocal {

    void create(Ordentrabajo ordentrabajo);

    void edit(Ordentrabajo ordentrabajo);

    void remove(Ordentrabajo ordentrabajo);

    Ordentrabajo find(Object id);
    
    Ordentrabajo findByIdServicioordenTrabajo(int idServicioordenTrabajo);

    List<Ordentrabajo> findAll();

    List<Ordentrabajo> findRange(int[] range);

    int count();
    
}
