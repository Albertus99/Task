import java.util.*;

/*
Given a natural number in the input. Sum the digits of this number. If the
amount turns out to be higher than 9, repeat the process for the new
number as many times as needed, until the sum amount of the digits is
equal or less than 9. Get the last number printed in the output. Use the
recursion method.
*/

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digitSum = sumOfDigits(number);

        while (digitSum > 1) {
            System.out.println(digitSum);
            digitSum = sumOfDigits(digitSum);
            if (digitSum <= 9) {
                System.out.println(digitSum);
                break;
            }
        }

    }

    
    //Iterative
    /* 
 
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n >= 9)
        {
            sum += n % 10;
            n /= 10; }
        return sum;
    }
    */

    //Recursive
    public static int sumOfDigits(int n){
           if(n == 0) return 0;

           return sumOfDigits(n/10) + n%10;
    }
}
