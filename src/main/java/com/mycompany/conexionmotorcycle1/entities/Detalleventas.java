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
@Table(name = "detalleventas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detalleventas.findAll", query = "SELECT d FROM Detalleventas d"),
    @NamedQuery(name = "Detalleventas.findByIdDetalleVentas", query = "SELECT d FROM Detalleventas d WHERE d.idDetalleVentas = :idDetalleVentas"),
    @NamedQuery(name = "Detalleventas.findByCantidaDetalleVentas", query = "SELECT d FROM Detalleventas d WHERE d.cantidaDetalleVentas = :cantidaDetalleVentas"),
    @NamedQuery(name = "Detalleventas.findByValorTotalDetalleVentas", query = "SELECT d FROM Detalleventas d WHERE d.valorTotalDetalleVentas = :valorTotalDetalleVentas"),
    @NamedQuery(name = "Detalleventas.findByValorUnitarioVentasDetalle", query = "SELECT d FROM Detalleventas d WHERE d.valorUnitarioVentasDetalle = :valorUnitarioVentasDetalle")})
public class Detalleventas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDetalleVentas")
    private Integer idDetalleVentas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidaDetalleVentas")
    private int cantidaDetalleVentas;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorTotalDetalleVentas")
    private BigDecimal valorTotalDetalleVentas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valorUnitarioVentasDetalle")
    private BigDecimal valorUnitarioVentasDetalle;
    @JoinColumn(name = "producto_idProducto", referencedColumnName = "idProducto")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto productoidProducto;
    @JoinColumn(name = "ventas_idVenta", referencedColumnName = "idVenta")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Ordenventa ventasidVenta;

    public Detalleventas() {
    }

    public Detalleventas(Integer idDetalleVentas) {
        this.idDetalleVentas = idDetalleVentas;
    }

    public Detalleventas(Integer idDetalleVentas, int cantidaDetalleVentas, BigDecimal valorTotalDetalleVentas, BigDecimal valorUnitarioVentasDetalle) {
        this.idDetalleVentas = idDetalleVentas;
        this.cantidaDetalleVentas = cantidaDetalleVentas;
        this.valorTotalDetalleVentas = valorTotalDetalleVentas;
        this.valorUnitarioVentasDetalle = valorUnitarioVentasDetalle;
    }

    public Integer getIdDetalleVentas() {
        return idDetalleVentas;
    }

    public void setIdDetalleVentas(Integer idDetalleVentas) {
        this.idDetalleVentas = idDetalleVentas;
    }

    public int getCantidaDetalleVentas() {
        return cantidaDetalleVentas;
    }

    public void setCantidaDetalleVentas(int cantidaDetalleVentas) {
        this.cantidaDetalleVentas = cantidaDetalleVentas;
    }

    public BigDecimal getValorTotalDetalleVentas() {
        return valorTotalDetalleVentas;
    }

    public void setValorTotalDetalleVentas(BigDecimal valorTotalDetalleVentas) {
        this.valorTotalDetalleVentas = valorTotalDetalleVentas;
    }

    public BigDecimal getValorUnitarioVentasDetalle() {
        return valorUnitarioVentasDetalle;
    }

    public void setValorUnitarioVentasDetalle(BigDecimal valorUnitarioVentasDetalle) {
        this.valorUnitarioVentasDetalle = valorUnitarioVentasDetalle;
    }

    public Producto getProductoidProducto() {
        return productoidProducto;
    }

    public void setProductoidProducto(Producto productoidProducto) {
        this.productoidProducto = productoidProducto;
    }

    public Ordenventa getVentasidVenta() {
        return ventasidVenta;
    }

    public void setVentasidVenta(Ordenventa ventasidVenta) {
        this.ventasidVenta = ventasidVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalleVentas != null ? idDetalleVentas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detalleventas)) {
            return false;
        }
        Detalleventas other = (Detalleventas) object;
        if ((this.idDetalleVentas == null && other.idDetalleVentas != null) || (this.idDetalleVentas != null && !this.idDetalleVentas.equals(other.idDetalleVentas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.Detalleventas[ idDetalleVentas=" + idDetalleVentas + " ]";
    }
    
}
