package explanations;
// instance variables (non-static fields) are unique to each instance of class.

// class variables (static fields) are fields declared with the static modifier. Only one copy of these.

// local variables are stored in methods.

public class variables {
  // instance variable
  int instanceVariable = 0;

  // static variable
  static String staticVariable = "static";
  
  // local variable
  void incrementNumber(int newValue) {
    int increased = newValue;
  };
}
