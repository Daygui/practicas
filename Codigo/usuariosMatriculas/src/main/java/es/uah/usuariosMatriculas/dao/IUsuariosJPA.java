package es.uah.usuariosMatriculas.dao;

import es.uah.usuariosMatriculas.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuariosJPA extends JpaRepository<Usuario, Integer> {

    Usuario findByNombre(String nombre);

    Usuario findByCorreo(String correo);

}
