/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "servicio_has_ordentrabajo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServicioHasOrdentrabajo.findAll", query = "SELECT s FROM ServicioHasOrdentrabajo s"),
    @NamedQuery(name = "ServicioHasOrdentrabajo.findByIdServicioordenTrabajo", query = "SELECT s FROM ServicioHasOrdentrabajo s WHERE s.idServicioordenTrabajo = :idServicioordenTrabajo"),
    @NamedQuery(name = "ServicioHasOrdentrabajo.findByPreciohasordenTrabajo", query = "SELECT s FROM ServicioHasOrdentrabajo s WHERE s.preciohasordenTrabajo = :preciohasordenTrabajo")})
public class ServicioHasOrdentrabajo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idServicio_ordenTrabajo")
    private Integer idServicioordenTrabajo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio_has_ordenTrabajo")
    private BigDecimal preciohasordenTrabajo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idServicioordenTrabajo", fetch = FetchType.LAZY)
    private Collection<OrdentrabajoServicioHasProductos> ordentrabajoServicioHasProductosCollection;
    @JoinColumn(name = "servicio_idservicio", referencedColumnName = "idservicio")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Servicio servicioIdservicio;
    @JoinColumn(name = "ordenTrabajo_idordenTrabajo", referencedColumnName = "idordenTrabajo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ordentrabajo ordenTrabajoidordenTrabajo;

    public ServicioHasOrdentrabajo() {
    }

    public ServicioHasOrdentrabajo(Integer idServicioordenTrabajo) {
        this.idServicioordenTrabajo = idServicioordenTrabajo;
    }

    public ServicioHasOrdentrabajo(Integer idServicioordenTrabajo, BigDecimal preciohasordenTrabajo) {
        this.idServicioordenTrabajo = idServicioordenTrabajo;
        this.preciohasordenTrabajo = preciohasordenTrabajo;
    }

    public Integer getIdServicioordenTrabajo() {
        return idServicioordenTrabajo;
    }

    public void setIdServicioordenTrabajo(Integer idServicioordenTrabajo) {
        this.idServicioordenTrabajo = idServicioordenTrabajo;
    }

    public BigDecimal getPreciohasordenTrabajo() {
        return preciohasordenTrabajo;
    }

    public void setPreciohasordenTrabajo(BigDecimal preciohasordenTrabajo) {
        this.preciohasordenTrabajo = preciohasordenTrabajo;
    }

    @XmlTransient
    public Collection<OrdentrabajoServicioHasProductos> getOrdentrabajoServicioHasProductosCollection() {
        return ordentrabajoServicioHasProductosCollection;
    }

    public void setOrdentrabajoServicioHasProductosCollection(Collection<OrdentrabajoServicioHasProductos> ordentrabajoServicioHasProductosCollection) {
        this.ordentrabajoServicioHasProductosCollection = ordentrabajoServicioHasProductosCollection;
    }

    public Servicio getServicioIdservicio() {
        return servicioIdservicio;
    }

    public void setServicioIdservicio(Servicio servicioIdservicio) {
        this.servicioIdservicio = servicioIdservicio;
    }

    public Ordentrabajo getOrdenTrabajoidordenTrabajo() {
        return ordenTrabajoidordenTrabajo;
    }

    public void setOrdenTrabajoidordenTrabajo(Ordentrabajo ordenTrabajoidordenTrabajo) {
        this.ordenTrabajoidordenTrabajo = ordenTrabajoidordenTrabajo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idServicioordenTrabajo != null ? idServicioordenTrabajo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServicioHasOrdentrabajo)) {
            return false;
        }
        ServicioHasOrdentrabajo other = (ServicioHasOrdentrabajo) object;
        if ((this.idServicioordenTrabajo == null && other.idServicioordenTrabajo != null) || (this.idServicioordenTrabajo != null && !this.idServicioordenTrabajo.equals(other.idServicioordenTrabajo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.ServicioHasOrdentrabajo[ idServicioordenTrabajo=" + idServicioordenTrabajo + " ]";
    }
    
}
