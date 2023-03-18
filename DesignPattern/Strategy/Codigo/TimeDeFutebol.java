// Classe que representa um time em um jogo de futebol
public class TimeDeFutebol {

    private String nome;
    private ResultadoJogoStrategy resultadoJogoStrategy;

    public TimeDeFutebol(String nome, ResultadoJogoStrategy resultadoJogoStrategy) {

        this.nome = nome;
        this.resultadoJogoStrategy = resultadoJogoStrategy;

    }

    public String getNome() {

        return nome;

    }

    public int getPontos() {

        return resultadoJogoStrategy.getPontos();

    }

}

