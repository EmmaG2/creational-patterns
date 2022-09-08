package Singleton;

public class Singleton {
  private static Singleton singleton;
  
  private Singleton() {}
  
  public static Singleton getInstance() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    
    return singleton;
  }
  
  private int counter;
  
  
  public int getCounter() {
    return counter;
  }
  
  public void setCounter() {
    counter += 1;
  }
  
  public void setCounter(int counter) {
    this.counter += counter;
  }
}
