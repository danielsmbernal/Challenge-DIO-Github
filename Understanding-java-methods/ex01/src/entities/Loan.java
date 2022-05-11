package entities;

public class Loan {

    public static void finalPayment (double loanAmount, int numberOfInstallments) {
        if (numberOfInstallments == 1) {
            double payment = loanAmount * 1;
            System.out.println("The amount to be paid in cash is: " + payment);

        } else if (numberOfInstallments == 2) {
            //The amount of taxes for paying in two installments is 30%
            double payment = (loanAmount / 2) * 0.3;
            System.out.println("The amount to be paid per month is: " + payment);

        } else {
            //The amount of taxes for paying in three installments is 45%
            double payment = (loanAmount / 3) * 0.45;
            System.out.println("The amount to be paid per month is: " + payment);
        }
    }
}
