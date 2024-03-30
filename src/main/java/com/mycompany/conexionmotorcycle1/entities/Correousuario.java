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
@Table(name = "correousuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Correousuario.findAll", query = "SELECT c FROM Correousuario c"),
    @NamedQuery(name = "Correousuario.findByIdCorreoUsuario", query = "SELECT c FROM Correousuario c WHERE c.idCorreoUsuario = :idCorreoUsuario"),
    @NamedQuery(name = "Correousuario.findByCorreoUsuario", query = "SELECT c FROM Correousuario c WHERE c.correoUsuario = :correoUsuario")})
public class Correousuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCorreoUsuario")
    private Integer idCorreoUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "correo_Usuario")
    private String correoUsuario;
    @JoinColumn(name = "usuario_idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioidUsuario;

    public Correousuario() {
    }

    public Correousuario(Integer idCorreoUsuario) {
        this.idCorreoUsuario = idCorreoUsuario;
    }

    public Correousuario(Integer idCorreoUsuario, String correoUsuario) {
        this.idCorreoUsuario = idCorreoUsuario;
        this.correoUsuario = correoUsuario;
    }

    public Integer getIdCorreoUsuario() {
        return idCorreoUsuario;
    }

    public void setIdCorreoUsuario(Integer idCorreoUsuario) {
        this.idCorreoUsuario = idCorreoUsuario;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
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
        hash += (idCorreoUsuario != null ? idCorreoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Correousuario)) {
            return false;
        }
        Correousuario other = (Correousuario) object;
        if ((this.idCorreoUsuario == null && other.idCorreoUsuario != null) || (this.idCorreoUsuario != null && !this.idCorreoUsuario.equals(other.idCorreoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.Correousuario[ idCorreoUsuario=" + idCorreoUsuario + " ]";
    }
    
}
