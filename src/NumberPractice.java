public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float negativeFloat = -3.14f;
    System.out.println("A negative float is: " + negativeFloat);
    
    // Create an int with a positive value and assign it to a variable
    int positiveInt = 3;
    System.out.println("A positive int is: " + positiveInt);
    
    // Use the modulo % operator to find the remainder when the int is divided by 3
    int remainder = positiveInt % 3;
    System.out.println("When you divide " + positiveInt + " by 3, the remainder is: " + remainder);
    
    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.

    if (positiveInt % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }

    // Divide the number by another number using integer division
    int anotherInt = 2;

    int result = positiveInt / anotherInt;
    System.out.println("When you divide " + positiveInt + " by " + anotherInt + " the answer is rounded down to: " + result);
    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
