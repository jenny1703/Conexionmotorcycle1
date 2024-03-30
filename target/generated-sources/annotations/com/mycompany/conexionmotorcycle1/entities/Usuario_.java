package com.mycompany.conexionmotorcycle1.entities;

import com.mycompany.conexionmotorcycle1.entities.Cita;
import com.mycompany.conexionmotorcycle1.entities.Correousuario;
import com.mycompany.conexionmotorcycle1.entities.Fichatecnica;
import com.mycompany.conexionmotorcycle1.entities.Movilusuario;
import com.mycompany.conexionmotorcycle1.entities.Ordenventa;
import com.mycompany.conexionmotorcycle1.entities.PrivilegiosPoorUsuario;
import com.mycompany.conexionmotorcycle1.entities.Producto;
import com.mycompany.conexionmotorcycle1.entities.Rol;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-29T23:17:15")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile CollectionAttribute<Usuario, Cita> citaCollection;
    public static volatile CollectionAttribute<Usuario, PrivilegiosPoorUsuario> privilegiosPoorUsuarioCollection;
    public static volatile SingularAttribute<Usuario, String> apellidoUsuario;
    public static volatile CollectionAttribute<Usuario, Correousuario> correousuarioCollection;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile SingularAttribute<Usuario, String> generoUsuario;
    public static volatile SingularAttribute<Usuario, String> nombreUsuario;
    public static volatile CollectionAttribute<Usuario, Fichatecnica> fichatecnicaCollection;
    public static volatile SingularAttribute<Usuario, String> passgorUsuario;
    public static volatile SingularAttribute<Usuario, String> estadoUsuario;
    public static volatile CollectionAttribute<Usuario, Ordenventa> ordenventaCollection;
    public static volatile SingularAttribute<Usuario, String> documentoUsuario;
    public static volatile CollectionAttribute<Usuario, Producto> productoCollection;
    public static volatile SingularAttribute<Usuario, Rol> rolidRol;
    public static volatile CollectionAttribute<Usuario, Movilusuario> movilusuarioCollection;

}