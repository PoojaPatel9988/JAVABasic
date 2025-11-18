/* Ask user for 2 numbers.print their sum,product and difference.
Input:8,3
Output: Sum=11,Product=24,Difference=5  */

import java.util.Scanner;

public class SumProductDifference
{
    public static void main(String[]args)
    {
        int number1st,number2nd;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number is : ");
        number1st=sc.nextInt();
        System.out.print("Enter 2nd number is : ");
        number2nd=sc.nextInt();

        int sum = number1st + number2nd;
        System.out.println("The sum of two number is : " + sum);

        int product = number1st * number2nd;
        System.out.println("The product of two number is : " + product);

        int difference = number1st - number2nd;
        System.out.println("The difference of two number is : " + difference);

    }
}
