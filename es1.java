import java.util.ArrayList;
public class es1 {
    public static void main(String[] args) {
        ArrayList<String> nomi = new ArrayList<>();
    nomi.add("Anna");
    nomi.add("Luca");
    nomi.add("Marco");
    nomi.add("Giulia");
    nomi.add("Sara");
    for(int i = 0; i < nomi.size(); i++){
        System.out.println(nomi.get(i));
    }
  }
}