package org.example;

public class WorkContinuo extends Thread {
    private int pausa;
    public WorkContinuo(int pausa){
        this.pausa=pausa;
    }

    public void run() {

        System.out.println("PARTENZA THREAD");

        boolean attivo = true;
        while(attivo) {
            try {
                System.out.println("ASPETTO " + pausa + " secondi");
                Thread.sleep(pausa * 1000);
                System.out.println("PASSATI " + pausa + " secondi");
            } catch (InterruptedException e) {
                attivo = false;
                System.out.println(e.getMessage());
            }
        }
        System.out.println("FINE THREAD");

    }
}
