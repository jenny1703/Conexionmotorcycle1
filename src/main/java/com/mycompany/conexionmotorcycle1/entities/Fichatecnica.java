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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "fichatecnica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fichatecnica.findAll", query = "SELECT f FROM Fichatecnica f"),
    @NamedQuery(name = "Fichatecnica.findByIdFichaTecnica", query = "SELECT f FROM Fichatecnica f WHERE f.idFichaTecnica = :idFichaTecnica"),
    @NamedQuery(name = "Fichatecnica.findByFechaRegistroFichaTecnica", query = "SELECT f FROM Fichatecnica f WHERE f.fechaRegistroFichaTecnica = :fechaRegistroFichaTecnica"),
    @NamedQuery(name = "Fichatecnica.findByNumeroMotorFichaTecnica", query = "SELECT f FROM Fichatecnica f WHERE f.numeroMotorFichaTecnica = :numeroMotorFichaTecnica"),
    @NamedQuery(name = "Fichatecnica.findByCilindrajeFichaTecnica", query = "SELECT f FROM Fichatecnica f WHERE f.cilindrajeFichaTecnica = :cilindrajeFichaTecnica"),
    @NamedQuery(name = "Fichatecnica.findByPlacaFichaTecnica", query = "SELECT f FROM Fichatecnica f WHERE f.placaFichaTecnica = :placaFichaTecnica"),
    @NamedQuery(name = "Fichatecnica.findByMarcaFichaTecnica", query = "SELECT f FROM Fichatecnica f WHERE f.marcaFichaTecnica = :marcaFichaTecnica"),
    @NamedQuery(name = "Fichatecnica.findByChacisFichaTecnica", query = "SELECT f FROM Fichatecnica f WHERE f.chacisFichaTecnica = :chacisFichaTecnica"),
    @NamedQuery(name = "Fichatecnica.findByModeloFficha", query = "SELECT f FROM Fichatecnica f WHERE f.modeloFficha = :modeloFficha")})
public class Fichatecnica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idFichaTecnica")
    private Integer idFichaTecnica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaRegistroFichaTecnica")
    @Temporal(TemporalType.DATE)
    private Date fechaRegistroFichaTecnica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "numeroMotorFichaTecnica")
    private String numeroMotorFichaTecnica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cilindrajeFichaTecnica")
    private String cilindrajeFichaTecnica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "placaFichaTecnica")
    private String placaFichaTecnica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "marcaFichaTecnica")
    private String marcaFichaTecnica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "chacisFichaTecnica")
    private String chacisFichaTecnica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "modeloFficha")
    private String modeloFficha;
    @JoinColumn(name = "cliente_idcliente", referencedColumnName = "idCliente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cliente clienteIdcliente;
    @JoinColumn(name = "usuario_idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioidUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fichaTecnicaidFichaTecnica", fetch = FetchType.LAZY)
    private Collection<Cita> citaCollection;

    public Fichatecnica() {
    }

    public Fichatecnica(Integer idFichaTecnica) {
        this.idFichaTecnica = idFichaTecnica;
    }

    public Fichatecnica(Integer idFichaTecnica, Date fechaRegistroFichaTecnica, String numeroMotorFichaTecnica, String cilindrajeFichaTecnica, String placaFichaTecnica, String marcaFichaTecnica, String chacisFichaTecnica, String modeloFficha) {
        this.idFichaTecnica = idFichaTecnica;
        this.fechaRegistroFichaTecnica = fechaRegistroFichaTecnica;
        this.numeroMotorFichaTecnica = numeroMotorFichaTecnica;
        this.cilindrajeFichaTecnica = cilindrajeFichaTecnica;
        this.placaFichaTecnica = placaFichaTecnica;
        this.marcaFichaTecnica = marcaFichaTecnica;
        this.chacisFichaTecnica = chacisFichaTecnica;
        this.modeloFficha = modeloFficha;
    }

    public Integer getIdFichaTecnica() {
        return idFichaTecnica;
    }

    public void setIdFichaTecnica(Integer idFichaTecnica) {
        this.idFichaTecnica = idFichaTecnica;
    }

    public Date getFechaRegistroFichaTecnica() {
        return fechaRegistroFichaTecnica;
    }

    public void setFechaRegistroFichaTecnica(Date fechaRegistroFichaTecnica) {
        this.fechaRegistroFichaTecnica = fechaRegistroFichaTecnica;
    }

    public String getNumeroMotorFichaTecnica() {
        return numeroMotorFichaTecnica;
    }

    public void setNumeroMotorFichaTecnica(String numeroMotorFichaTecnica) {
        this.numeroMotorFichaTecnica = numeroMotorFichaTecnica;
    }

    public String getCilindrajeFichaTecnica() {
        return cilindrajeFichaTecnica;
    }

    public void setCilindrajeFichaTecnica(String cilindrajeFichaTecnica) {
        this.cilindrajeFichaTecnica = cilindrajeFichaTecnica;
    }

    public String getPlacaFichaTecnica() {
        return placaFichaTecnica;
    }

    public void setPlacaFichaTecnica(String placaFichaTecnica) {
        this.placaFichaTecnica = placaFichaTecnica;
    }

    public String getMarcaFichaTecnica() {
        return marcaFichaTecnica;
    }

    public void setMarcaFichaTecnica(String marcaFichaTecnica) {
        this.marcaFichaTecnica = marcaFichaTecnica;
    }

    public String getChacisFichaTecnica() {
        return chacisFichaTecnica;
    }

    public void setChacisFichaTecnica(String chacisFichaTecnica) {
        this.chacisFichaTecnica = chacisFichaTecnica;
    }

    public String getModeloFficha() {
        return modeloFficha;
    }

    public void setModeloFficha(String modeloFficha) {
        this.modeloFficha = modeloFficha;
    }

    public Cliente getClienteIdcliente() {
        return clienteIdcliente;
    }

    public void setClienteIdcliente(Cliente clienteIdcliente) {
        this.clienteIdcliente = clienteIdcliente;
    }

    public Usuario getUsuarioidUsuario() {
        return usuarioidUsuario;
    }

    public void setUsuarioidUsuario(Usuario usuarioidUsuario) {
        this.usuarioidUsuario = usuarioidUsuario;
    }

    @XmlTransient
    public Collection<Cita> getCitaCollection() {
        return citaCollection;
    }

    public void setCitaCollection(Collection<Cita> citaCollection) {
        this.citaCollection = citaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFichaTecnica != null ? idFichaTecnica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fichatecnica)) {
            return false;
        }
        Fichatecnica other = (Fichatecnica) object;
        if ((this.idFichaTecnica == null && other.idFichaTecnica != null) || (this.idFichaTecnica != null && !this.idFichaTecnica.equals(other.idFichaTecnica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.Fichatecnica[ idFichaTecnica=" + idFichaTecnica + " ]";
    }
    
}
