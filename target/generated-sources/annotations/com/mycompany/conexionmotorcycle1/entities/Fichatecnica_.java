package com.mycompany.conexionmotorcycle1.entities;

import com.mycompany.conexionmotorcycle1.entities.Cita;
import com.mycompany.conexionmotorcycle1.entities.Cliente;
import com.mycompany.conexionmotorcycle1.entities.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-29T23:17:15")
@StaticMetamodel(Fichatecnica.class)
public class Fichatecnica_ { 

    public static volatile CollectionAttribute<Fichatecnica, Cita> citaCollection;
    public static volatile SingularAttribute<Fichatecnica, String> cilindrajeFichaTecnica;
    public static volatile SingularAttribute<Fichatecnica, String> chacisFichaTecnica;
    public static volatile SingularAttribute<Fichatecnica, Cliente> clienteIdcliente;
    public static volatile SingularAttribute<Fichatecnica, String> marcaFichaTecnica;
    public static volatile SingularAttribute<Fichatecnica, Integer> idFichaTecnica;
    public static volatile SingularAttribute<Fichatecnica, Usuario> usuarioidUsuario;
    public static volatile SingularAttribute<Fichatecnica, String> modeloFficha;
    public static volatile SingularAttribute<Fichatecnica, Date> fechaRegistroFichaTecnica;
    public static volatile SingularAttribute<Fichatecnica, String> numeroMotorFichaTecnica;
    public static volatile SingularAttribute<Fichatecnica, String> placaFichaTecnica;

}