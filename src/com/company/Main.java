package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Process Customer Record

        //Prompt User for customerName
        //Get customerName
        //Prompt User for purchaseAmount
        //Get purchaseAmount
        //Prompt User for taxCode
        //Get taxCode
        //Compute saleTax and totalAmountDue
        //Display customerName

//        String customerName;
//        double purchaseAmount;
//        double[] taxCode= new double[]{0, .03, .05, .07};
//        double salesTax;
//        double totalAmount;

        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.print("Customer Name: ");
//        customerName = scanner.next();
//        System.out.print("Purchase Amount: $");
//        purchaseAmount = scanner.nextDouble();
//        System.out.print("Please indicate corresponding tax Code:");
//        System.out.print("\n");
//        System.out.print("0  tax exempt (0%)");
//        System.out.print("\n");
//        System.out.print("1  state sales tax only (3%)");
//        System.out.print("\n");
//        System.out.print("2  federal and state sales tax (5%)");
//        System.out.print("\n");
//        System.out.print("3  special sales tax (7%)");
//        System.out.print("\n");
//        System.out.print("Tax Code: ");
//        int taxCodeInput = scanner.nextInt();
//
//        if (taxCodeInput == 0) {
//            salesTax = taxCode[0];
//            totalAmount = purchaseAmount;
//            System.out.print("Customer Name: " + customerName);
//            System.out.print("\n");
//            System.out.print("The purchase amount was: " + purchaseAmount);
//            System.out.print("\n");
//            System.out.print("The sales tax is: " + salesTax);
//            System.out.print("\n");
//            System.out.print("The total amount due is: " + totalAmount);
//        } else if (taxCodeInput == 1) {
//            salesTax = taxCode[1] * purchaseAmount;
//            totalAmount = purchaseAmount + salesTax;
//            System.out.print("Customer Name: " + customerName);
//            System.out.print("\n");
//            System.out.print("The purchase amount was: " + purchaseAmount);
//            System.out.print("\n");
//            System.out.print("The sales tax is: " + salesTax);
//            System.out.print("\n");
//            System.out.print("The total amount due is: " + totalAmount);
//        } else if (taxCodeInput == 2) {
//            salesTax = taxCode[2] * purchaseAmount;
//            totalAmount = purchaseAmount + salesTax;
//            System.out.print("Customer Name: " + customerName);
//            System.out.print("\n");
//            System.out.print("The purchase amount was: " + purchaseAmount);
//            System.out.print("\n");
//            System.out.print("The sales tax is: " + salesTax);
//            System.out.print("\n");
//            System.out.print("The total amount due is: " + totalAmount);
//        } else if (taxCodeInput == 3) {
//            salesTax = taxCode[3] * purchaseAmount;
//            totalAmount = purchaseAmount + salesTax;
//            System.out.print("Customer Name: " + customerName);
//            System.out.print("\n");
//            System.out.print("The purchase amount was: " + purchaseAmount);
//            System.out.print("\n");
//            System.out.print("The sales tax is: " + salesTax);
//            System.out.print("\n");
//            System.out.print("The total amount due is: " + totalAmount);
//        }



        //Calculate Employee's Pay

        //Prompt user for employeeNumber
        //Prompt user for payRate
        //Prompt user for hoursWorked

        //IF payRate > 25.00 or hoursWorked > 60
        //      Display not to be calculated message
        //ENDIF

        //IF hoursWorked > 35 and <= 60
        //      overTimeHours = (hoursWorked - 35)
        //      overTimePay = (overTimeHours * (payRate * 1.5)
        //      totalPay = ((hoursWorked - overTimeHours) * payRate) + overTimePay
        //      Display employeeNumber and weekly pay (totalPay)
        //ENDIF

        //ELSE hoursWorked <= 35
        //      totalPay = ((hoursWorked) * payRate);
        //      Display employeeNumber and weekly pay (totalPay)
        //ENDELSE


        int employeeNumber;
        double payRate;
        double hoursWorked;

        double overTimeHours;
        double overTimePay;
        double totalPay;

        System.out.print("EmployeeNumber: ");
        employeeNumber = scanner.nextInt();

        System.out.print("Pay Rate: $");
        payRate = scanner.nextDouble();

        System.out.print("Hours worked: ");
        hoursWorked = scanner.nextDouble();

        if (payRate > 25.00 || hoursWorked > 60) {
            System.out.print("The weekly pay for " + employeeNumber + " cannot be calculated.");
        }
        else if (hoursWorked > 35 && hoursWorked <= 60){
            overTimeHours = (hoursWorked - 35);
            overTimePay = overTimeHours * (payRate * 1.5);
            totalPay = ((hoursWorked - overTimeHours) * payRate) + overTimePay;
            System.out.print("The weekly pay for " + employeeNumber + " is $" + totalPay);

        }
        else if (hoursWorked <= 35){
            totalPay = (hoursWorked * payRate);
            System.out.print("The weekly pay for " + employeeNumber + " is $" + totalPay);
        }


    }
}
