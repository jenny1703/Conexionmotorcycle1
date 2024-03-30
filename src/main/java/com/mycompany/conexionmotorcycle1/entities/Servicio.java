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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hortz
 */
@Entity
@Table(name = "servicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicio.findAll", query = "SELECT s FROM Servicio s"),
    @NamedQuery(name = "Servicio.findByIdservicio", query = "SELECT s FROM Servicio s WHERE s.idservicio = :idservicio"),
    @NamedQuery(name = "Servicio.findByNombreServicio", query = "SELECT s FROM Servicio s WHERE s.nombreServicio = :nombreServicio"),
    @NamedQuery(name = "Servicio.findByPrecioManoObraServicio", query = "SELECT s FROM Servicio s WHERE s.precioManoObraServicio = :precioManoObraServicio")})
public class Servicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idservicio")
    private Integer idservicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreServicio")
    private String nombreServicio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "precioManoObra_Servicio")
    private BigDecimal precioManoObraServicio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicioIdservicio", fetch = FetchType.LAZY)
    private Collection<ServicioHasOrdentrabajo> servicioHasOrdentrabajoCollection;

    public Servicio() {
    }

    public Servicio(Integer idservicio) {
        this.idservicio = idservicio;
    }

    public Servicio(Integer idservicio, String nombreServicio, BigDecimal precioManoObraServicio) {
        this.idservicio = idservicio;
        this.nombreServicio = nombreServicio;
        this.precioManoObraServicio = precioManoObraServicio;
    }

    public Integer getIdservicio() {
        return idservicio;
    }

    public void setIdservicio(Integer idservicio) {
        this.idservicio = idservicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public BigDecimal getPrecioManoObraServicio() {
        return precioManoObraServicio;
    }

    public void setPrecioManoObraServicio(BigDecimal precioManoObraServicio) {
        this.precioManoObraServicio = precioManoObraServicio;
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
        hash += (idservicio != null ? idservicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicio)) {
            return false;
        }
        Servicio other = (Servicio) object;
        if ((this.idservicio == null && other.idservicio != null) || (this.idservicio != null && !this.idservicio.equals(other.idservicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.Servicio[ idservicio=" + idservicio + " ]";
    }
    
}
