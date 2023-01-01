package poczatkowe;

import java.text.NumberFormat;
import java.util.Scanner;

public class Zadania {
    public static void main(String[] args) {
        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Principal: ");
            principal = scan.nextInt();
            if (principal >= 1000 && principal <= 1000000){
                break;
            }
            System.out.println("Enter a value between 1k and 1m: ");
        }

        while (true) {
            System.out.print("Annual interest rate: ");
            float annualInterest = scan.nextFloat();
            if (annualInterest > 0 && annualInterest <= 30){
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 0 and 30: ");
        }

        while (true) {
            System.out.print("Period (in years): ");
            int period = scan.nextInt();
            if (period >= 1 && period <= 30) {
                numberOfPayments = period * MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30: ");
        }

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}

