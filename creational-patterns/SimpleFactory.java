// To compile
// javac SimpleFactory.java
// To execute
// java SimpleFactory

interface Laptop {
  public int getScreenSize();
}

class MacLaptop implements Laptop {
  protected int screenSize;

  public MacLaptop(int screenSize) {
    this.screenSize = screenSize;
  }

  public int getScreenSize() {
    return this.screenSize;
  }
}

class LaptopFactory {
  public static Laptop makeLaptop(int screenSize) {
    return new MacLaptop(screenSize);
  }
}

class SimpleFactory {
  public static void main(String args[]) {
    // Make me a 14 inch laptop
    Laptop macLaptop = LaptopFactory.makeLaptop(14);
    System.out.println(macLaptop.getScreenSize());
  }
}
