/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.entities;

import java.io.Serializable;
import javax.persistence.Basic;
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
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hortz
 */
@Entity
@Table(name = "movilusuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movilusuario.findAll", query = "SELECT m FROM Movilusuario m"),
    @NamedQuery(name = "Movilusuario.findByIdmovilUsuario", query = "SELECT m FROM Movilusuario m WHERE m.idmovilUsuario = :idmovilUsuario"),
    @NamedQuery(name = "Movilusuario.findByTelefonoMovilUsuario", query = "SELECT m FROM Movilusuario m WHERE m.telefonoMovilUsuario = :telefonoMovilUsuario")})
public class Movilusuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmovilUsuario")
    private Integer idmovilUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "telefonoMovilUsuario")
    private String telefonoMovilUsuario;
    @JoinColumn(name = "usuario_idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioidUsuario;

    public Movilusuario() {
    }

    public Movilusuario(Integer idmovilUsuario) {
        this.idmovilUsuario = idmovilUsuario;
    }

    public Movilusuario(Integer idmovilUsuario, String telefonoMovilUsuario) {
        this.idmovilUsuario = idmovilUsuario;
        this.telefonoMovilUsuario = telefonoMovilUsuario;
    }

    public Integer getIdmovilUsuario() {
        return idmovilUsuario;
    }

    public void setIdmovilUsuario(Integer idmovilUsuario) {
        this.idmovilUsuario = idmovilUsuario;
    }

    public String getTelefonoMovilUsuario() {
        return telefonoMovilUsuario;
    }

    public void setTelefonoMovilUsuario(String telefonoMovilUsuario) {
        this.telefonoMovilUsuario = telefonoMovilUsuario;
    }

    public Usuario getUsuarioidUsuario() {
        return usuarioidUsuario;
    }

    public void setUsuarioidUsuario(Usuario usuarioidUsuario) {
        this.usuarioidUsuario = usuarioidUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmovilUsuario != null ? idmovilUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movilusuario)) {
            return false;
        }
        Movilusuario other = (Movilusuario) object;
        if ((this.idmovilUsuario == null && other.idmovilUsuario != null) || (this.idmovilUsuario != null && !this.idmovilUsuario.equals(other.idmovilUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.Movilusuario[ idmovilUsuario=" + idmovilUsuario + " ]";
    }
    
}
