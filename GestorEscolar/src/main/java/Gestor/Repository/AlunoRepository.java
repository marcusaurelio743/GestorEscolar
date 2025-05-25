package Gestor.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Gestor.domain.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
