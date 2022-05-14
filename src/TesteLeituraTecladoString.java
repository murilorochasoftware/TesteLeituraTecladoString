import java.util.Scanner;

public class TesteLeituraTecladoString {

    public static void main(String[] args) {
        String textoDigitado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um texto e aperte a tecla enter:");
        textoDigitado = scanner.nextLine();

        System.out.printf("\nO texto digitado foi:\n%s", textoDigitado);
    }
}
