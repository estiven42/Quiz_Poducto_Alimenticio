package co.estiiven42.quiz_producto_alimenticio.DTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
@NoArgsConstructor
public class DTO_Producto
{
    private Long idProducto;
    private String nombre;
    private String marca;
    private int catidad;
    private double precio;
}
