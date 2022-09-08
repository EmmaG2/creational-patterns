package Singleton;

import java.io.PrintWriter;

public class SgDemo {
  public static void startDemo() {
    PrintWriter pw = new PrintWriter(System.out);
    Singleton sg = Singleton.getInstance();
    Singleton sg2 = Singleton.getInstance();
    Singleton sg3 = Singleton.getInstance();
  
    sg.setCounter(17);
    sg2.setCounter(145);
    sg3.setCounter(200);
    pw.println(sg.getCounter());
    pw.println(sg);
    pw.println(sg2);
    pw.println(sg3);
  
    pw.close();
  }
}
