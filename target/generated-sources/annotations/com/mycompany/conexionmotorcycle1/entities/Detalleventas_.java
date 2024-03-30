package com.mycompany.conexionmotorcycle1.entities;

import com.mycompany.conexionmotorcycle1.entities.Ordenventa;
import com.mycompany.conexionmotorcycle1.entities.Producto;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-29T23:17:15")
@StaticMetamodel(Detalleventas.class)
public class Detalleventas_ { 

    public static volatile SingularAttribute<Detalleventas, Ordenventa> ventasidVenta;
    public static volatile SingularAttribute<Detalleventas, Integer> idDetalleVentas;
    public static volatile SingularAttribute<Detalleventas, Integer> cantidaDetalleVentas;
    public static volatile SingularAttribute<Detalleventas, BigDecimal> valorTotalDetalleVentas;
    public static volatile SingularAttribute<Detalleventas, Producto> productoidProducto;
    public static volatile SingularAttribute<Detalleventas, BigDecimal> valorUnitarioVentasDetalle;

}