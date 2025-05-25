package Gestor.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import Gestor.emum.Perfil;

@Entity
public class Aluno extends Pessoa {

	
	private static final long serialVersionUID = 1L;
	private Perfil perfil;
	
	@JsonIgnore
	@OneToMany(mappedBy = "aluno")
	private List<Disciplina> disciplinas = new ArrayList<>();

	public Aluno() {
		super();
		setPerfil(Perfil.ALUNO);
	}

	public Aluno(Long id, String nome, String sexo, String email, String telefone, String senha, String endereco) {
		super(id, nome, sexo, email, telefone, senha, endereco);
		setPerfil(Perfil.ALUNO);
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void AddDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
	
	
	

}
