package com.tienda.domain;

import lombok.Data;
import java.io.Serializable;
import jakarta.persistence.*;

@Data //Tag de que la clase es tipo data
@Entity //Tag de que la clase va a utilizar una entidad
@Table(name = "producto") //Tabla que vamos a utilizar para esta clase

public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")

    private Long idProducto;
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;

    //private long idCategoria;
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    Categoria categoria;

    public Producto() {
    }

    public Producto(String producto, boolean activo) {
        this.descripcion = producto;
        this.activo = activo;
    }

}
