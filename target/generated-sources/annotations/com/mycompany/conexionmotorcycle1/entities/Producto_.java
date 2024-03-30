package com.mycompany.conexionmotorcycle1.entities;

import com.mycompany.conexionmotorcycle1.entities.Detalleventas;
import com.mycompany.conexionmotorcycle1.entities.Inventario;
import com.mycompany.conexionmotorcycle1.entities.OrdentrabajoServicioHasProductos;
import com.mycompany.conexionmotorcycle1.entities.Usuario;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-03-29T23:17:14")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripciónProducto;
    public static volatile CollectionAttribute<Producto, OrdentrabajoServicioHasProductos> ordentrabajoServicioHasProductosCollection;
    public static volatile SingularAttribute<Producto, Usuario> usuarioidUsuario;
    public static volatile SingularAttribute<Producto, Integer> idProducto;
    public static volatile SingularAttribute<Producto, String> codigoProducto;
    public static volatile CollectionAttribute<Producto, Inventario> inventarioCollection;
    public static volatile CollectionAttribute<Producto, Detalleventas> detalleventasCollection;
    public static volatile SingularAttribute<Producto, byte[]> fotoProducto;
    public static volatile SingularAttribute<Producto, String> nombreProducto;
    public static volatile SingularAttribute<Producto, BigDecimal> valorUnitarioProducto;

}