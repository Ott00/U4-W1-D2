import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Inserisci una stringa: ");
            String str = scanner.nextLine();
            if(str.equals(":q")){
                System.out.print("Fine loop");
                break;
            } else {
                stringComma(str);
            }
        }while(true);
    }

    public static void stringComma(String str) {
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));

            if(i < str.length() - 1){
                System.out.print(",");
            }else{
                System.out.println(); //Per mandare a capo
            }
        }
    }
}