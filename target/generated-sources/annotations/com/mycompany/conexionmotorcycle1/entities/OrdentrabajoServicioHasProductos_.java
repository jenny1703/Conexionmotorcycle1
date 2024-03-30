package com.mycompany.conexionmotorcycle1.entities;

import com.mycompany.conexionmotorcycle1.entities.Producto;
import com.mycompany.conexionmotorcycle1.entities.ServicioHasOrdentrabajo;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-29T23:17:14")
@StaticMetamodel(OrdentrabajoServicioHasProductos.class)
public class OrdentrabajoServicioHasProductos_ { 

    public static volatile SingularAttribute<OrdentrabajoServicioHasProductos, Producto> productoidProducto;
    public static volatile SingularAttribute<OrdentrabajoServicioHasProductos, ServicioHasOrdentrabajo> idServicioordenTrabajo;
    public static volatile SingularAttribute<OrdentrabajoServicioHasProductos, BigDecimal> precioProductoordentrabajoserviciohasproductos;
    public static volatile SingularAttribute<OrdentrabajoServicioHasProductos, Integer> idOrdentrabajoserviciohasproductos;

}