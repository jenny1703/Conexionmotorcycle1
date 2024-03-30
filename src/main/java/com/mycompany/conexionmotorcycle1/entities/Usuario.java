/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexionmotorcycle1.entities;

import java.io.Serializable;
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
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "Usuario.findByDocumentoUsuario", query = "SELECT u FROM Usuario u WHERE u.documentoUsuario = :documentoUsuario"),
    @NamedQuery(name = "Usuario.findByNombreUsuario", query = "SELECT u FROM Usuario u WHERE u.nombreUsuario = :nombreUsuario"),
    @NamedQuery(name = "Usuario.findByApellidoUsuario", query = "SELECT u FROM Usuario u WHERE u.apellidoUsuario = :apellidoUsuario"),
    @NamedQuery(name = "Usuario.findByPassgorUsuario", query = "SELECT u FROM Usuario u WHERE u.passgorUsuario = :passgorUsuario"),
    @NamedQuery(name = "Usuario.findByGeneroUsuario", query = "SELECT u FROM Usuario u WHERE u.generoUsuario = :generoUsuario"),
    @NamedQuery(name = "Usuario.findByEstadoUsuario", query = "SELECT u FROM Usuario u WHERE u.estadoUsuario = :estadoUsuario")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUsuario")
    private Integer idUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "documentoUsuario")
    private String documentoUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreUsuario")
    private String nombreUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellidoUsuario")
    private String apellidoUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "passgorUsuario")
    private String passgorUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "generoUsuario")
    private String generoUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "estadoUsuario")
    private String estadoUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioidUsuario", fetch = FetchType.LAZY)
    private Collection<Producto> productoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioidUsuario", fetch = FetchType.LAZY)
    private Collection<Correousuario> correousuarioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioidUsuario", fetch = FetchType.LAZY)
    private Collection<PrivilegiosPoorUsuario> privilegiosPoorUsuarioCollection;
    @JoinColumn(name = "rol_idRol", referencedColumnName = "idRol")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Rol rolidRol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioidUsuario", fetch = FetchType.LAZY)
    private Collection<Movilusuario> movilusuarioCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioidUsuario", fetch = FetchType.LAZY)
    private Collection<Fichatecnica> fichatecnicaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioidUsuario", fetch = FetchType.LAZY)
    private Collection<Cita> citaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioidUsuario1", fetch = FetchType.LAZY)
    private Collection<Ordenventa> ordenventaCollection;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(Integer idUsuario, String documentoUsuario, String nombreUsuario, String apellidoUsuario, String passgorUsuario, String generoUsuario, String estadoUsuario) {
        this.idUsuario = idUsuario;
        this.documentoUsuario = documentoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.passgorUsuario = passgorUsuario;
        this.generoUsuario = generoUsuario;
        this.estadoUsuario = estadoUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDocumentoUsuario() {
        return documentoUsuario;
    }

    public void setDocumentoUsuario(String documentoUsuario) {
        this.documentoUsuario = documentoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getPassgorUsuario() {
        return passgorUsuario;
    }

    public void setPassgorUsuario(String passgorUsuario) {
        this.passgorUsuario = passgorUsuario;
    }

    public String getGeneroUsuario() {
        return generoUsuario;
    }

    public void setGeneroUsuario(String generoUsuario) {
        this.generoUsuario = generoUsuario;
    }

    public String getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    @XmlTransient
    public Collection<Producto> getProductoCollection() {
        return productoCollection;
    }

    public void setProductoCollection(Collection<Producto> productoCollection) {
        this.productoCollection = productoCollection;
    }

    @XmlTransient
    public Collection<Correousuario> getCorreousuarioCollection() {
        return correousuarioCollection;
    }

    public void setCorreousuarioCollection(Collection<Correousuario> correousuarioCollection) {
        this.correousuarioCollection = correousuarioCollection;
    }

    @XmlTransient
    public Collection<PrivilegiosPoorUsuario> getPrivilegiosPoorUsuarioCollection() {
        return privilegiosPoorUsuarioCollection;
    }

    public void setPrivilegiosPoorUsuarioCollection(Collection<PrivilegiosPoorUsuario> privilegiosPoorUsuarioCollection) {
        this.privilegiosPoorUsuarioCollection = privilegiosPoorUsuarioCollection;
    }

    public Rol getRolidRol() {
        return rolidRol;
    }

    public void setRolidRol(Rol rolidRol) {
        this.rolidRol = rolidRol;
    }

    @XmlTransient
    public Collection<Movilusuario> getMovilusuarioCollection() {
        return movilusuarioCollection;
    }

    public void setMovilusuarioCollection(Collection<Movilusuario> movilusuarioCollection) {
        this.movilusuarioCollection = movilusuarioCollection;
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
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.conexionmotorcycle1.entities.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
