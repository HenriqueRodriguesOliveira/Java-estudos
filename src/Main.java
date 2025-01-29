import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Henrique";
        boolean bool = true;

        int[] colecaoDeInteiros = {1, 2, 3, 4, 5};

        if(bool) {
            System.out.println("Verdadeiro");
        } else {
            System.out.println("Falso");
        }

        if(str == "Jose") {
            System.out.println("Verdadeiro");
        } else if (str == "Rodrigues"){
            System.out.println("Rodrigues");
        }else {
            System.out.println("Falso");
        }

        System.out.println(colecaoDeInteiros[0]);

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Henrique");
        nomes.add("Jose");
        nomes.add("Maria");
        nomes.add("Fulano");
        System.out.println(nomes.get(0));

        nomes.remove(0);

        System.out.println(nomes.get(0));

    }
}