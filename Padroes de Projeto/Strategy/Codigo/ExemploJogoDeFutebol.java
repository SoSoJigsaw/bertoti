public class ExemploJogoDeFutebol {

    // Classe principal de Exemplo que utiliza as demais classes
    public static void main(String[] args) {

        TimeDeFutebol time1 = new TimeDeFutebol("Palmeiras", new VitoriaStrategy());
        TimeDeFutebol time2 = new TimeDeFutebol("Santos", new EmpateStrategy());
        TimeDeFutebol time3 = new TimeDeFutebol("Corinthians", new DerrotaStrategy());

        System.out.println(time1.getNome() + " ganhou " + time1.getPontos() + " pontos.");
        System.out.println(time2.getNome() + " ganhou " + time2.getPontos() + " pontos.");
        System.out.println(time3.getNome() + " ganhou " + time3.getPontos() + " pontos.");

    }

}