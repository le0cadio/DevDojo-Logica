// If salary be higher than 4500, print 30% of value, if not print 15%

package Exercises;

public class Exercise4 {

    public static void main(String[] args) {
        float salary = 3000F;
        if (salary > 4500) {
            System.out.println("30% of salary is: " + (salary * 0.3));
        } else {
            System.out.println("15% of salary is: " + (salary * 0.15));
        }
    }
}
