import java.util.ArrayList;
import java.util.Scanner;
public class es4{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomi = new ArrayList<>();
        nomi.add("Andrea");
        nomi.add("Marco");
        nomi.add("Giulia");
        nomi.add("Sara");
        nomi.add("Luca");

        System.out.println("Inserisci un nome da cercare:");
        String nomeDaCercare = scanner.nextLine();
        boolean trovato = false;
        if (nomi.contains(nomeDaCercare)){
            System.out.println("Il nome " + nomeDaCercare + " è presente nella lista.");
            trovato = true;
        } else {
            System.out.println("Il nome " + nomeDaCercare + " non è presente nella lista.");
        }
        
        //ES 05
        System.out.println("Inserisci un nome da rimuovere:");
        String nomeDaRimuovere = scanner.nextLine();
        if (nomi.remove(nomeDaRimuovere)) {
            System.out.println("Il nome è stato rimosso.");
            System.out.println("Lista aggiornata: " + nomi);
        } else {
            System.out.println("Il nome non è presente nella lista.");
        }
    }
}