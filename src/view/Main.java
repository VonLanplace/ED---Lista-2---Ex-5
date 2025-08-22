package view;

import controller.Mdc;
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Mdc mdc = new Mdc();

        int A = fn_input("Insira um Valor:");
        int B = fn_input("Insira um Valor:");

        System.out.println("MDC(" + A + "," + B + ") = " + mdc.calc(A, B));
    }
    public static int fn_input(String text)
    {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(text);
            int input = in.nextInt();
            return input;
        }
    }
}
