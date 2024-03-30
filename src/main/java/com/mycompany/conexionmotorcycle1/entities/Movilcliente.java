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
@Table(name = "movilcliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movilcliente.findAll", query = "SELECT m FROM Movilcliente m"),
    @NamedQuery(name = "Movilcliente.findByIdMovilCliente", query = "SELECT m FROM Movilcliente m WHERE m.idMovilCliente = :idMovilCliente"),
    @NamedQuery(name = "Movilcliente.findByTelefonoMovilCliente", query = "SELECT m FROM Movilcliente m WHERE m.telefonoMovilCliente = :telefonoMovilCliente")})
public class Movilcliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idMovilCliente")
    private Integer idMovilCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "telefonoMovilCliente")
    private String telefonoMovilCliente;
    @JoinColumn(name = "cliente_idCliente", referencedColumnName = "idCliente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cliente clienteidCliente;

    public Movilcliente() {
    }

    public Movilcliente(Integer idMovilCliente) {
        this.idMovilCliente = idMovilCliente;
    }

    public Movilcliente(Integer idMovilCliente, String telefonoMovilCliente) {
        this.idMovilCliente = idMovilCliente;
        this.telefonoMovilCliente = telefonoMovilCliente;
    }

    public Integer getIdMovilCliente() {
        return idMovilCliente;
    }

    public void setIdMovilCliente(Integer idMovilCliente) {
        this.idMovilCliente = idMovilCliente;
    }

    public String getTelefonoMovilCliente() {
        return telefonoMovilCliente;
    }

    public void setTelefonoMovilCliente(String telefonoMovilCliente) {
        this.telefonoMovilCliente = telefonoMovilCliente;
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
        hash += (idMovilCliente != null ? idMovilCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movilcliente)) {
            return false;
        }
        Movilcliente other = (Movilcliente) object;
        if ((this.idMovilCliente == null && other.idMovilCliente != null) || (this.idMovilCliente != null && !this.idMovilCliente.equals(other.idMovilCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.Movilcliente[ idMovilCliente=" + idMovilCliente + " ]";
    }
    
}
