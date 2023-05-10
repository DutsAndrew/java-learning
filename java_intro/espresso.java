class Espresso {
  public static void main(String[] args) {

    EspressoMachine machine1 = new EspressoMachine();

    machine1.increaseTemp(2);
    machine1.swapMachine("Lelit");
    machine1.printStates();
  };
};

class EspressoMachine {
  int temp = 200;
  int brewTime = 30;
  String brand = "Dilleta";

  void increaseTemp(int newValue) {
    temp = temp + newValue;
  };

  void decreaseTemp(int newValue) {
    temp = temp - newValue;
  };

  void increaseBrewTime(int newValue) {
    brewTime = brewTime + newValue;
  };

  void decreaseBrewTime(int newValue) {
    brewTime = brewTime - newValue;
  };

  void swapMachine(String newName) {
    brand = newName;
  };

  void printStates() {
    System.out.println("Temp:" + temp + "Brew Time:" + brewTime + "Brand:" + brand);
  };
};

// INTERFACE ////////////////////////////////

interface EspressoInterface {
  void increaseTemp(int newValue);
  void decreaseTemp(int newValue);
  void increaseBrewTime(int newValue);
  void decreaseBrewTime(int newValue);
  void swapMachine(String newName);
  void printStates();
};

class BiancaEspressoMachine implements EspressoInterface {
  int temp = 200;
  int brewTime = 30;
  String brand = "Bianca";

  public void increaseTemp(int newValue) {
    temp = temp + newValue;
  };

  public void decreaseTemp(int newValue) {
    temp = temp - newValue;
  };

  public void increaseBrewTime(int newValue) {
    brewTime = brewTime + newValue;
  };

  public void decreaseBrewTime(int newValue) {
    brewTime = brewTime - newValue;
  };

  public void swapMachine(String newName) {
    brand = newName;
  };

  public void printStates() {
    System.out.println("Temp:" + temp + "Brew Time:" + brewTime + "Brand:" + brand);
  };
};