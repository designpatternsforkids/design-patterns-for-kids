<!-- # Introduction

> Design patterns are proven solutions to tackle particular problems in software design.

### Types of Design Patterns

* Creational
* Structural
* Behavioral

Note: Examples code below are in Java.

# Creational Patterns

> Creational patterns are the way of creating objects, which increase flexibility and reuse of existing code.

* Simple Factory
* Factory Method
* Abstract Factory
* Builder
* Prototype
* Singleton

## Simple Factory

Simple Factory is the way of creating objects to encapsulate the instantiation logic of entity. Client doesn't know the actual instantiation logic of entity.

> Simple Factory is the way of creating objects without exposing the object creation logic to the client.

Real world example

> Let's consider, you want a Mac laptop. You simply can get one from a factory so you don't need to learn anything about making the laptop.

**Example**

Laptop interface and implementation

```java
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
```

Laptop factory and implementation

```java
class LaptopFactory {
  public static Laptop makeLaptop(int screenSize) {
    return new MacLaptop(screenSize);
  }
}
```

It can be used

```java
// Make me a 14 inch laptop
Laptop macLaptop = LaptopFactory.makeLaptop(14);
System.out.println(macLaptop.getScreenSize());
``` -->
