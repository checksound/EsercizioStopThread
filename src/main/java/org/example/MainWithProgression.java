package org.example;

import java.util.Scanner;

public class MainWithProgression {

    public static void main(String[] args) {
        int maxPausa = 15;
        WorkWithProgression wk = new WorkWithProgression(maxPausa);
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
