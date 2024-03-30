package com.mycompany.conexionmotorcycle1.entities;

import com.mycompany.conexionmotorcycle1.entities.Cliente;
import com.mycompany.conexionmotorcycle1.entities.Fichatecnica;
import com.mycompany.conexionmotorcycle1.entities.Ordentrabajo;
import com.mycompany.conexionmotorcycle1.entities.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-29T23:17:14")
@StaticMetamodel(Cita.class)
public class Cita_ { 

    public static volatile SingularAttribute<Cita, Integer> idcita;
    public static volatile SingularAttribute<Cita, Date> fechaCita;
    public static volatile SingularAttribute<Cita, Cliente> clienteIdcliente;
    public static volatile SingularAttribute<Cita, Date> horaCita;
    public static volatile SingularAttribute<Cita, Usuario> usuarioidUsuario;
    public static volatile SingularAttribute<Cita, Date> fechaFInalzaciónCita;
    public static volatile CollectionAttribute<Cita, Ordentrabajo> ordentrabajoCollection;
    public static volatile SingularAttribute<Cita, Fichatecnica> fichaTecnicaidFichaTecnica;

}