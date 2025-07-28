public class FlotaApp {
    public static void main(String[] args)  {
      
    Coche miCoche = new Coche("Toyota", "Corolla", 2022, 4);
    Moto miMoto = new Moto("Honda", "CBR500R", 2023, 500);
    Camion miCamion = new Camion("Volvo", "FH16", 2021, 25000.0);

    System.out.println("\n--- Demostración de Polimorfismo (Vehiculo) ---");
Vehiculo vehiculo1 = miCoche;
Vehiculo vehiculo2 = miMoto;
Vehiculo vehiculo3 = miCamion;

vehiculo1.mostrarInformacion();
vehiculo1.mover();
System.out.println("---");
vehiculo2.mostrarInformacion();
vehiculo2.mover();
System.out.println("---");
vehiculo3.mostrarInformacion();
vehiculo3.mover();

System.out.println("\n--- Demostración de Polimorfismo (Arrancable) ---");
Arrancable arrancable1 = miCoche;
Arrancable arrancable2 = miMoto;

arrancable1.arrancar();
arrancable2.arrancar();
}
}