package org.example;

import java.util.Scanner;

public class MainWorkContinuo {

    public static void main(String[] args) {
        int pausa = 5;
        WorkContinuo wk = new WorkContinuo(pausa);
        wk.start();

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            System.out.println("DIGITATO");
            wk.interrupt();
        }

        try {
            wk.join();
        } catch (InterruptedException e) {

        }

        System.out.println("FINE APPLICAZIONE");
    }
}
