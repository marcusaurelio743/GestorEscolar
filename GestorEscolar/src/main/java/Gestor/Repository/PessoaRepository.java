package Gestor.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Gestor.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
