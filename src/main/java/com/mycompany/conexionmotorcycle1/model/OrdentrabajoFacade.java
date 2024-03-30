/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.model;

import com.mycompany.conexionmotorcycle1.entities.Ordentrabajo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author hortz
 */
@Stateless
public class OrdentrabajoFacade extends AbstractFacade<Ordentrabajo> implements OrdentrabajoFacadeLocal {

    @PersistenceContext(unitName = "com.mycompany_Conexionmotorcycle1_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public OrdentrabajoFacade() {
        super(Ordentrabajo.class);
    }

    @Override
    public Ordentrabajo findByIdServicioordenTrabajo(int ai_idServicioordenTrabajo) {
        Query query = em.createNamedQuery("ServicioHasOrdentrabajo.findByIdServicioordenTrabajo");
        List<Ordentrabajo> llot_ordenTrabajo = query.setParameter("idServicioordenTrabajo", ai_idServicioordenTrabajo).getResultList();

        if (llot_ordenTrabajo != null && !llot_ordenTrabajo.isEmpty()) {
            for (Ordentrabajo lot_actual : llot_ordenTrabajo) {
                if (lot_actual != null) {
                    return lot_actual;
                }
            }
        }
        return null;
    }

}
