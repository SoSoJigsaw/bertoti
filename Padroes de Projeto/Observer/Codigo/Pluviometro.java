import java.util.ArrayList;


public class Pluviometro implements Subject {
    private ArrayList<Observer> observers = new ArrayList();
    private int qntChuva;

    public Pluviometro(int qntChuva) {

        this.qntChuva = qntChuva;

    }

    public void setQntChuva(int qntChuva) {

        this.qntChuva = qntChuva;

        this.notifyObservers();

    }

    @Override
    public void registerObserver(Observer observer) {

        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {

        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {

        for (Observer observer : observers) {

            System.out.println("Notificando os observers");
            observer.update(this.qntChuva);

        }
    }
}
