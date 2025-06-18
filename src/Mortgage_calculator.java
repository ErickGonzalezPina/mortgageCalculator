import javax.swing.*;

public class mortgage_calculator {
        public static void main(String[] args) {
                // Collect general information about the user.
                // from firstName to zipCode the info wont be used for calculations
                String firstName = JOptionPane.showInputDialog(null,
                                "Enter Your First Name",
                                "First Name",
                                JOptionPane.QUESTION_MESSAGE);

                String lastName = JOptionPane.showInputDialog(null,
                                "Enter Your Last Name",
                                "Last Name",
                                JOptionPane.QUESTION_MESSAGE);

                String address = JOptionPane.showInputDialog(null,
                                "Enter Your Address",
                                "Address",
                                JOptionPane.QUESTION_MESSAGE);

                String city = JOptionPane.showInputDialog(null,
                                "Enter City",
                                "City",
                                JOptionPane.QUESTION_MESSAGE);

                String state = JOptionPane.showInputDialog(null,
                                "Enter State Two Letter Code",
                                "State",
                                JOptionPane.QUESTION_MESSAGE);

                String zipCode = JOptionPane.showInputDialog(null,
                                "Enter Zip Code",
                                "Zip Code",
                                JOptionPane.QUESTION_MESSAGE);

                // Take the principal amount for the loan and convert it to double for
                // calculations
                String amount_principal = JOptionPane.showInputDialog(null,
                                "Enter Principal",
                                "Principal",
                                JOptionPane.QUESTION_MESSAGE);
                double principal = Double.parseDouble(amount_principal);

                // Take the interest Rate and convert it to double
                String amount_interest = JOptionPane.showInputDialog(null,
                                "Enter Annual Interest Rate",
                                "Interest Rate",
                                JOptionPane.QUESTION_MESSAGE);
                double annualInterestRate = Double.parseDouble(amount_interest);

                // prompts the user for the number of years they have to make payments
                String amount_years = JOptionPane.showInputDialog(null,
                                "Enter Number of Years for the Loan",
                                "years",
                                JOptionPane.QUESTION_MESSAGE);
                int years = Integer.parseInt(amount_years);

                // convert the annual interest rate to monthly rate then to decimal for the
                // equation
                double k = annualInterestRate / 12 / 100;
                // m is the number of payments in a year
                int m = years * 12;
                // equation to calculate the money which needs to be paid each month to pay for
                // the loan plus interest
                double monthly_payment = principal * (k * Math.pow(1 + k, m)) / (Math.pow(1 + k, m) - 1);
                int int_monthly_payment = (int) Math.round(monthly_payment);
                String payment = String.format("%d", int_monthly_payment);

                // display the data collected from the user
                JOptionPane.showMessageDialog(null,
                                "           Mortgage Loan Calculator" + "\n" +
                                                " ________________________________" + "\n" +
                                                "             Personal Information  " + "\n" +
                                                " ________________________________" + "\n" +
                                                "   First Name    : " + firstName + "\n" +
                                                "   Last Name    : " + lastName + "\n" +
                                                "   Address        : " + address + "\n" +
                                                "                           : " + city + ", " + state + ", " + zipCode
                                                + "\n" +
                                                " ________________________________" + "\n" +
                                                "                    Loan Terms  " + "\n" +
                                                "_________________________________" + "\n" +
                                                "               Principal         : " + amount_principal + "\n" +
                                                "               Interest Rate  : " + amount_interest + "\n" +
                                                "               Years               : " + amount_years + "\n" +
                                                "_________________________________" + "\n" +
                                                "                    Monthly Payment  " + "\n" +
                                                "_________________________________" + "\n" +
                                                "            Monthly Payment : " + payment + "\n" +
                                                "_________________________________",

                                "Project 1 - Mortgage Calculator",
                                JOptionPane.INFORMATION_MESSAGE);
        }
}
