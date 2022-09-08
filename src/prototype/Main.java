package prototype;

import java.io.PrintWriter;

public class Main {
  public static void main(String[] args) {
    Coche c = new Coche("Nissan", "3434-22", 8);
    
    Coche otroCoche = c.clonar();
    
    PrintWriter pw = new PrintWriter(System.out);
    pw.println(c);
    pw.println(otroCoche);
    
    pw.close();
  }
}
