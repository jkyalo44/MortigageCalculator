package com.codejustoh;

import java.security.Principal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	final byte Months = 12;
       final byte Percent = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal:");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate (%): ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyRate = annualInterestRate / Months / Percent;

        System.out.println("Period (Years):");
        byte Years = scanner.nextByte();
        int noPayment = Years * Months;

        double Mortgage = ( principal * (monthlyRate * Math.pow(1 + monthlyRate , noPayment)) / (Math.pow(1 + monthlyRate , noPayment) - 1) );

        String Result = NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println("Mortgage:" + Result + "\n");
    }
}
