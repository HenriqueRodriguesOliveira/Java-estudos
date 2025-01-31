import java.util.ArrayList;

// public -> acessível de todo lugar.
// default -> quando eu nao defino, ele segue esse daqui.
// private -> acessível somente dentro de classe que foi definida.
// proteced -> acessível por todo mundo que está no mesmo pacote.

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
    protected Carro(String modelo){
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Acelerando o carro  c " + this.modelo);
    }
}