//https://www.beecrowd.com.br/judge/pt/challenges/view/695/4
package DesafioD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String felizNat = "Feliz nat";

        for (int i = 0; i < a; i++) {
            String iVezes = "a";
            felizNat = felizNat + iVezes;
        }
        System.out.println(felizNat + "l!");
    }
}