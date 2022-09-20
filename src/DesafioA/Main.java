//https://www.beecrowd.com.br/judge/pt/challenges/view/695/1
package DesafioA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a < b) {
            if (b >= 0 && b <= 2) {
                System.out.println("nova");
            } else if (b >= 3 && b <= 96) {
                System.out.println("crescente");
            } else if (b >= 97 & b <= 100) {
                System.out.println("cheia");
            }
        } else {
            if (b >= 3 && b <= 96) {
                System.out.println("minguante");
            } else if (b >= 97 && b <= 100) {
                System.out.println("cheia");
            } else if (b >= 0 && b <= 2) {
                System.out.println("nova");
            }
        }
    }
}