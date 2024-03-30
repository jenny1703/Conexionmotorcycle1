/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "ordenventa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ordenventa.findAll", query = "SELECT o FROM Ordenventa o"),
    @NamedQuery(name = "Ordenventa.findByIdVenta", query = "SELECT o FROM Ordenventa o WHERE o.idVenta = :idVenta"),
    @NamedQuery(name = "Ordenventa.findByFechaOrdenVenta", query = "SELECT o FROM Ordenventa o WHERE o.fechaOrdenVenta = :fechaOrdenVenta"),
    @NamedQuery(name = "Ordenventa.findByValorTotalVenta", query = "SELECT o FROM Ordenventa o WHERE o.valorTotalVenta = :valorTotalVenta")})
public class Ordenventa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idVenta")
    private Integer idVenta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaOrdenVenta")
    @Temporal(TemporalType.DATE)
    private Date fechaOrdenVenta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorTotalVenta")
    private BigDecimal valorTotalVenta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ordenVentaidVenta", fetch = FetchType.LAZY)
    private Collection<Ordentrabajo> ordentrabajoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ventasidVenta", fetch = FetchType.LAZY)
    private Collection<Detalleventas> detalleventasCollection;
    @JoinColumn(name = "cliente_idCliente", referencedColumnName = "idCliente")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Cliente clienteidCliente;
    @JoinColumn(name = "usuario_idUsuario1", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioidUsuario1;
    @JoinColumn(name = "estadoVenta_idestadoVenta", referencedColumnName = "idestadoVenta")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Estadoventa estadoVentaidestadoVenta;

    public Ordenventa() {
    }

    public Ordenventa(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Ordenventa(Integer idVenta, Date fechaOrdenVenta, BigDecimal valorTotalVenta) {
        this.idVenta = idVenta;
        this.fechaOrdenVenta = fechaOrdenVenta;
        this.valorTotalVenta = valorTotalVenta;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFechaOrdenVenta() {
        return fechaOrdenVenta;
    }

    public void setFechaOrdenVenta(Date fechaOrdenVenta) {
        this.fechaOrdenVenta = fechaOrdenVenta;
    }

    public BigDecimal getValorTotalVenta() {
        return valorTotalVenta;
    }

    public void setValorTotalVenta(BigDecimal valorTotalVenta) {
        this.valorTotalVenta = valorTotalVenta;
    }

    @XmlTransient
    public Collection<Ordentrabajo> getOrdentrabajoCollection() {
        return ordentrabajoCollection;
    }

    public void setOrdentrabajoCollection(Collection<Ordentrabajo> ordentrabajoCollection) {
        this.ordentrabajoCollection = ordentrabajoCollection;
    }

    @XmlTransient
    public Collection<Detalleventas> getDetalleventasCollection() {
        return detalleventasCollection;
    }

    public void setDetalleventasCollection(Collection<Detalleventas> detalleventasCollection) {
        this.detalleventasCollection = detalleventasCollection;
    }

    public Cliente getClienteidCliente() {
        return clienteidCliente;
    }

    public void setClienteidCliente(Cliente clienteidCliente) {
        this.clienteidCliente = clienteidCliente;
    }

    public Usuario getUsuarioidUsuario1() {
        return usuarioidUsuario1;
    }

    public void setUsuarioidUsuario1(Usuario usuarioidUsuario1) {
        this.usuarioidUsuario1 = usuarioidUsuario1;
    }

    public Estadoventa getEstadoVentaidestadoVenta() {
        return estadoVentaidestadoVenta;
    }

    public void setEstadoVentaidestadoVenta(Estadoventa estadoVentaidestadoVenta) {
        this.estadoVentaidestadoVenta = estadoVentaidestadoVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVenta != null ? idVenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ordenventa)) {
            return false;
        }
        Ordenventa other = (Ordenventa) object;
        if ((this.idVenta == null && other.idVenta != null) || (this.idVenta != null && !this.idVenta.equals(other.idVenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.Ordenventa[ idVenta=" + idVenta + " ]";
    }
    
}
