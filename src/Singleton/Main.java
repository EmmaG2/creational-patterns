package Singleton;

import java.io.PrintWriter;

public class Main {
  
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out);
    Application app = Application.getInstance();
    Application app2 = Application.getInstance();
    pw.println(app + " " + app2);
    
    pw.close();
    
  }
  
}
