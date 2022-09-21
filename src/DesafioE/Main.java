//https://www.beecrowd.com.br/judge/pt/challenges/view/695/2
package DesafioE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a += a;
        b += b;
        System.out.println(a + " " + b);

    }
}
