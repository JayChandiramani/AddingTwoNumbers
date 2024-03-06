package com.jetbrain;
import java.util.Scanner; //Importing a scanner
public class Main {

    public static void main(String[] args) {
        int num1,num2,sum; //Initializing
        Scanner Number_Input=new Scanner(System.in); //Naming the scanner

        //Enter Number 1
        System.out.println("Please enter the first number.");
        num1= Number_Input.nextInt(); //User enter field

        //Enter number 2
        System.out.println("PLease enter the second number");
        num2= Number_Input.nextInt(); //User enter field

        //Printing the sum
        System.out.println("Sum= "+num1+"+"+num2);
        sum=num1+num2; //Function
        System.out.println("The sum of the numbers is: "+sum); //Printing the sum
    }
}
