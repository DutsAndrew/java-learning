package code;
class ArrayDemo {
  public static void main(String[] args) {
    // declare array of integers
    int[] anArray;

    // allocate memory for 10 integers
    anArray = new int[10];

    // initialize elements
    anArray[0] = 100;
    anArray[1] = 200;
    anArray[2] = 300;
    anArray[3] = 400;
    anArray[4] = 500;
    anArray[5] = 600;
    anArray[6] = 700;
    anArray[7] = 800;
    anArray[8] = 900;
    anArray[9] = 1000;

    System.out.println("Element at index 0: "
                           + anArray[0]);
    System.out.println("Element at index 1: "
                        + anArray[1]);
    System.out.println("Element at index 2: "
                        + anArray[2]);
    System.out.println("Element at index 3: "
                        + anArray[3]);
    System.out.println("Element at index 4: "
                        + anArray[4]);
    System.out.println("Element at index 5: "
                        + anArray[5]);
    System.out.println("Element at index 6: "
                        + anArray[6]);
    System.out.println("Element at index 7: "
                        + anArray[7]);
    System.out.println("Element at index 8: "
                        + anArray[8]);
    System.out.println("Element at index 9: "
                        + anArray[9]);

    // Alternative shortcut syntax to init array
    int[] anArray1 = {
      100, 200, 300, 400, 500, 600, 700, 800,
      900, 1000
    };
  };
};

class MultiDimArrayDemo {
  public static void main(String[] args) {
    String[][] names = {
      {"Mr.", "Mrs.", "Ms."},
      {"Smith", "Jones"}
    };
    // Mr. Smith
    System.out.println(names[0][0] + names[1][0]);
    // Ms. Jones
    System.out.println(names[0][2] + names[1][1]);

    // identify length of array
    System.out.println(names.length);
  };
};

/** COPY AN ARRAY */

class ArrayCopyDemo {
  public static void main(String[] args) {
    String[] copyFrom = {
      "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
      "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
      "Marocchino", "Ristretto"
    };

    String[] copyTo = new String[7];
    System.arraycopy(copyFrom, 2, copyTo, 0, 7);
    for (String coffee : copyTo) {
      System.out.print(coffee + " ");
    };
    // results
    // Cappuccino Corretto Cortado Doppio Espresso Frappucino Freddo 
  };
};

/** Shorter version of the previous class, by using java.util.Arrays */

class ArrayCopyOfDemo {
  public static void main(String[] args) {
    String[] copyFrom = {
      "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
      "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
      "Marocchino", "Ristretto"
    };

    String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
    for (String coffee : copyTo) {
      System.out.print(coffee + " ");
    };
    // results
    // Cappuccino Corretto Cortado Doppio Espresso Frappucino Freddo 
  };
};