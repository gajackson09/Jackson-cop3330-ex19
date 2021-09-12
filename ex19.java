/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */
 
//this program calculates the body mass index (BMI) for a person using the person’s height in inches and weight in pounds
import java.util.Scanner;
public class ex19{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);    
    
        //asks user for weight and height
        System.out.print("Please enter your weight in pounds: ");        
            double W = input.nextDouble();
        System.out.print("Please enter your height in inches: ");
            double H = input.nextDouble();
         
        //calculates the bmi
        double BMI = (W / (H * H)* 703);
         
        System.out.println("Your BMI is: "+BMI);

        if(BMI < 18.5) {
            System.out.println("You are underweight. Please consult a doctor.");
        }else if (BMI < 25) {
            System.out.println("You are normal");
        }else if (BMI < 30) {
            System.out.println("You are overweight and consult a doctor.");
        }else {
            System.out.println("You are obese and consult a doctor");
        }//end of if else loops
    }//end of main
}//end of class