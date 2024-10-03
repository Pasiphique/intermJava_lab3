package lab3;


/* pasiphique OSward
pao36
lab2
*/

import java.util.Random;
import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {
        double salary = 0;
        double annualIncrease = 0;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("what is your annual salary?");
            salary = input.nextDouble();

            System.out.printf("Annuel salary: $%,.2f \n", salary);

            System.out.println("what is your expected annual increase(between 1% and 10%)?");
            annualIncrease = input.nextDouble();

            System.out.println("Annuel increase rate is: " + annualIncrease + "%");

            Random random = new Random();
            int bonusYear = 0;
            bonusYear = random.nextInt(5) + 1;

            double currentSalary = 0;
            int year = 0;

            double annualSalary = salary;
            double bonus = 5000;
            for (year = 1; year < 11; year++) {
                if (year == bonusYear) {
                    currentSalary = (.01 * annualIncrease) * annualSalary + annualSalary + bonus;
                    System.out.printf("year %d Salary: $%,.2f ** Bonus Year** \n", year, currentSalary);
                    annualSalary = currentSalary;

                } else {

                    currentSalary = (.01 * annualIncrease) * annualSalary + annualSalary;
                    System.out.printf("year %d Salary: $%,.2f \n", year, currentSalary);
                    annualSalary = currentSalary;
                }
            }
        } catch (Exception e) {
            System.out.print("Invalid input! try again");
        }

    }

}
