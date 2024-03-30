/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.controller;

import com.mycompany.conexionmotorcycle1.entities.Servicio;
import com.mycompany.conexionmotorcycle1.model.ServicioFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named(value = "controllerServicio")
@SessionScoped
public class ControllerServicio implements Serializable {

    private Servicio ser;
     FacesContext contexto;
     FacesMessage fm = null; 
    
    @EJB
    private ServicioFacadeLocal srl;
    
    public ControllerServicio() {
    }

    public Servicio getSer() {
        return ser;
    }

    public void setSer(Servicio ser) {
        this.ser = ser;
    }
    
    public List<Servicio> getAll(){
        
        try {
            return this.srl.findAll();
        } catch (Exception e) {
        }
    return null; 
    }
     public void crearServiciop1(){
         ser = new Servicio();
    contexto = FacesContext.getCurrentInstance();
        try {
           contexto.getExternalContext().redirect("crearservicio.xhtml");
        } catch (Exception e) {
        }
    }
    
    public void crearServicio (){
       contexto = FacesContext.getCurrentInstance();
        try {
            this.srl.create(ser);
            fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "El registro se creo correctamente", "MSG_INFO");
        } catch (Exception e) {
        fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error ingresando registro, intentelo nuevamente", "MSG_INFO");
        }
        contexto.addMessage(null, fm);
        this.ser = new Servicio();
    }
    
    public void eliminarServicio(Servicio ser){
    contexto = FacesContext.getCurrentInstance();
    this.ser=ser;
        try {
            this.srl.remove(ser);
            fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "El registro se elimino correctamente", "MSG_INFO");
        } catch (Exception e) {
        fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al eliminar registro , intentelo nuevamente", "MSG_INFO");
        }
        contexto.addMessage(null, fm);
    }
    
       public void actualizarServiciop1(Servicio ser){
    contexto = FacesContext.getCurrentInstance();
    this.ser=ser;
        try {
           contexto.getExternalContext().redirect("crearservicio.xhtml");
        } catch (Exception e) {
        }
    }
       public void actualizarServicio(){
        contexto = FacesContext.getCurrentInstance();
        try {
            this.srl.edit(ser);
            fm = new FacesMessage(FacesMessage.SEVERITY_INFO, "El registro ha actualizado correctamente", "MSG_INFO");
        } catch (Exception e) {
        fm = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error al actualizar el registro,intentelo nuevamente", "MSG_INFO");
        }
        contexto.addMessage(null, fm);
    }
       
    }
        

