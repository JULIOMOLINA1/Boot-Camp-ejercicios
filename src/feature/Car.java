package feature;

public class Car {
    // Atributos
    String color;
    String marca;
    String modelo;
    String codigo;

    public Car(String color, String marca, String modelo, String codigo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.codigo = codigo;
    }

    // constructor por defecto
    public void description() {
        System.out.println("Tu nuevo auto es de color: " + color+ " y de marca: " + marca );
    }

    public void caracteristic(){
        System.out.println("Te vino en modelo: " + modelo + " y con el codigo: " + codigo);
    }
}
