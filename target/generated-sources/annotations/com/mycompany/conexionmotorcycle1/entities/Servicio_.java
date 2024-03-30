package com.mycompany.conexionmotorcycle1.entities;

import com.mycompany.conexionmotorcycle1.entities.ServicioHasOrdentrabajo;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-29T23:17:15")
@StaticMetamodel(Servicio.class)
public class Servicio_ { 

    public static volatile SingularAttribute<Servicio, String> nombreServicio;
    public static volatile CollectionAttribute<Servicio, ServicioHasOrdentrabajo> servicioHasOrdentrabajoCollection;
    public static volatile SingularAttribute<Servicio, BigDecimal> precioManoObraServicio;
    public static volatile SingularAttribute<Servicio, Integer> idservicio;

}