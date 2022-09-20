//https://www.beecrowd.com.br/judge/pt/challenges/view/695/2
package DesafioB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sub = m - a - b;
        if (sub > a && sub > b) {
            System.out.println(sub);
        } else if (a > sub && a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}