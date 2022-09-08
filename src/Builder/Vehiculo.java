package Builder;

public class Vehiculo {
  private String marca;
  private String tipo;
  private String motor;
  private int puertas;
  
  
  @Override
  public String toString() {
    return "Vehiculo{" +
        "marca='" + marca + '\'' +
        ", tipo='" + tipo + '\'' +
        ", motor='" + motor + '\'' +
        ", puertas=" + puertas +
        '}';
  }
  
  private Vehiculo() {
  }
  
  private void setMarca(String marca) {
    this.marca = marca;
  }
  
  private void setTipo(String tipo) {
    this.tipo = tipo;
  }
  
  private void setMotor(String motor) {
    this.motor = motor;
  }
  
  private void setPuertas(int puertas) {
    this.puertas = puertas;
  }
  
  public String getMarca() {
    return marca;
  }
  
  public String getTipo() {
    return tipo;
  }
  
  public String getMotor() {
    return motor;
  }
  
  public int getPuertas() {
    return puertas;
  }
  
  static class VehiculoBuilder {
    private Vehiculo vehiculo;
  
    public VehiculoBuilder() {
      vehiculo = new Vehiculo();
    }
    
    public VehiculoBuilder withMarca(String marca) {
      vehiculo.setMarca(marca);
      return this;
    }
    
    public VehiculoBuilder withPuertas(int puertas) {
      vehiculo.setPuertas(puertas);
      return this;
    }
  
    public VehiculoBuilder withTipo(String tipo) {
      vehiculo.setTipo(tipo);
      return this;
    }
  
    public VehiculoBuilder withMotor(String motor) {
      vehiculo.setMotor(motor);
      return this;
    }
    
    public Vehiculo build() {
      return vehiculo;
    }
  }
}
