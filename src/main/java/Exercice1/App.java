package Exercice1;

public class App {
    public static void main(String[] args) {
        Talkative a1 = new Talkative(1);
        Talkative a2 = new Talkative(2);
        Talkative a3 = new Talkative(3);
        Talkative a4 = new Talkative(4);
        Talkative a5 = new Talkative(5);
        Talkative a6 = new Talkative(6);
        Talkative a7 = new Talkative(7);
        Talkative a8 = new Talkative(8);
        Talkative a9 = new Talkative(9);
        Talkative a10 = new Talkative(10);

        new Thread(a1).start();
        new Thread(a2).start();
        new Thread(a3).start();
        new Thread(a4).start();
        new Thread(a5).start();
        new Thread(a6).start();
        new Thread(a7).start();
        new Thread(a8).start();
        new Thread(a9).start();
        new Thread(a10).start();
    }
}
