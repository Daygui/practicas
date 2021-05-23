package es.uah.usuariosMatriculas.service;

import es.uah.usuariosMatriculas.model.Matricula;

import java.util.List;

public interface IMatriculasService {

    List<Matricula> buscarTodas();

    List<Matricula> buscarMatriculasPorIdCurso(Integer idCurso);

    Matricula buscarMatriculaPorId(Integer idMatricula);

    void guardarMatricula(Matricula matricula);

    void eliminarMatricula(Integer idMatricula);

}
