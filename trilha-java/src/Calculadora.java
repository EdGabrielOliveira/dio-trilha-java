import java.util.Scanner;

public class Calculadora {
    

    public static void main(String[] args) {

        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite um numero: ");
            String numero1 = scanner.nextLine();

            System.out.println("Digite um numero: ");
            String numero2 = scanner.nextLine();
            
        } catch (NumberFormatException e) {
            
            e.printStackTrace();
        }

    }

}
