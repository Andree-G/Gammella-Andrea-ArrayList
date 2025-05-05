import java.util.ArrayList;

public class es2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeri = new ArrayList<>();
        numeri.add(1);
        numeri.add(2);
        numeri.add(3);

        int numero = contaElementi(numeri);
        System.out.println("La lista contiene " + numero + " elementi."); 
        int somma = SommaElementi(numeri);
        System.out.println("La somma degli elementi è: " + somma);

    }

    public static int contaElementi(ArrayList<Integer> lista) {
        return lista.size();
    }
    //ES 03
    public static int SommaElementi(ArrayList<Integer> lista) {
        int somma = 0;
        for (int i = 0; i < lista.size(); i++) {
            somma += lista.get(i);
        }
        return somma;
    }
    
}
