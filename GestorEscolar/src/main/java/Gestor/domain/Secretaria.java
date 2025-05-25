package Gestor.domain;

import javax.persistence.Entity;

import Gestor.emum.Perfil;
@Entity
public class Secretaria extends Pessoa {
	
	private static final long serialVersionUID = 1L;
	private Perfil perfil;

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public Secretaria() {
		super();
		setPerfil(Perfil.SECRETARIA);
	}

	public Secretaria(Long id, String nome, String sexo, String email, String telefone, String senha, String endereco) {
		super(id, nome, sexo, email, telefone, senha, endereco);
		setPerfil(Perfil.SECRETARIA);
	}
	

}
