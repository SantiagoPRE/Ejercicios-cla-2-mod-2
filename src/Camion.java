public class Camion extends Vehiculo {

    Double capacidadCarga;

    public Camion(String marca, String modelo, Integer año, Double capacidadCarga) {

        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;

    }


    public Double getCapacidadCarga(){
        return capacidadCarga;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("capacidadCarga: "+capacidadCarga);
    }

    @Override
    public void mover() {
        System.out.println("El camión se mueve");
    }




}
