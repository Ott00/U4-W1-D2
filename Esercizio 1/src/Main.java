//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(stringaPariDispari("Ciao"));
        System.out.println(annoBisestile(2024));
    }
    public static boolean stringaPariDispari(String str){
       return str.length() % 2 == 0;
    }
    public static boolean annoBisestile(int anno){
        return anno % 4 == 0 || anno % 400 == 0 && anno % 100 != 0;
    }
}