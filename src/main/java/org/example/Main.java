package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pausa = 5;
        Work wk = new Work(pausa);
        wk.start();

         try {
            wk.join();
        } catch (InterruptedException e) {

        }

        System.out.println("FINE APPLICAZIONE");
    }
}
