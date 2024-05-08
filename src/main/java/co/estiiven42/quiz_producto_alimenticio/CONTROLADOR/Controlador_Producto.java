package co.estiiven42.quiz_producto_alimenticio.CONTROLADOR;

import co.estiiven42.quiz_producto_alimenticio.ENTIDADES.Entidad_Producto;
import co.estiiven42.quiz_producto_alimenticio.REPOSITORIO.Repositorio_Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class Controlador_Producto
{
    @Autowired
    private Repositorio_Producto repositorioProducto;

    @GetMapping("/productos/lista")
    public List<Entidad_Producto> listarProductos() {
        return repositorioProducto.findAll();
    }

}
