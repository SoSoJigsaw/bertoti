public class Pessoa {
		
		private String nome;
		private String email;
		private String senha;
		private boolean professor;
		private boolean aluno;
		
		public Pessoa(String nome, String email, String senha, boolean professor, boolean aluno) {
			this.nome = nome;
			this.email = email;
			this.senha = senha;
			this.professor = professor;
			this.aluno = aluno;
		}

		public String getNome(){
			return nome;
		}
		
		public void setNome(String novoNome){
			nome = novoNome;
		}
		
		public String getEmail(){
			return email;
		}
		
		public void setEmail(String novoEmail){
			email = novoEmail;
		}
		
		public String getSenha(){
			return senha;
		}
		
		public void setSenha(String novaSenha){
			senha = novaSenha;
		}
		
		public boolean getAluno() {
			return aluno;
		}
		
		public boolean getProfessor() {
			return professor;
		}
				
	}