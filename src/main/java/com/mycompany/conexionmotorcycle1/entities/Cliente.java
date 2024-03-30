/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hortz
 */
@Entity
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByIdCliente", query = "SELECT c FROM Cliente c WHERE c.idCliente = :idCliente"),
    @NamedQuery(name = "Cliente.findByNumeroDocumentoCliente", query = "SELECT c FROM Cliente c WHERE c.numeroDocumentoCliente = :numeroDocumentoCliente"),
    @NamedQuery(name = "Cliente.findByNombreCliente", query = "SELECT c FROM Cliente c WHERE c.nombreCliente = :nombreCliente"),
    @NamedQuery(name = "Cliente.findByApellidoCliente", query = "SELECT c FROM Cliente c WHERE c.apellidoCliente = :apellidoCliente"),
    @NamedQuery(name = "Cliente.findByGeneroCliente", query = "SELECT c FROM Cliente c WHERE c.generoCliente = :generoCliente"),
    @NamedQuery(name = "Cliente.findByEstadoCliente", query = "SELECT c FROM Cliente c WHERE c.estadoCliente = :estadoCliente"),
    @NamedQuery(name = "Cliente.findByPassgordCliente", query = "SELECT c FROM Cliente c WHERE c.passgordCliente = :passgordCliente"),
    @NamedQuery(name = "Cliente.findByRegistroCliente", query = "SELECT c FROM Cliente c WHERE c.registroCliente = :registroCliente")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCliente")
    private Integer idCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "numeroDocumentoCliente")
    private String numeroDocumentoCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreCliente")
    private String nombreCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellidoCliente")
    private String apellidoCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "generoCliente")
    private String generoCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "estadoCliente")
    private String estadoCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "passgordCliente")
    private String passgordCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "registroCliente")
    @Temporal(TemporalType.DATE)
    private Date registroCliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteidCliente", fetch = FetchType.LAZY)
    private Collection<Movilcliente> movilclienteCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteidCliente", fetch = FetchType.LAZY)
    private Collection<Correocliente> correoclienteCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteIdcliente", fetch = FetchType.LAZY)
    private Collection<Fichatecnica> fichatecnicaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteIdcliente", fetch = FetchType.LAZY)
    private Collection<Cita> citaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clienteidCliente", fetch = FetchType.LAZY)
    private Collection<Ordenventa> ordenventaCollection;

    public Cliente() {
    }

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(Integer idCliente, String numeroDocumentoCliente, String nombreCliente, String apellidoCliente, String generoCliente, String estadoCliente, String passgordCliente, Date registroCliente) {
        this.idCliente = idCliente;
        this.numeroDocumentoCliente = numeroDocumentoCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.generoCliente = generoCliente;
        this.estadoCliente = estadoCliente;
        this.passgordCliente = passgordCliente;
        this.registroCliente = registroCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNumeroDocumentoCliente() {
        return numeroDocumentoCliente;
    }

    public void setNumeroDocumentoCliente(String numeroDocumentoCliente) {
        this.numeroDocumentoCliente = numeroDocumentoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getGeneroCliente() {
        return generoCliente;
    }

    public void setGeneroCliente(String generoCliente) {
        this.generoCliente = generoCliente;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public String getPassgordCliente() {
        return passgordCliente;
    }

    public void setPassgordCliente(String passgordCliente) {
        this.passgordCliente = passgordCliente;
    }

    public Date getRegistroCliente() {
        return registroCliente;
    }

    public void setRegistroCliente(Date registroCliente) {
        this.registroCliente = registroCliente;
    }

    @XmlTransient
    public Collection<Movilcliente> getMovilclienteCollection() {
        return movilclienteCollection;
    }

    public void setMovilclienteCollection(Collection<Movilcliente> movilclienteCollection) {
        this.movilclienteCollection = movilclienteCollection;
    }

    @XmlTransient
    public Collection<Correocliente> getCorreoclienteCollection() {
        return correoclienteCollection;
    }

    public void setCorreoclienteCollection(Collection<Correocliente> correoclienteCollection) {
        this.correoclienteCollection = correoclienteCollection;
    }

    @XmlTransient
    public Collection<Fichatecnica> getFichatecnicaCollection() {
        return fichatecnicaCollection;
    }

    public void setFichatecnicaCollection(Collection<Fichatecnica> fichatecnicaCollection) {
        this.fichatecnicaCollection = fichatecnicaCollection;
    }

    @XmlTransient
    public Collection<Cita> getCitaCollection() {
        return citaCollection;
    }

    public void setCitaCollection(Collection<Cita> citaCollection) {
        this.citaCollection = citaCollection;
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
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}
