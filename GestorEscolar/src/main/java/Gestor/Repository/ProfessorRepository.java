package Gestor.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Gestor.domain.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
