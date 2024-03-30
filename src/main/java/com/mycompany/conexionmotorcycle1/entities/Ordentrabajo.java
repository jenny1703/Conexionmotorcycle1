/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hortz
 */
@Entity
@Table(name = "ordentrabajo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordentrabajo.findAll", query = "SELECT o FROM Ordentrabajo o"),
    @NamedQuery(name = "Ordentrabajo.findByIdordenTrabajo", query = "SELECT o FROM Ordentrabajo o WHERE o.idordenTrabajo = :idordenTrabajo"),
    @NamedQuery(name = "Ordentrabajo.findByNumeroOrdenTrabajo", query = "SELECT o FROM Ordentrabajo o WHERE o.numeroOrdenTrabajo = :numeroOrdenTrabajo")})
public class Ordentrabajo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idordenTrabajo")
    private Integer idordenTrabajo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numeroOrdenTrabajo")
    private long numeroOrdenTrabajo;
    @JoinColumn(name = "ordenVenta_idVenta", referencedColumnName = "idVenta")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ordenventa ordenVentaidVenta;
    @JoinColumn(name = "cita_idcita", referencedColumnName = "idcita")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cita citaIdcita;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ordenTrabajoidordenTrabajo", fetch = FetchType.LAZY)
    private Collection<ServicioHasOrdentrabajo> servicioHasOrdentrabajoCollection;

    public Ordentrabajo() {
    }

    public Ordentrabajo(Integer idordenTrabajo) {
        this.idordenTrabajo = idordenTrabajo;
    }

    public Ordentrabajo(Integer idordenTrabajo, long numeroOrdenTrabajo) {
        this.idordenTrabajo = idordenTrabajo;
        this.numeroOrdenTrabajo = numeroOrdenTrabajo;
    }

    public Integer getIdordenTrabajo() {
        return idordenTrabajo;
    }

    public void setIdordenTrabajo(Integer idordenTrabajo) {
        this.idordenTrabajo = idordenTrabajo;
    }

    public long getNumeroOrdenTrabajo() {
        return numeroOrdenTrabajo;
    }

    public void setNumeroOrdenTrabajo(long numeroOrdenTrabajo) {
        this.numeroOrdenTrabajo = numeroOrdenTrabajo;
    }

    public Ordenventa getOrdenVentaidVenta() {
        return ordenVentaidVenta;
    }

    public void setOrdenVentaidVenta(Ordenventa ordenVentaidVenta) {
        this.ordenVentaidVenta = ordenVentaidVenta;
    }

    public Cita getCitaIdcita() {
        return citaIdcita;
    }

    public void setCitaIdcita(Cita citaIdcita) {
        this.citaIdcita = citaIdcita;
    }

    @XmlTransient
    public Collection<ServicioHasOrdentrabajo> getServicioHasOrdentrabajoCollection() {
        return servicioHasOrdentrabajoCollection;
    }

    public void setServicioHasOrdentrabajoCollection(Collection<ServicioHasOrdentrabajo> servicioHasOrdentrabajoCollection) {
        this.servicioHasOrdentrabajoCollection = servicioHasOrdentrabajoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idordenTrabajo != null ? idordenTrabajo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordentrabajo)) {
            return false;
        }
        Ordentrabajo other = (Ordentrabajo) object;
        if ((this.idordenTrabajo == null && other.idordenTrabajo != null) || (this.idordenTrabajo != null && !this.idordenTrabajo.equals(other.idordenTrabajo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.Ordentrabajo[ idordenTrabajo=" + idordenTrabajo + " ]";
    }
    
}
