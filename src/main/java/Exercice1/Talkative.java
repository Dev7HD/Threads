package Exercice1;

public class Talkative implements Runnable {
    private int nb;

    public Talkative(int nb) {
        this.nb = nb;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println(nb);
        }
    }
}
