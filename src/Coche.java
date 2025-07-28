public class Coche extends Vehiculo implements Arrancable{
    private Integer numeroPuertas;

    public Coche(String marca, String modelo, Integer año, Integer numeroPuertas) {
        super(marca, modelo, año);
        this.numeroPuertas = numeroPuertas;
    }

@Override
public void mostrarInformacion(){
 super.mostrarInformacion();
 System.out.println("numeroPuertas: "+numeroPuertas);
}

@Override
public void mover(){
    System.out.println("El coche se mueve");
}


public Integer getNumeroPuertas() {
    return numeroPuertas;
}

@Override
public void arrancar() {
    System.out.println("Se abre el switch y arranca el carro");
}


}
