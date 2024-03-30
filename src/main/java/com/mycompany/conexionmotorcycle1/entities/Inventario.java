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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author hortz
 */
@Entity
@Table(name = "inventario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inventario.findAll", query = "SELECT i FROM Inventario i"),
    @NamedQuery(name = "Inventario.findByIdInventario", query = "SELECT i FROM Inventario i WHERE i.idInventario = :idInventario"),
    @NamedQuery(name = "Inventario.findByFechaIngresoInventario", query = "SELECT i FROM Inventario i WHERE i.fechaIngresoInventario = :fechaIngresoInventario"),
    @NamedQuery(name = "Inventario.findByFechaSalidaInventario", query = "SELECT i FROM Inventario i WHERE i.fechaSalidaInventario = :fechaSalidaInventario"),
    @NamedQuery(name = "Inventario.findByValorUnitarioinventario", query = "SELECT i FROM Inventario i WHERE i.valorUnitarioinventario = :valorUnitarioinventario"),
    @NamedQuery(name = "Inventario.findByCantidadTotalInventario", query = "SELECT i FROM Inventario i WHERE i.cantidadTotalInventario = :cantidadTotalInventario")})
public class Inventario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idInventario")
    private Integer idInventario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaIngresoInventario")
    @Temporal(TemporalType.DATE)
    private Date fechaIngresoInventario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechaSalidaInventario")
    @Temporal(TemporalType.DATE)
    private Date fechaSalidaInventario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "valorUnitarioinventario")
    private String valorUnitarioinventario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cantidadTotalInventario")
    private String cantidadTotalInventario;
    @JoinColumn(name = "producto_idProducto", referencedColumnName = "idProducto")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Producto productoidProducto;

    public Inventario() {
    }

    public Inventario(Integer idInventario) {
        this.idInventario = idInventario;
    }

    public Inventario(Integer idInventario, Date fechaIngresoInventario, Date fechaSalidaInventario, String valorUnitarioinventario, String cantidadTotalInventario) {
        this.idInventario = idInventario;
        this.fechaIngresoInventario = fechaIngresoInventario;
        this.fechaSalidaInventario = fechaSalidaInventario;
        this.valorUnitarioinventario = valorUnitarioinventario;
        this.cantidadTotalInventario = cantidadTotalInventario;
    }

    public Integer getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Integer idInventario) {
        this.idInventario = idInventario;
    }

    public Date getFechaIngresoInventario() {
        return fechaIngresoInventario;
    }

    public void setFechaIngresoInventario(Date fechaIngresoInventario) {
        this.fechaIngresoInventario = fechaIngresoInventario;
    }

    public Date getFechaSalidaInventario() {
        return fechaSalidaInventario;
    }

    public void setFechaSalidaInventario(Date fechaSalidaInventario) {
        this.fechaSalidaInventario = fechaSalidaInventario;
    }

    public String getValorUnitarioinventario() {
        return valorUnitarioinventario;
    }

    public void setValorUnitarioinventario(String valorUnitarioinventario) {
        this.valorUnitarioinventario = valorUnitarioinventario;
    }

    public String getCantidadTotalInventario() {
        return cantidadTotalInventario;
    }

    public void setCantidadTotalInventario(String cantidadTotalInventario) {
        this.cantidadTotalInventario = cantidadTotalInventario;
    }

    public Producto getProductoidProducto() {
        return productoidProducto;
    }

    public void setProductoidProducto(Producto productoidProducto) {
        this.productoidProducto = productoidProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInventario != null ? idInventario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventario)) {
            return false;
        }
        Inventario other = (Inventario) object;
        if ((this.idInventario == null && other.idInventario != null) || (this.idInventario != null && !this.idInventario.equals(other.idInventario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.Inventario[ idInventario=" + idInventario + " ]";
    }
    
}
