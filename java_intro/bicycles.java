/** cd into file folder then run: javac bicycles.java */
/** afterwords run java BicycleDemo */

class BicycleDemo {
  public static void main(String[] args) {
    // create two bike instances
    Bicycle bike1 = new Bicycle();
    Bicycle bike2 = new Bicycle();

    // invoke methods on bicycle objects
    bike1.changeCadence(50);
    bike1.speedUp(10);
    bike1.changeGear(2);
    bike1.printStates();

    bike2.changeCadence(50);
    bike2.speedUp(10);
    bike2.changeGear(2);
    bike2.changeCadence(40);
    bike2.speedUp(10);
    bike2.changeGear(3);
    bike2.printStates();
  };
};

class Bicycle {
  int cadence = 0;
  int speed = 0;
  int gear = 1;

  void changeCadence(int newValue) {
    cadence = newValue;
  };

  void changeGear(int newValue) {
    gear = newValue;
  };

  void speedUp(int increment) {
    speed = speed + increment;
  };

  void slowDown(int decrement) {
    speed = speed - decrement;
  };

  void printStates() {
    System.out.println("cadence:" + cadence + "speed:" + speed + "gear:" + gear);
  };
};

class MountainBike extends Bicycle {
  String chainRing = "additional";
};

class RoadBike extends Bicycle {
  String handleBars = "drop";
};

class TandemBike extends Bicycle {
  String seats = "two";
  String handleBars = "two";
};

// INTERFACES /////////////////////////////

interface BicycleInterface {
  //  wheel revolutions per minute
  void changeCadence(int newValue);

  void changeGear(int newValue);

  void speedUp(int increment);

  void applyBrakes(int decrement);
};

class ACMEBicycle implements BicycleInterface {
  int cadence = 0;
  int speed = 0;
  int gear = 1;

  // compiler will now require methods
  // changeCadence, changeGear, speedUp,
  // and applyBrakes. Compilation will fail if
  // those methods are missing from this class.

  public void changeCadence(int newValue) {
    cadence = newValue;
  }

  public void changeGear(int newValue) {
      gear = newValue;
  }

  public void speedUp(int increment) {
      speed = speed + increment;   
  }

  public void applyBrakes(int decrement) {
      speed = speed - decrement;
  }

  void printStates() {
      System.out.println("cadence:" +
          cadence + " speed:" + 
          speed + " gear:" + gear);
  }
};

/** interfaces allow classes to become more formal. Interfaces must be present at build time to compile. */