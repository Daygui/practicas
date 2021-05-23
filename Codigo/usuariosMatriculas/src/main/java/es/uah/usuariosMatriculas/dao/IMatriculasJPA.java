package es.uah.usuariosMatriculas.dao;

import es.uah.usuariosMatriculas.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMatriculasJPA extends JpaRepository<Matricula, Integer> {

    List<Matricula> findByIdCurso(int idCurso);

}
