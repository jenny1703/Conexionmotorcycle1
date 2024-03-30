/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.model;

import com.mycompany.conexionmotorcycle1.entities.Correocliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hortz
 */
@Stateless
public class CorreoclienteFacade extends AbstractFacade<Correocliente> implements CorreoclienteFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_Conexionmotorcycle1_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CorreoclienteFacade() {
        super(Correocliente.class);
    }
    
}
