package com.mycompany.conexionmotorcycle1.entities;

import com.mycompany.conexionmotorcycle1.entities.Cita;
import com.mycompany.conexionmotorcycle1.entities.Correocliente;
import com.mycompany.conexionmotorcycle1.entities.Fichatecnica;
import com.mycompany.conexionmotorcycle1.entities.Movilcliente;
import com.mycompany.conexionmotorcycle1.entities.Ordenventa;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-29T23:17:14")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> estadoCliente;
    public static volatile CollectionAttribute<Cliente, Cita> citaCollection;
    public static volatile SingularAttribute<Cliente, String> generoCliente;
    public static volatile SingularAttribute<Cliente, Date> registroCliente;
    public static volatile SingularAttribute<Cliente, String> passgordCliente;
    public static volatile CollectionAttribute<Cliente, Movilcliente> movilclienteCollection;
    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile SingularAttribute<Cliente, String> nombreCliente;
    public static volatile CollectionAttribute<Cliente, Fichatecnica> fichatecnicaCollection;
    public static volatile SingularAttribute<Cliente, String> apellidoCliente;
    public static volatile CollectionAttribute<Cliente, Ordenventa> ordenventaCollection;
    public static volatile SingularAttribute<Cliente, String> numeroDocumentoCliente;
    public static volatile CollectionAttribute<Cliente, Correocliente> correoclienteCollection;

}