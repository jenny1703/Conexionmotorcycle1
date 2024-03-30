package com.mycompany.conexionmotorcycle1.entities;

import com.mycompany.conexionmotorcycle1.entities.PrivilegiosPoorUsuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-29T23:17:15")
@StaticMetamodel(Privilegios.class)
public class Privilegios_ { 

    public static volatile SingularAttribute<Privilegios, String> nombrePivilegios;
    public static volatile CollectionAttribute<Privilegios, PrivilegiosPoorUsuario> privilegiosPoorUsuarioCollection;
    public static volatile SingularAttribute<Privilegios, Integer> idPrevilegios;

}