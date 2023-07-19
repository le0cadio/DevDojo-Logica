/*
create a variable that will store the value of a salary
calculate the percentage of this salary, the percentage values will be 30% 15% 5%

every time you calculate save the result in a variable and print the result and
reuse the variable that stores the result for the new calculation
*/
package Exercises;

public class Exercise2 {
    public static void main(String[] args) {
        float salary = 1000F;
        float percentage = 30F;
        float salaryPercentage = salary * percentage / 100;
        System.out.println("The salary percentage 30% is: " + salaryPercentage);

        percentage = 15F;
        salaryPercentage = salary * percentage / 100;
        System.out.println("The salary percentage 15% is: " + salaryPercentage);

        percentage = 5F;
        salaryPercentage = salary * percentage / 100;
        System.out.println("The salary percentage 5% is: " + salaryPercentage);
    }
}