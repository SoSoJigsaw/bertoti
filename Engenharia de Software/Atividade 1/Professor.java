public class Professor {
	
		private String disciplina;
		private String curso;
		
		public Professor(String disciplina, String curso) {
			this.disciplina = disciplina;
			this.curso = curso;
		}
		
		public String getDisciplina() {
			return disciplina;
		}
		
		public void setDisciplina(String novoDisciplina) {
			disciplina = novoDisciplina;
		}
		
		public String getCurso() {
			return curso;
		}
		
		public void setCurso(String novoCurso) {
			curso = novoCurso;
		}
}