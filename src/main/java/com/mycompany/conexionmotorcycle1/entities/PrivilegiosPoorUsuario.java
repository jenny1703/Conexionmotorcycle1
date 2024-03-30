/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hortz
 */
@Entity
@Table(name = "privilegios_poor_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PrivilegiosPoorUsuario.findAll", query = "SELECT p FROM PrivilegiosPoorUsuario p"),
    @NamedQuery(name = "PrivilegiosPoorUsuario.findByIdPrivilegiosporUsuario", query = "SELECT p FROM PrivilegiosPoorUsuario p WHERE p.idPrivilegiosporUsuario = :idPrivilegiosporUsuario"),
    @NamedQuery(name = "PrivilegiosPoorUsuario.findByFechaAsignaci\u00f3n", query = "SELECT p FROM PrivilegiosPoorUsuario p WHERE p.fechaAsignaci\u00f3n = :fechaAsignaci\u00f3n")})
public class PrivilegiosPoorUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPrivilegios_por_Usuario")
    private Integer idPrivilegiosporUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaAsignaci\u00f3n")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAsignación;
    @JoinColumn(name = "usuario_idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioidUsuario;
    @JoinColumn(name = "privilegios_idPrivilegios", referencedColumnName = "idPrevilegios")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Privilegios privilegiosidPrivilegios;

    public PrivilegiosPoorUsuario() {
    }

    public PrivilegiosPoorUsuario(Integer idPrivilegiosporUsuario) {
        this.idPrivilegiosporUsuario = idPrivilegiosporUsuario;
    }

    public PrivilegiosPoorUsuario(Integer idPrivilegiosporUsuario, Date fechaAsignación) {
        this.idPrivilegiosporUsuario = idPrivilegiosporUsuario;
        this.fechaAsignación = fechaAsignación;
    }

    public Integer getIdPrivilegiosporUsuario() {
        return idPrivilegiosporUsuario;
    }

    public void setIdPrivilegiosporUsuario(Integer idPrivilegiosporUsuario) {
        this.idPrivilegiosporUsuario = idPrivilegiosporUsuario;
    }

    public Date getFechaAsignación() {
        return fechaAsignación;
    }

    public void setFechaAsignación(Date fechaAsignación) {
        this.fechaAsignación = fechaAsignación;
    }

    public Usuario getUsuarioidUsuario() {
        return usuarioidUsuario;
    }

    public void setUsuarioidUsuario(Usuario usuarioidUsuario) {
        this.usuarioidUsuario = usuarioidUsuario;
    }

    public Privilegios getPrivilegiosidPrivilegios() {
        return privilegiosidPrivilegios;
    }

    public void setPrivilegiosidPrivilegios(Privilegios privilegiosidPrivilegios) {
        this.privilegiosidPrivilegios = privilegiosidPrivilegios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrivilegiosporUsuario != null ? idPrivilegiosporUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrivilegiosPoorUsuario)) {
            return false;
        }
        PrivilegiosPoorUsuario other = (PrivilegiosPoorUsuario) object;
        if ((this.idPrivilegiosporUsuario == null && other.idPrivilegiosporUsuario != null) || (this.idPrivilegiosporUsuario != null && !this.idPrivilegiosporUsuario.equals(other.idPrivilegiosporUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.PrivilegiosPoorUsuario[ idPrivilegiosporUsuario=" + idPrivilegiosporUsuario + " ]";
    }
    
}
