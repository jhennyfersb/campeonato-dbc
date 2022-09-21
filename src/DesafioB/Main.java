//https://www.beecrowd.com.br/judge/pt/challenges/view/695/2
package DesafioB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
         m = m - a - b;
        if (m > a && m > b) {
            System.out.println(m);
        } else if (a > m && a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}