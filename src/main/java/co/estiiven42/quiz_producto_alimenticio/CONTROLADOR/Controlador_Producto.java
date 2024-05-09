package co.estiiven42.quiz_producto_alimenticio.CONTROLADOR;

import co.estiiven42.quiz_producto_alimenticio.ENTIDADES.Entidad_Producto;
import co.estiiven42.quiz_producto_alimenticio.REPOSITORIO.Repositorio_Producto;
import co.estiiven42.quiz_producto_alimenticio.SERVICIOS.Servicios_Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class Controlador_Producto
{
    @Autowired
    private Servicios_Producto serviciosProducto;

    @GetMapping("/productosLista")
    public String listarProductos(Model modelo)
    {
        modelo.addAttribute("producto",serviciosProducto.listarProductos());
        return "productosLista";
    }
    @GetMapping("/nuevoProducoX")
    public String formularioProducto(Model modelo) {
        Entidad_Producto producto = new Entidad_Producto();
        modelo.addAttribute("   productos", producto);
        return "registroXproducto";
    }
    @PostMapping("/nuevoProducto")
    public String guardarProducto(@ModelAttribute("productos")Entidad_Producto producto) {
        serviciosProducto.guardarProducto(producto);
        return "redirect:/ListaProductosN";
    }

}
