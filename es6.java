import java.util.ArrayList;
public class es6{
    public static void main(String[] args)
    {
        ArrayList<Integer>numeri = new ArrayList<>();
        numeri.add(1);
        numeri.add(2);
        numeri.add(3);
        numeri.add(3);
        numeri.add(5);

        System.out.println("Lista originale: " + numeri);
        ArrayList<Integer> numeriAlContrario = new ArrayList<>();
        for (int i = numeri.size() - 1; i >= 0; i--) {
            numeriAlContrario.add(numeri.get(i));
        }
        System.out.println("Lista al contrario: " + numeriAlContrario);

        //ES 07 NON COMPLETO
        ArrayList<Integer> NumeriUguali = new ArrayList<>();
        for (int i = 0; i < numeri.size(); i++) {
            Integer numero = numeri.get(i);
            
        }
        System.out.println("Lista senza numeri uguali: " + numeri);

        //ES 08

        ArrayList<Integer> numeriPari = new ArrayList<>();
        for (int i = 0; i < numeri.size(); i++) {
            Integer numero = numeri.get(i);
            if (numero % 2 == 0) {
                numeriPari.add(numero);
            }
        }
        System.out.println("Lista numeri pari: " + numeriPari);
        int MassimoMinimo = MassimoMinimo(numeri);
}
    //ES 09
    public static int MassimoMinimo(ArrayList<Integer> lista)
    {
        int massimo = lista.get(0);
        int minimo = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > massimo) {
                massimo = lista.get(i);
            }
            if (lista.get(i) < minimo) {
                minimo = lista.get(i);
            }
        }
        System.out.println("Massimo: " + massimo + ", Minimo: " + minimo);
        return massimo - minimo;
    }
}
  
