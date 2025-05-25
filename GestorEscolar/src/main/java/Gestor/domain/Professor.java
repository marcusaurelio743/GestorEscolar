package Gestor.domain;

import javax.persistence.Entity;

import Gestor.emum.Perfil;
@Entity
public class Professor extends Pessoa {

	private static final long serialVersionUID = 1L;
	
	private Perfil perfil;

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Professor() {
		super();
		setPerfil(Perfil.PROFESSOR);
	}

	public Professor(Long id, String nome, String sexo, String email, String telefone, String senha, String endereco) {
		super(id, nome, sexo, email, telefone, senha, endereco);
		setPerfil(Perfil.PROFESSOR);
	}
	

}
