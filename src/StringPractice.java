import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String string = "example";

    // Find the length of the string
    int stringLength = string.length();
    System.out.println(stringLength);

    // Concatenate (add) two strings together and reassign the result
    string = string + " 1; " + string + " 2";
    System.out.println(string);

    // Find the value of the character at index 3
    System.out.println(string.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    Boolean containsSubstring = string.contains("example");
    System.out.println("The sentence contains example?: " + containsSubstring);

    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < string.length(); i++) {
      System.out.println(string.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> stringArray = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    stringArray.add("example 1");
    stringArray.add("example 2");
    stringArray.add("example 3");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joinedString = String.join(", ", stringArray);
    System.out.println(joinedString);

    // Check whether two strings are equal
    String first = "test";
    String second = "text";

    System.out.println("String 'test' equals 'text'?: " + first.equals(second));
    /*java
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
