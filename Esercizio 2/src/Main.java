import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Inserisci un numero: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        intToString(number);
    }

    public static void intToString(int number){
        switch (number) {
            case 0: {
                System.out.println("Zero");
                break;
            }
            case 1: {
                System.out.println("Uno");
                break;
            }
            case 2: {
                System.out.println("Due");
                break;
            }
            case 3: {
                System.out.println("Tre");
                break;
            }
            default: {
                System.out.println("Errore: il numero inserito non è compreso tra 0 e 3");
            }

        }
    }
}