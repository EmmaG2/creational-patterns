package prototype;

public class Coche {
  public String marca;
  public String modelo;
  public int puertas;
  
  @Override
  public String toString() {
    return "Coche{" +
        "marca='" + marca + '\'' +
        ", modelo='" + modelo + '\'' +
        ", puertas=" + puertas +
        '}';
  }
  
  public Coche(String marca, String modelo, int puertas) {
    this.puertas = puertas;
    this.modelo = modelo;
    this.marca = marca;
  }
  
  public Coche clonar() {
    return new Coche(marca, modelo, puertas);
  }
  
}
