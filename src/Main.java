// public -> acessível de todo lugar.
// default -> quando eu nao defino, ele segue esse daqui.
// private -> acessível somente dentro de classe que foi definida.
// proteced -> acessível por todo mundo que está no mesmo pacote.

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Sandero();
        Carro meuCarro2 = new Mobi();

        SerVivo meuSer = new Humano();
        meuSer.respirar();

        meuCarro.acelerar();
        meuCarro2.acelerar();

        meuSer.dormir();
    }
}

