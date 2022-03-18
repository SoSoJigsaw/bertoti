import java.util.LinkedList;
import java.util.List;
import java.io.*;

public class Disciplina {
	
		private String nome;
		private String curso;
		private int semestre;
		
		private List<Professor> professores = new LinkedList<Professor>();
		private List<Aluno> alunos = new LinkedList<Aluno>();
		
		public Disciplina(String nome, String curso, int semestre) {
			this.nome = nome;
			this.curso = curso;
			this.semestre = semestre;
		}	
		
		public void cadastrarAlunoDisciplina(Aluno aluno) {
			alunos.add(aluno);
		}
		
		public void cadastrarProfessorDisciplina(Professor professor) {
			professores.add(professor);
		}
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String novoNome) {
			nome = novoNome;
		}
		
		public String getCurso() {
			return curso;
		}
		
		public void setCurso(String novoCurso) {
			curso = novoCurso;
		}
		
		public int getSemestre() {
			return semestre;
		}
		
		public void setSemestre(Int novoSemestre) {
			semestre = novoSemestre;
		}
		
		public void deleteAlunoDisciplina(Aluno aluno) {
			alunos.delete(aluno);
		}
		
		public void deleteProfessorDisciplina(Professor professor) {
			professores.delete(professor);
		}
}