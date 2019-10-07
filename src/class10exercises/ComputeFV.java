/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class10exercises;

import java.lang.Math;
import java.util.Scanner;

/**
 * 10-1 Exercise Problem 1
 * Computes FV of an investment
 * Thanh Tran
 * Date: November 12, 2018
 */
public class ComputeFV {

    // define method that will take three arguments and compute the future 
    // invest amount and return it as a double
    // 1. Investment amount as double
    // 2. interest rate as monthly
    // 3. Investment period in years as integer value
    
    
    public static double futureInvestmentCalculation(double amount, double i, int n){
        
        double fValue = 0;
        
        fValue = amount * Math.pow((1 + i), (n*12));    // computes future value
        
        return fValue;
    }
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        
        // get investment amount from the user
        System.out.println ("Would you like to start this program? Y = Yes N = No");
        String s = input.nextLine();
        char ch = s.charAt(0);
        
        do {
        System.out.println ("Please enter the investment amount: ");
        double iAmount = input.nextDouble();
        System.out.println ("Please enter the annual interest rate: ");
        double rate = input.nextDouble();
        double monthlyRate = rate / 1200;
        System.out.println ("Please enter the number of years");
        int y = input.nextInt();
        System.out.println ("Years  Future Value"); // print the title of the table
        
        
            for(int x = 1; x <= y; x++) {

               double fInvest = futureInvestmentCalculation(iAmount, monthlyRate, y); 
               System.out.printf("%5d %15.2f \n", x, fInvest);
            }   // end of for loop
        } while (s == "Y");
        
    }   // end of main
}
