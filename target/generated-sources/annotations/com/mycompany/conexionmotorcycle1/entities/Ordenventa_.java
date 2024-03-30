package com.mycompany.conexionmotorcycle1.entities;

import com.mycompany.conexionmotorcycle1.entities.Cliente;
import com.mycompany.conexionmotorcycle1.entities.Detalleventas;
import com.mycompany.conexionmotorcycle1.entities.Estadoventa;
import com.mycompany.conexionmotorcycle1.entities.Ordentrabajo;
import com.mycompany.conexionmotorcycle1.entities.Usuario;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-29T23:17:14")
@StaticMetamodel(Ordenventa.class)
public class Ordenventa_ { 

    public static volatile SingularAttribute<Ordenventa, Estadoventa> estadoVentaidestadoVenta;
    public static volatile SingularAttribute<Ordenventa, Date> fechaOrdenVenta;
    public static volatile SingularAttribute<Ordenventa, Cliente> clienteidCliente;
    public static volatile SingularAttribute<Ordenventa, Usuario> usuarioidUsuario1;
    public static volatile CollectionAttribute<Ordenventa, Detalleventas> detalleventasCollection;
    public static volatile SingularAttribute<Ordenventa, BigDecimal> valorTotalVenta;
    public static volatile CollectionAttribute<Ordenventa, Ordentrabajo> ordentrabajoCollection;
    public static volatile SingularAttribute<Ordenventa, Integer> idVenta;

}