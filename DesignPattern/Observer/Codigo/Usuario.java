class Usuario implements Observer {

    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(int novaQntChuva) {

        if (novaQntChuva <= 2) {

            System.out.println("Chuva leve, sem preocupações!");

        }

        if (novaQntChuva <= 10) {

            System.out.println("Chuva moderada, leve o guarda-chuva!");

        }

        if (novaQntChuva <= 50) {

            System.out.println("Chuva forte, tome cuidado, risco de alagamentos!");

        }

        if (novaQntChuva > 50) {

            System.out.println("Chuva violenta, procure um abrigo adequado");

        }

    }
}

