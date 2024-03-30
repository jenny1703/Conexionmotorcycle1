package com.mycompany.conexionmotorcycle1.entities;

import com.mycompany.conexionmotorcycle1.entities.Ordentrabajo;
import com.mycompany.conexionmotorcycle1.entities.OrdentrabajoServicioHasProductos;
import com.mycompany.conexionmotorcycle1.entities.Servicio;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-29T23:17:15")
@StaticMetamodel(ServicioHasOrdentrabajo.class)
public class ServicioHasOrdentrabajo_ { 

    public static volatile CollectionAttribute<ServicioHasOrdentrabajo, OrdentrabajoServicioHasProductos> ordentrabajoServicioHasProductosCollection;
    public static volatile SingularAttribute<ServicioHasOrdentrabajo, Integer> idServicioordenTrabajo;
    public static volatile SingularAttribute<ServicioHasOrdentrabajo, Servicio> servicioIdservicio;
    public static volatile SingularAttribute<ServicioHasOrdentrabajo, Ordentrabajo> ordenTrabajoidordenTrabajo;
    public static volatile SingularAttribute<ServicioHasOrdentrabajo, BigDecimal> preciohasordenTrabajo;

}