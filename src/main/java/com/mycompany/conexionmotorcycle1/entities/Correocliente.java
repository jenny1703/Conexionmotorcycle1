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
@Table(name = "correocliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Correocliente.findAll", query = "SELECT c FROM Correocliente c"),
    @NamedQuery(name = "Correocliente.findByIdCorreoCliente", query = "SELECT c FROM Correocliente c WHERE c.idCorreoCliente = :idCorreoCliente"),
    @NamedQuery(name = "Correocliente.findByCorreoCliente", query = "SELECT c FROM Correocliente c WHERE c.correoCliente = :correoCliente")})
public class Correocliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCorreoCliente")
    private Integer idCorreoCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Correo_Cliente")
    private String correoCliente;
    @JoinColumn(name = "cliente_idCliente", referencedColumnName = "idCliente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cliente clienteidCliente;

    public Correocliente() {
    }

    public Correocliente(Integer idCorreoCliente) {
        this.idCorreoCliente = idCorreoCliente;
    }

    public Correocliente(Integer idCorreoCliente, String correoCliente) {
        this.idCorreoCliente = idCorreoCliente;
        this.correoCliente = correoCliente;
    }

    public Integer getIdCorreoCliente() {
        return idCorreoCliente;
    }

    public void setIdCorreoCliente(Integer idCorreoCliente) {
        this.idCorreoCliente = idCorreoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public Cliente getClienteidCliente() {
        return clienteidCliente;
    }

    public void setClienteidCliente(Cliente clienteidCliente) {
        this.clienteidCliente = clienteidCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCorreoCliente != null ? idCorreoCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Correocliente)) {
            return false;
        }
        Correocliente other = (Correocliente) object;
        if ((this.idCorreoCliente == null && other.idCorreoCliente != null) || (this.idCorreoCliente != null && !this.idCorreoCliente.equals(other.idCorreoCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.Correocliente[ idCorreoCliente=" + idCorreoCliente + " ]";
    }
    
}
