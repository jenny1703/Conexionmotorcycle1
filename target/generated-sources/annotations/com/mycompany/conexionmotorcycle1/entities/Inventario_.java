package com.mycompany.conexionmotorcycle1.entities;

import com.mycompany.conexionmotorcycle1.entities.Producto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-29T23:17:14")
@StaticMetamodel(Inventario.class)
public class Inventario_ { 

    public static volatile SingularAttribute<Inventario, Date> fechaIngresoInventario;
    public static volatile SingularAttribute<Inventario, Date> fechaSalidaInventario;
    public static volatile SingularAttribute<Inventario, String> cantidadTotalInventario;
    public static volatile SingularAttribute<Inventario, Producto> productoidProducto;
    public static volatile SingularAttribute<Inventario, Integer> idInventario;
    public static volatile SingularAttribute<Inventario, String> valorUnitarioinventario;

}