public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] strings = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    strings[0] = "aardvark";
    strings[1] = "bison";
    strings[2] = "donkey";
    strings[3] = "cheetah";

    // Get the value of the array at index 2
    String indexTwo = strings[2];
    System.out.println(indexTwo);
    
    // Get the length of the array
    int length = strings.length;
    System.out.println(length);

    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < strings.length; i++) {
      System.out.println(strings[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    for (String string : strings) {
      System.out.println(string);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
