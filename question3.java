package solutions;

import java.util.Scanner;

//reverse the given number using loop
//input=678
//output=876
public class question3 {
    static void main(String[] args) {
       int number;
        System.out.println("Enter the numer : ");
        Scanner sc = new Scanner(System.in);
        number=sc.nextInt();


        int answer=0;
        while (number>0) {
            int lastdigit = number% 10;
            answer=answer*10+lastdigit;
            number = number/10;

        }
         System.out.println("Reverse number : "+ answer);

    }
}
