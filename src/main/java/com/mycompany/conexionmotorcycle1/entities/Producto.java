/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p"),
    @NamedQuery(name = "Producto.findByIdProducto", query = "SELECT p FROM Producto p WHERE p.idProducto = :idProducto"),
    @NamedQuery(name = "Producto.findByCodigoProducto", query = "SELECT p FROM Producto p WHERE p.codigoProducto = :codigoProducto"),
    @NamedQuery(name = "Producto.findByNombreProducto", query = "SELECT p FROM Producto p WHERE p.nombreProducto = :nombreProducto"),
    @NamedQuery(name = "Producto.findByDescripci\u00f3nProducto", query = "SELECT p FROM Producto p WHERE p.descripci\u00f3nProducto = :descripci\u00f3nProducto"),
    @NamedQuery(name = "Producto.findByValorUnitarioProducto", query = "SELECT p FROM Producto p WHERE p.valorUnitarioProducto = :valorUnitarioProducto")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProducto")
    private Integer idProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "codigoProducto")
    private String codigoProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreProducto")
    private String nombreProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "descripci\u00f3nProducto")
    private String descripciónProducto;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "fotoProducto")
    private byte[] fotoProducto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorUnitarioProducto")
    private BigDecimal valorUnitarioProducto;
    @JoinColumn(name = "usuario_idUsuario", referencedColumnName = "idUsuario")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Usuario usuarioidUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoidProducto", fetch = FetchType.LAZY)
    private Collection<OrdentrabajoServicioHasProductos> ordentrabajoServicioHasProductosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoidProducto", fetch = FetchType.LAZY)
    private Collection<Detalleventas> detalleventasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoidProducto", fetch = FetchType.LAZY)
    private Collection<Inventario> inventarioCollection;

    public Producto() {
    }

    public Producto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Producto(Integer idProducto, String codigoProducto, String nombreProducto, String descripciónProducto, byte[] fotoProducto, BigDecimal valorUnitarioProducto) {
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.descripciónProducto = descripciónProducto;
        this.fotoProducto = fotoProducto;
        this.valorUnitarioProducto = valorUnitarioProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripciónProducto() {
        return descripciónProducto;
    }

    public void setDescripciónProducto(String descripciónProducto) {
        this.descripciónProducto = descripciónProducto;
    }

    public byte[] getFotoProducto() {
        return fotoProducto;
    }

    public void setFotoProducto(byte[] fotoProducto) {
        this.fotoProducto = fotoProducto;
    }

    public BigDecimal getValorUnitarioProducto() {
        return valorUnitarioProducto;
    }

    public void setValorUnitarioProducto(BigDecimal valorUnitarioProducto) {
        this.valorUnitarioProducto = valorUnitarioProducto;
    }

    public Usuario getUsuarioidUsuario() {
        return usuarioidUsuario;
    }

    public void setUsuarioidUsuario(Usuario usuarioidUsuario) {
        this.usuarioidUsuario = usuarioidUsuario;
    }

    @XmlTransient
    public Collection<OrdentrabajoServicioHasProductos> getOrdentrabajoServicioHasProductosCollection() {
        return ordentrabajoServicioHasProductosCollection;
    }

    public void setOrdentrabajoServicioHasProductosCollection(Collection<OrdentrabajoServicioHasProductos> ordentrabajoServicioHasProductosCollection) {
        this.ordentrabajoServicioHasProductosCollection = ordentrabajoServicioHasProductosCollection;
    }

    @XmlTransient
    public Collection<Detalleventas> getDetalleventasCollection() {
        return detalleventasCollection;
    }

    public void setDetalleventasCollection(Collection<Detalleventas> detalleventasCollection) {
        this.detalleventasCollection = detalleventasCollection;
    }

    @XmlTransient
    public Collection<Inventario> getInventarioCollection() {
        return inventarioCollection;
    }

    public void setInventarioCollection(Collection<Inventario> inventarioCollection) {
        this.inventarioCollection = inventarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.Producto[ idProducto=" + idProducto + " ]";
    }
    
}
