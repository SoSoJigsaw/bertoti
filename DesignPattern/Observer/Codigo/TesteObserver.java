//Exemplo de uso

public class TesteObserver {
    public static void main(String[] args) {

        Pluviometro pluviometro = new Pluviometro(23);

        Usuario usuario1 = new Usuario("Felipe");
        Usuario usuario2 = new Usuario("Raquel");

        pluviometro.registerObserver(usuario1);
        pluviometro.registerObserver(usuario2);

        pluviometro.setQntChuva(35);
    }
}