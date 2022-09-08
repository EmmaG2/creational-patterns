package Factory;

public class Main {
  
  public static void main(String[] args) {
    PrecioFactory pf = new PrecioFactory("España");
    System.out.println(pf.getPrecio());
    
    PrecioFactory pf2 = new PrecioFactory("USA");
    System.out.println(pf2.getPrecio());
    
    PrecioFactory pf3 = new PrecioFactory("Argentina");
    System.out.println(pf3.getPrecio());
  }
  
}
