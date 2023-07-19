package Exercises;
/*
- Create a class that calculates a certain percentage of a given salary
- create a class
- Accept an entry value for salary
- Set the percentage value
- calculate the percentage */

public class Exercise1 {
    public static void main(String[] args) {
        float salary = 1000F;
        float percentage = 10F;
        float salaryPercentage = salary * percentage / 100;
        System.out.println("The salary percentage is: " + salaryPercentage);
    }
}