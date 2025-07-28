public class Moto extends Vehiculo implements Arrancable {

    private Integer cilindrada;

    public Moto(String marca, String modelo, Integer año, Integer cilindrada) {
        super(marca, modelo, año);
        this.cilindrada = cilindrada;

    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("cilindrada: " + cilindrada);

    }

    @Override
    public void mover() {
        System.out.println("La moto se mueve ");
    }

 @Override
 public void arrancar() {
      System.out.println("Se abre el switch y se le da pata a la moto y arranca");
}


 }


