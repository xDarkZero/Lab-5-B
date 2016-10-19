package lab5.b;

import java.util.Scanner;
import java.util.Random;

public class Lab5B {

    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner captura = new Scanner(System.in);
        int numero;
        int cap = 0;
        System.out.println("De que tamaño quieres el arreglo");
        cap = captura.nextInt();
        char[] array = new char[cap];
        for (int i = 0; i < cap; i++) {

            do {
                array[i] = (char) rnd.nextInt(122);
            } while (array[i] < 97);

        }

        for (int i = 0; i < cap; i++) {
            System.out.println("|" + array[i] + "|");

        }

    }

}
