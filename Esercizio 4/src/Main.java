import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una numero: ");
        int number = scanner.nextInt();
        countdown(number);
    }
    public static void countdown(int number) {
        for(int i = number; i >= 0; i--){
            System.out.println(i);
        }
    }
}