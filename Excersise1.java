/*
-> Excersise Program of Chapter-1
-> Developed By : Devendra Parmar
-> Topic : CBSE Percentage Calculator
*/
import java.util.Scanner;

public class Excersise1{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("-----CBSE Board Percentage Calculator-----");

        System.out.print("Science : ");
        float subjact1 = sc.nextFloat();

        System.out.print("English : ");
        float subjact2 = sc.nextFloat();

        System.out.print("Gujarti : ");
        float subjact3 = sc.nextFloat();

        System.out.print("Hindi : ");
        float subjact4 = sc.nextFloat();

        System.out.print("Maths : ");
        float subjact5 = sc.nextFloat();

        float total = subjact1 + subjact2 + subjact3 + subjact4 + subjact5;
        System.out.print("Total : ");
        System.out.println(total);

        float percentage = (total*100)/500f;
        System.out.print("Peercentage : ");
        System.out.print(percentage);
    }
}