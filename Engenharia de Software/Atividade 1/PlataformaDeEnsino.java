import java.util.LinkedList;
import java.util.List;
import java.io.*;


public class PlataformaDeEnsino {
	
	private List<Pessoa> pessoas = new LinkedList<Pessoa>();
	private List<Disciplina> disciplinas = new LinkedList<Disciplina>();

	public void cadastrarPessoa(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public void cadastrarDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}
	
	public void deletePessoa(Pessoa pessoa) {
		pessoas.delete(pessoa);
	}
	
	public void deleteDisciplina(Disciplina disciplina) {
		disciplinas.delete(disciplina);
	}
	
}