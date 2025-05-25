package Gestor;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Gestor.Repository.AlunoRepository;
import Gestor.Repository.DisciplinaRepository;
import Gestor.Repository.ProfessorRepository;
import Gestor.Repository.SecretariaRepository;
import Gestor.domain.Aluno;
import Gestor.domain.Disciplina;
import Gestor.domain.Professor;
import Gestor.domain.Secretaria;
import Gestor.emum.Perfil;

@Service
public class DBService {
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	@Autowired
	private ProfessorRepository professorRepository;
	@Autowired
	private SecretariaRepository secretariaRepository;
	
	public void InstanciaDB() {
		
		Aluno aluno1 = new Aluno(null, "Maria", "Feminino", "Maria@email.com", "654343434", "admin", "endereco teste");
		Aluno aluno2 = new Aluno(null, "jose", "masculino", "jose@email.com", "654343434", "admin", "endereco teste");
		Aluno aluno3 = new Aluno(null, "Paula", "Feminino", "Paula@email.com", "654343434", "admin", "endereco teste");
		Aluno aluno4 = new Aluno(null, "Carla", "Feminino", "Carla@email.com", "654343434", "admin", "endereco teste");
		
		Professor professor1 = new Professor(null, "Paulo", "Masculino", "p@email.com","787878878", "admin", "endereco");
		Professor professor2 = new Professor(null, "Jose", "Masculino", "jose@email.com","787878878", "admin", "endereco");
		Professor professor3 = new Professor(null, "Andrade", "Masculino", "andrade@email.com","787878878", "admin", "endereco");
		
		professor1.setPerfil(Perfil.ADMIN);
		
		Disciplina disciplina1 = new Disciplina(null, "Programação Orientada Objetos",7.0 , aluno1, professor3);
		Disciplina disciplina2 = new Disciplina(null, "Logica de Programação",6.0 , aluno2, professor1);
		Disciplina disciplina3 = new Disciplina(null, "Banco de dados",9.8 , aluno3, professor2);
		
		Disciplina disciplina4 = new Disciplina(null, "Analise de Sistemas",6.6 , aluno4, professor1);
		
		Secretaria secretaria = new Secretaria(null, "maria de fatima", "feminino", "fatima@email.com", "3232323232", "admin", "endereco");
		secretaria.setPerfil(Perfil.ADMIN);
		
		professorRepository.saveAll(Arrays.asList(professor1,professor2, professor3));
		
		alunoRepository.saveAll(Arrays.asList(aluno1,aluno2,aluno3,aluno4));
		
		disciplinaRepository.saveAll(Arrays.asList(disciplina1,disciplina2,disciplina3,disciplina4));
		
		secretariaRepository.saveAll(Arrays.asList(secretaria));
		
		
	}

}
