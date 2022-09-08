package Singleton;

public class Application {
  private Application() {}
  
  private static Application instance;
  
  public static Application getInstance() {
    if (instance == null) {
      instance = new Application();
    }
    
    return instance;
  }
  
  public void run() {
    if (!isRunning) {
      isRunning = true;
    }
  }
  
  public boolean isRunning() {
    return isRunning;
  }
  
  public void setRunning(boolean running) {
    isRunning = running;
  }
  
  boolean isRunning = false;
  
}
