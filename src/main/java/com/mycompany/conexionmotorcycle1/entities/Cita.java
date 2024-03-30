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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author hortz
 */
@Entity
@Table(name = "cita")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cita.findAll", query = "SELECT c FROM Cita c"),
    @NamedQuery(name = "Cita.findByIdcita", query = "SELECT c FROM Cita c WHERE c.idcita = :idcita"),
    @NamedQuery(name = "Cita.findByFechaCita", query = "SELECT c FROM Cita c WHERE c.fechaCita = :fechaCita"),
    @NamedQuery(name = "Cita.findByHoraCita", query = "SELECT c FROM Cita c WHERE c.horaCita = :horaCita"),
    @NamedQuery(name = "Cita.findByFechaFInalzaci\u00f3nCita", query = "SELECT c FROM Cita c WHERE c.fechaFInalzaci\u00f3nCita = :fechaFInalzaci\u00f3nCita")})
public class Cita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcita")
    private Integer idcita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaCita")
    @Temporal(TemporalType.DATE)
    private Date fechaCita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horaCita")
    @Temporal(TemporalType.TIME)
    private Date horaCita;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaFInalzaci\u00f3nCita")
    @Temporal(TemporalType.DATE)
    private Date fechaFInalzaciónCita;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "citaIdcita", fetch = FetchType.LAZY)
    private Collection<Ordentrabajo> ordentrabajoCollection;
    @JoinColumn(name = "cliente_idcliente", referencedColumnName = "idCliente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cliente clienteIdcliente;
    @JoinColumn(name = "fichaTecnica_idFichaTecnica", referencedColumnName = "idFichaTecnica")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Fichatecnica fichaTecnicaidFichaTecnica;
    @JoinColumn(name = "usuario_idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioidUsuario;

    public Cita() {
    }

    public Cita(Integer idcita) {
        this.idcita = idcita;
    }

    public Cita(Integer idcita, Date fechaCita, Date horaCita, Date fechaFInalzaciónCita) {
        this.idcita = idcita;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.fechaFInalzaciónCita = fechaFInalzaciónCita;
    }

    public Integer getIdcita() {
        return idcita;
    }

    public void setIdcita(Integer idcita) {
        this.idcita = idcita;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public Date getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(Date horaCita) {
        this.horaCita = horaCita;
    }

    public Date getFechaFInalzaciónCita() {
        return fechaFInalzaciónCita;
    }

    public void setFechaFInalzaciónCita(Date fechaFInalzaciónCita) {
        this.fechaFInalzaciónCita = fechaFInalzaciónCita;
    }

    @XmlTransient
    public Collection<Ordentrabajo> getOrdentrabajoCollection() {
        return ordentrabajoCollection;
    }

    public void setOrdentrabajoCollection(Collection<Ordentrabajo> ordentrabajoCollection) {
        this.ordentrabajoCollection = ordentrabajoCollection;
    }

    public Cliente getClienteIdcliente() {
        return clienteIdcliente;
    }

    public void setClienteIdcliente(Cliente clienteIdcliente) {
        this.clienteIdcliente = clienteIdcliente;
    }

    public Fichatecnica getFichaTecnicaidFichaTecnica() {
        return fichaTecnicaidFichaTecnica;
    }

    public void setFichaTecnicaidFichaTecnica(Fichatecnica fichaTecnicaidFichaTecnica) {
        this.fichaTecnicaidFichaTecnica = fichaTecnicaidFichaTecnica;
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
        hash += (idcita != null ? idcita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cita)) {
            return false;
        }
        Cita other = (Cita) object;
        if ((this.idcita == null && other.idcita != null) || (this.idcita != null && !this.idcita.equals(other.idcita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.Cita[ idcita=" + idcita + " ]";
    }
    
}
