package co.estiiven42.quiz_producto_alimenticio.SERVICIOS;

import co.estiiven42.quiz_producto_alimenticio.ENTIDADES.Entidad_Producto;
import co.estiiven42.quiz_producto_alimenticio.REPOSITORIO.Repositorio_Producto;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Ipml_Productos implements Servicios_Producto
{
    @Autowired
    private Repositorio_Producto repositorioProducto;
    @Override
    public List<Entidad_Producto> listarProductos() {
        return repositorioProducto.findAll();
    }
    public Entidad_Producto guardarProducto(Entidad_Producto producto)
    {
        return repositorioProducto.save(producto);
    }
}
