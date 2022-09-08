package Builder;

import java.io.PrintWriter;

public class Main {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out);
    Vehiculo vehiculo = new Vehiculo.VehiculoBuilder()
        .withTipo("Camioneta")
        .withMarca("Nissan")
        .withPuertas(8)
        .withMotor("Gas")
        .build();
  
    Vehiculo vehiculoSinMarca = new Vehiculo.VehiculoBuilder()
        .withTipo("Camioneta")
        .withPuertas(8)
        .withMotor("Gas")
        .build();
    
    pw.println(vehiculo.toString());
    pw.println(vehiculoSinMarca.toString());
    pw.close();
  }
}
