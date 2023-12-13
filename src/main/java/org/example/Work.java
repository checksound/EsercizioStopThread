package org.example;

public class Work extends Thread {
    private int pausa;
    public Work(int pausa){
        this.pausa=pausa;
    }

    public void run() {

        System.out.println("PARTENZA THREAD");
        try {System.out.println("ASPETTO " + pausa + " secondi");
            Thread.sleep(pausa*1000);
            System.out.println("PASSATI " + pausa + " secondi");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("FINE THREAD");

    }
}
