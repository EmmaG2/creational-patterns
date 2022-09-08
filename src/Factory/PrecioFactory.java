package Factory;

public class PrecioFactory {
  
  IPrecio precio;
  
  private PrecioFactory() {
  }
  
  public PrecioFactory(String pais) {
    if (pais.equalsIgnoreCase("España")) {
      this.precio = new PrecioEUR();
      return;
    }
  
    if (pais.equalsIgnoreCase("Argentina")) {
      this.precio = new PrecioARG();
      return;
    }
    
    this.precio = new PrecioUSD();
  }
  
  public double getPrecio() {
    return precio.getPrecio();
  }
  
}
