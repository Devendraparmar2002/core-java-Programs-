/*
-> Developed By : Devendra Parmar
-> Topic : Geeting Input From the User
*/

//Scanner Class To get input from the user
import java.util.Scanner;

public class Input{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.print("The Sum of Three Number Is : ");
        System.out.println(sum);
    }
}