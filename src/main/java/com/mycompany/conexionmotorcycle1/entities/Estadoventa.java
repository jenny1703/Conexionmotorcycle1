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
@Table(name = "estadoventa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estadoventa.findAll", query = "SELECT e FROM Estadoventa e"),
    @NamedQuery(name = "Estadoventa.findByIdestadoVenta", query = "SELECT e FROM Estadoventa e WHERE e.idestadoVenta = :idestadoVenta"),
    @NamedQuery(name = "Estadoventa.findByNombre", query = "SELECT e FROM Estadoventa e WHERE e.nombre = :nombre")})
public class Estadoventa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idestadoVenta")
    private Integer idestadoVenta;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "estadoVentaidestadoVenta", fetch = FetchType.LAZY)
    private Collection<Ordenventa> ordenventaCollection;

    public Estadoventa() {
    }

    public Estadoventa(Integer idestadoVenta) {
        this.idestadoVenta = idestadoVenta;
    }

    public Estadoventa(Integer idestadoVenta, String nombre) {
        this.idestadoVenta = idestadoVenta;
        this.nombre = nombre;
    }

    public Integer getIdestadoVenta() {
        return idestadoVenta;
    }

    public void setIdestadoVenta(Integer idestadoVenta) {
        this.idestadoVenta = idestadoVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<Ordenventa> getOrdenventaCollection() {
        return ordenventaCollection;
    }

    public void setOrdenventaCollection(Collection<Ordenventa> ordenventaCollection) {
        this.ordenventaCollection = ordenventaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idestadoVenta != null ? idestadoVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadoventa)) {
            return false;
        }
        Estadoventa other = (Estadoventa) object;
        if ((this.idestadoVenta == null && other.idestadoVenta != null) || (this.idestadoVenta != null && !this.idestadoVenta.equals(other.idestadoVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.Estadoventa[ idestadoVenta=" + idestadoVenta + " ]";
    }
    
}
