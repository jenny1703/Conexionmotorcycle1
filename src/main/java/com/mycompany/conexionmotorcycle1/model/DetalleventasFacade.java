/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.model;

import com.mycompany.conexionmotorcycle1.entities.Detalleventas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hortz
 */
@Stateless
public class DetalleventasFacade extends AbstractFacade<Detalleventas> implements DetalleventasFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_Conexionmotorcycle1_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetalleventasFacade() {
        super(Detalleventas.class);
    }
    
}
