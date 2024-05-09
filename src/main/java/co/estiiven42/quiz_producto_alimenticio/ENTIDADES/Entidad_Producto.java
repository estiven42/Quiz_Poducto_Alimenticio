package co.estiiven42.quiz_producto_alimenticio.ENTIDADES;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "producto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entidad_Producto
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_PRODUCTO")
    @SequenceGenerator(name = "SEQ_PRODUCTO",sequenceName = "SEQ_PRODUCTO", allocationSize = 1)
    @Column(name = "idProducto",nullable = false,unique = true)
    private Long idProducto;
    @Column(name = "nombre",nullable = false)
    private String nombre;
    @Column(name = "marca",nullable = false)
    private String marca;
    @Column(name = "catidad",nullable = false)
    private int catidad;
    @Column(name = "precio",nullable = false)
    private double precio;
}
