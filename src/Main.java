import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Fusca");
        Carro meuCarro2 = new Carro("BMW");
        Carro meuCarro3 = new Carro("Celta");

        meuCarro.acelerar();
    }
}

class Carro {
    String modelo;
    public Carro(String modelo){
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Acelerando o carro  c " + this.modelo);
    }
}