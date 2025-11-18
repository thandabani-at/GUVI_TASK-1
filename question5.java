package solutions;

import java.util.Scanner;

public class question5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter purchase amount ");

        double amount = sc.nextDouble();

        double discount = 0.0;
        double finalamount ;

        if (amount < 500){
            discount=0;
        }else if (amount>= 500 && amount <=1000){
            discount = amount * 0.10;
        }else if (amount>1000){
            discount=amount * 0.20;

        }
        finalamount=amount-discount;

        System.out.println("Purchase amount:" + amount);
        System.out.println("Discount:" + discount);
        System.out.println("Final payable amount:"+ finalamount);
    }
}
