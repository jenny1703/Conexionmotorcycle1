/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.controller;

import com.mycompany.conexionmotorcycle1.entities.Ordentrabajo;
import com.mycompany.conexionmotorcycle1.entities.Servicio;
import com.mycompany.conexionmotorcycle1.entities.ServicioHasOrdentrabajo;
import com.mycompany.conexionmotorcycle1.model.OrdentrabajoFacadeLocal;
import com.mycompany.conexionmotorcycle1.model.ServicioFacadeLocal;
import com.mycompany.conexionmotorcycle1.model.ServicioHasOrdentrabajoFacadeLocal;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

/**
 *
 * @author hortz
 */
@Named(value = "controllerOrden")
@ViewScoped
public class ControllerOrden implements Serializable {
    
    private ServicioHasOrdentrabajo isot_servicioOrdenTrabajo;
    private Servicio is_servicio;
    private List<SelectItem> listaServicio;
    private List<Servicio> servicios;
    private FacesContext contexto;
    private FacesMessage fm;
    @EJB
    private ServicioHasOrdentrabajoFacadeLocal isotfl_servicioOrdenTrabajoEJB;
    @EJB
    private ServicioFacadeLocal isfl_servicioEJB;
    @EJB
    private OrdentrabajoFacadeLocal iotfl_ordenTrabajoEJB;
    
    public ControllerOrden() {
    }
    
    public ServicioHasOrdentrabajo getSor() {
        if (isot_servicioOrdenTrabajo == null) {
            isot_servicioOrdenTrabajo = new ServicioHasOrdentrabajo();
        }
        
        return isot_servicioOrdenTrabajo;
    }
    
    public void setSor(ServicioHasOrdentrabajo sor) {
        this.isot_servicioOrdenTrabajo = sor;
    }
    
    public Servicio getSer() {
        if (is_servicio == null) {
            is_servicio = new Servicio();
        }
        
        return is_servicio;
    }
    
    public void setSer(Servicio ser) {
        this.is_servicio = ser;
    }
    
    public List<Servicio> getServicios() {
        return servicios;
    }
    
    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
    
    public List<SelectItem> getListaServicio() {
        
        try {
            List<Servicio> localServicios = this.isfl_servicioEJB.findAll();
            listaServicio = new ArrayList<>();
            
            if (localServicios != null) {
                setServicios(localServicios);
                
                for (Servicio var : localServicios) {
                    SelectItem item = new SelectItem(var.getIdservicio(), var.getNombreServicio());
                    listaServicio.add(item);
                }
                return listaServicio;
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void setListaServicio(List<SelectItem> ListaServicio) {
        this.listaServicio = ListaServicio;
    }
    
    public void crearOrden() {
        contexto = FacesContext.getCurrentInstance();
        try {
            //validacion Servicio
            {
                Servicio servicioActual = getSer();
                
                if (servicioActual != null) {
                    Integer idServicioActual = servicioActual.getIdservicio();
                    
                    if (idServicioActual != null) {
                        List<Servicio> localServicios = getServicios();
                        for (Servicio iterador : localServicios) {
                            if (iterador != null && iterador.getIdservicio().intValue() == idServicioActual.intValue()) {
                                servicioActual = iterador;
                            }
                        }
                    }
                    
                    isot_servicioOrdenTrabajo.setServicioIdservicio(servicioActual);
                    
                }
            }
            //validacion OrdenTrabajo
            {
                Ordentrabajo lot_ordenTrabajo;
                
                lot_ordenTrabajo = new Ordentrabajo();
                
                lot_ordenTrabajo.setIdordenTrabajo(isot_servicioOrdenTrabajo.getIdServicioordenTrabajo());// = this.iotfl_ordenTrabajoEJB.findByIdServicioordenTrabajo(isot_servicioOrdenTrabajo.getIdServicioordenTrabajo());
                
                if (lot_ordenTrabajo != null) {
                    isot_servicioOrdenTrabajo.setOrdenTrabajoidordenTrabajo(lot_ordenTrabajo);
                }
            }
            
            this.isotfl_servicioOrdenTrabajoEJB.create(isot_servicioOrdenTrabajo);
            
            fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "El servicio fue agregado correctamente", "MSG_INFO");
        } catch (Exception e) {
            fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "El servicio no se agrego correctamente", "MSG_ERROR");
        }
        contexto.addMessage(null, fm);
        isot_servicioOrdenTrabajo = new ServicioHasOrdentrabajo();
    }
    
}
