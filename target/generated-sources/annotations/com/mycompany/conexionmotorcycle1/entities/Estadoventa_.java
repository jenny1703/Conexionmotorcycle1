package com.mycompany.conexionmotorcycle1.entities;

import com.mycompany.conexionmotorcycle1.entities.Ordenventa;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-29T23:17:14")
@StaticMetamodel(Estadoventa.class)
public class Estadoventa_ { 

    public static volatile SingularAttribute<Estadoventa, Integer> idestadoVenta;
    public static volatile CollectionAttribute<Estadoventa, Ordenventa> ordenventaCollection;
    public static volatile SingularAttribute<Estadoventa, String> nombre;

}