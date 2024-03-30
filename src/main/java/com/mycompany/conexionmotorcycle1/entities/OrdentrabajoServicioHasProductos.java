/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hortz
 */
@Entity
@Table(name = "ordentrabajo_servicio_has_productos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdentrabajoServicioHasProductos.findAll", query = "SELECT o FROM OrdentrabajoServicioHasProductos o"),
    @NamedQuery(name = "OrdentrabajoServicioHasProductos.findByIdOrdentrabajoserviciohasproductos", query = "SELECT o FROM OrdentrabajoServicioHasProductos o WHERE o.idOrdentrabajoserviciohasproductos = :idOrdentrabajoserviciohasproductos"),
    @NamedQuery(name = "OrdentrabajoServicioHasProductos.findByPrecioProductoordentrabajoserviciohasproductos", query = "SELECT o FROM OrdentrabajoServicioHasProductos o WHERE o.precioProductoordentrabajoserviciohasproductos = :precioProductoordentrabajoserviciohasproductos")})
public class OrdentrabajoServicioHasProductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idOrdentrabajo_servicio_has_productos")
    private Integer idOrdentrabajoserviciohasproductos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "precioProducto_ordentrabajo_servicio_has_productos")
    private BigDecimal precioProductoordentrabajoserviciohasproductos;
    @JoinColumn(name = "producto_idProducto", referencedColumnName = "idProducto")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto productoidProducto;
    @JoinColumn(name = "idServicio_ordenTrabajo", referencedColumnName = "idServicio_ordenTrabajo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ServicioHasOrdentrabajo idServicioordenTrabajo;

    public OrdentrabajoServicioHasProductos() {
    }

    public OrdentrabajoServicioHasProductos(Integer idOrdentrabajoserviciohasproductos) {
        this.idOrdentrabajoserviciohasproductos = idOrdentrabajoserviciohasproductos;
    }

    public OrdentrabajoServicioHasProductos(Integer idOrdentrabajoserviciohasproductos, BigDecimal precioProductoordentrabajoserviciohasproductos) {
        this.idOrdentrabajoserviciohasproductos = idOrdentrabajoserviciohasproductos;
        this.precioProductoordentrabajoserviciohasproductos = precioProductoordentrabajoserviciohasproductos;
    }

    public Integer getIdOrdentrabajoserviciohasproductos() {
        return idOrdentrabajoserviciohasproductos;
    }

    public void setIdOrdentrabajoserviciohasproductos(Integer idOrdentrabajoserviciohasproductos) {
        this.idOrdentrabajoserviciohasproductos = idOrdentrabajoserviciohasproductos;
    }

    public BigDecimal getPrecioProductoordentrabajoserviciohasproductos() {
        return precioProductoordentrabajoserviciohasproductos;
    }

    public void setPrecioProductoordentrabajoserviciohasproductos(BigDecimal precioProductoordentrabajoserviciohasproductos) {
        this.precioProductoordentrabajoserviciohasproductos = precioProductoordentrabajoserviciohasproductos;
    }

    public Producto getProductoidProducto() {
        return productoidProducto;
    }

    public void setProductoidProducto(Producto productoidProducto) {
        this.productoidProducto = productoidProducto;
    }

    public ServicioHasOrdentrabajo getIdServicioordenTrabajo() {
        return idServicioordenTrabajo;
    }

    public void setIdServicioordenTrabajo(ServicioHasOrdentrabajo idServicioordenTrabajo) {
        this.idServicioordenTrabajo = idServicioordenTrabajo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrdentrabajoserviciohasproductos != null ? idOrdentrabajoserviciohasproductos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdentrabajoServicioHasProductos)) {
            return false;
        }
        OrdentrabajoServicioHasProductos other = (OrdentrabajoServicioHasProductos) object;
        if ((this.idOrdentrabajoserviciohasproductos == null && other.idOrdentrabajoserviciohasproductos != null) || (this.idOrdentrabajoserviciohasproductos != null && !this.idOrdentrabajoserviciohasproductos.equals(other.idOrdentrabajoserviciohasproductos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.OrdentrabajoServicioHasProductos[ idOrdentrabajoserviciohasproductos=" + idOrdentrabajoserviciohasproductos + " ]";
    }
    
}
