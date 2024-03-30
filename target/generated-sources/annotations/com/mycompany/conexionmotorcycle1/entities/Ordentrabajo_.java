package com.mycompany.conexionmotorcycle1.entities;

import com.mycompany.conexionmotorcycle1.entities.Cita;
import com.mycompany.conexionmotorcycle1.entities.Ordenventa;
import com.mycompany.conexionmotorcycle1.entities.ServicioHasOrdentrabajo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-29T23:17:15")
@StaticMetamodel(Ordentrabajo.class)
public class Ordentrabajo_ { 

    public static volatile CollectionAttribute<Ordentrabajo, ServicioHasOrdentrabajo> servicioHasOrdentrabajoCollection;
    public static volatile SingularAttribute<Ordentrabajo, Integer> idordenTrabajo;
    public static volatile SingularAttribute<Ordentrabajo, Ordenventa> ordenVentaidVenta;
    public static volatile SingularAttribute<Ordentrabajo, Long> numeroOrdenTrabajo;
    public static volatile SingularAttribute<Ordentrabajo, Cita> citaIdcita;

}