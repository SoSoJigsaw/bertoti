public class Aluno {
	
		private int semestre;
		private String curso;
		private int ra;
		
		public Aluno(String semestre, String curso, int ra) {
			this.semestre = semestre;
			this.curso = curso;
			this.ra = ra;
		}
		
		public int getSemestre() {
			return semestre;
		}
		
		public void setSemestre(int novoSemestre) {
			semestre = novoSemestre;
		}
		
		public String getCurso() {
			return curso;
		}
		
		public void setCurso(String novoCurso) {
			curso = novoCurso;
		}
		
		public int getRa() {
			return ra;
		}
		
		public void setRa(int novoRa) {
			ra = novoRa;
		}
}