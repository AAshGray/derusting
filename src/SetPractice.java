import java.util.HashSet;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    HashSet<String> set = new HashSet<String>();

    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    set.add("coffee");
    set.add("tea");
    set.add("juice");

    // Check whether the Set contains a given String
    if (set.contains("juice")) {
      System.out.println("Set contains 'juice'.");
    } else {
      System.out.println("Set does not contain 'juice'");
    }
    // Remove an element from the Set
    set.remove("juice");

    // Get the size of the Set
    System.out.println("The set contains " + set.size() + " items.");

    // Iterate over the elements of the Set, printing each one on a separate line
    for (String string : set) {
      System.out.println(string);
    }
    
    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
