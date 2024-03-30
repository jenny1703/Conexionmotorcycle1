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
@Table(name = "privilegios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Privilegios.findAll", query = "SELECT p FROM Privilegios p"),
    @NamedQuery(name = "Privilegios.findByIdPrevilegios", query = "SELECT p FROM Privilegios p WHERE p.idPrevilegios = :idPrevilegios"),
    @NamedQuery(name = "Privilegios.findByNombrePivilegios", query = "SELECT p FROM Privilegios p WHERE p.nombrePivilegios = :nombrePivilegios")})
public class Privilegios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPrevilegios")
    private Integer idPrevilegios;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombrePivilegios")
    private String nombrePivilegios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "privilegiosidPrivilegios", fetch = FetchType.LAZY)
    private Collection<PrivilegiosPoorUsuario> privilegiosPoorUsuarioCollection;

    public Privilegios() {
    }

    public Privilegios(Integer idPrevilegios) {
        this.idPrevilegios = idPrevilegios;
    }

    public Privilegios(Integer idPrevilegios, String nombrePivilegios) {
        this.idPrevilegios = idPrevilegios;
        this.nombrePivilegios = nombrePivilegios;
    }

    public Integer getIdPrevilegios() {
        return idPrevilegios;
    }

    public void setIdPrevilegios(Integer idPrevilegios) {
        this.idPrevilegios = idPrevilegios;
    }

    public String getNombrePivilegios() {
        return nombrePivilegios;
    }

    public void setNombrePivilegios(String nombrePivilegios) {
        this.nombrePivilegios = nombrePivilegios;
    }

    @XmlTransient
    public Collection<PrivilegiosPoorUsuario> getPrivilegiosPoorUsuarioCollection() {
        return privilegiosPoorUsuarioCollection;
    }

    public void setPrivilegiosPoorUsuarioCollection(Collection<PrivilegiosPoorUsuario> privilegiosPoorUsuarioCollection) {
        this.privilegiosPoorUsuarioCollection = privilegiosPoorUsuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrevilegios != null ? idPrevilegios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Privilegios)) {
            return false;
        }
        Privilegios other = (Privilegios) object;
        if ((this.idPrevilegios == null && other.idPrevilegios != null) || (this.idPrevilegios != null && !this.idPrevilegios.equals(other.idPrevilegios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.Privilegios[ idPrevilegios=" + idPrevilegios + " ]";
    }
    
}
