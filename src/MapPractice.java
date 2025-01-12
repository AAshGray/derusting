import java.util.HashMap;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    HashMap<String, Integer> map = new HashMap<>();
    
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    map.put("Cheese", 2);
    map.put("Onions",1);
    map.put("Bread",5);


    // Get the value associated with a given key in the Map
    System.out.println("Cheese costs " + map.get("Cheese") + " dollars.");
    
    // Find the size (number of key/value pairs) of the Map
    System.out.println("There are " + map.size() + " pairs in the Map.");

    // Replace the value associated with a given key (the size of the Map shoukld not change)
    map.put("Cheese", 3);
    System.out.println("Cheese now costs " + map.get("Cheese") + " dollars.");

    // Check whether the Map contains a given key
    if (map.containsKey("Onions")) {
      System.out.println("Map contains onions.");
    } else {
      System.out.println("Map does not contain onions.");
    }
    
    // Check whether the Map contains a given value
    if (map.containsValue(2)) {
      System.out.println("One of the items has a value of 2.");
    } else {
      System.out.println("None of the items has a value of 2.");
    }
    // Iterate over the keys of the Map, printing each key
    for (String string : map.keySet()) {
      System.out.println(string);
    }

    // Iterate over the values of the map, printing each value
    for (int value : map.values()) {
      System.out.println(value);
    }

    // Iterate over the entries in the map, printing each key and value
    for (String string : map.keySet()) {
      System.out.println(string + "=" + map.get(string));
    }
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
