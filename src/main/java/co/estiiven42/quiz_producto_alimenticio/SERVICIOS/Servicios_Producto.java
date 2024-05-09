package co.estiiven42.quiz_producto_alimenticio.SERVICIOS;

import co.estiiven42.quiz_producto_alimenticio.ENTIDADES.Entidad_Producto;

import java.util.List;

public interface Servicios_Producto
{
    public List<Entidad_Producto> listarProductos();
    public Entidad_Producto guardarProducto(Entidad_Producto producto);
}
