package solutions;

import java.util.Scanner;

//find the smallest number among three number
public class question4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter first numer: ");
        int a = sc.nextInt();

        System.out.println("Enter second numer: ");
        int b = sc.nextInt();

        System.out.println("Enter third numer: ");
        int c = sc.nextInt();

        int smallest;
        if (a<=b && a<=c ) {
            smallest = a;
        }else if (b<=a && b<=c) {
            smallest = b;
        }else {
            smallest=c;
        }
        System.out.println("The smallest number is:" + smallest);
    }
}
