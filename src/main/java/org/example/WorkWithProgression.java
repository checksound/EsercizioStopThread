package org.example;

import java.util.Random;

public class WorkWithProgression extends Thread {
    private class Timer extends Thread {
        private Thread tThread;
        private boolean isActive = true;
        public void doStop() {
            isActive = false;
            if(tThread != null) {
                tThread.interrupt();
                try {
                    tThread.join();
                } catch (InterruptedException e) {
                }
            }
        }

        public void run() {

            tThread = Thread.currentThread();

            while(isActive) {
                System.out.print(".");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    isActive=false;
                }
            }

            System.out.println();
        }

    }
    private int maxPausa;
    public WorkWithProgression(int maxPausa){
        this.maxPausa = maxPausa;
    }

    public void run() {
        System.out.println("PARTENZA THREAD");

        Random random = new Random();
        boolean attivo = true;
        Timer timer = null;

        while(attivo) {
            try {
                int pausa = random.nextInt(maxPausa);
                System.out.println("ASPETTO " + pausa + " secondi");
                timer = new Timer();
                timer.start();
                Thread.sleep(pausa * 1000);
                timer.doStop();
                // System.out.println("PASSATI " + pausa + " secondi");
            } catch (InterruptedException e) {
                attivo = false;
                timer.doStop();
                System.out.println(e.getMessage());
            }
        }
        System.out.println("FINE THREAD");

    }
}
