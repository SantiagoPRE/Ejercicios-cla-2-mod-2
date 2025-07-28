public class Vehiculo {

    private String marca;
    private String modelo;
    private Integer año;

    public Vehiculo(String marca, String modelo, Integer año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrarInformacion() {

        System.out.printf("marca: %s ,modelo: %s , año: %d ", marca, modelo, año);

    }

    public void mover() {

        System.out.println("El vehiculo se esta moviendo");
    }

    
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAño() {
        return año;
    }

    


}