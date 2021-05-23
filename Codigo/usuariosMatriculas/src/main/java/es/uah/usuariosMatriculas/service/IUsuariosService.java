package es.uah.usuariosMatriculas.service;

import es.uah.usuariosMatriculas.model.Usuario;

import java.util.List;

public interface IUsuariosService {

    List<Usuario> buscarTodos();

    Usuario buscarUsuarioPorId(Integer idUsuario);

    Usuario buscarUsuarioPorNombre(String nombre);

    Usuario buscarUsuarioPorCorreo(String correo);

    void guardarUsuario(Usuario usuario);

    void eliminarUsuario(Integer idUsuario);

    void actualizarUsuario(Usuario usuario);

    void eliminarMatricula(Integer idUsuario, Integer idMatricula);

}
