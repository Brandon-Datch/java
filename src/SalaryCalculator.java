import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for employee number
        System.out.print("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP: ");
        int employeeNumber = scanner.nextInt();

        // Consume the newline character
        scanner.nextLine();

        // Prompt the user for other employee details
        System.out.println("\n\t\t\tSHREE KRISHNA CHEMISTS AND DRUGGIST  ");
        System.out.println("\t\t\t\t\tSALARY MONTH 9 2013");

        System.out.print("EMP.NO.: "+employeeNumber);

        System.out.print("\t\tEMP. NAME: ");
        String empName = scanner.nextLine();

        System.out.print("DESIGNATION: ");
        String designation = scanner.nextLine();

        System.out.print("DAYS WORKED: ");
        int daysWorked = scanner.nextInt();

        System.out.print("PAY RATE: ");
        double payRate = scanner.nextDouble();

        // Consume the newline character
        scanner.nextLine();

        System.out.print("GEN.DATE: ");
        String genDate = scanner.nextLine();

        // Calculate Earnings and Deductions
        double basicPay = daysWorked * payRate;
        double pf = basicPay / 10;
        double profTax = basicPay * 0.20;
        double grossEarnings = basicPay;
        double totalDeductions = pf + profTax;
        double netPay = grossEarnings - totalDeductions;

        // Display the payslip
        System.out.println("\nEARNINGS");
        System.out.println("AMOUNT (RS.)\t\t\t\tDEDUCTIONS");
        System.out.println("BASIC PAY: " + basicPay + "\t\t\tP.F.: " + pf);
        System.out.println("GROSS EARNINGS: " + grossEarnings + "\tPROF. TAX: " + profTax);
        System.out.println("NET PAY: " + netPay+"\t\t\tTOTAL DEDUCT.: " + totalDeductions);

        // Close the scanner
        scanner.close();
    }
}
