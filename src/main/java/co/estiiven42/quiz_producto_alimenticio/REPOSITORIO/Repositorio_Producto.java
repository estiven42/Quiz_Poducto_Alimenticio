package co.estiiven42.quiz_producto_alimenticio.REPOSITORIO;

import co.estiiven42.quiz_producto_alimenticio.ENTIDADES.Entidad_Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio_Producto extends JpaRepository<Entidad_Producto,Long> {
}
