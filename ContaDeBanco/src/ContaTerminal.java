
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 2340.09;
        String nome = "Matheus Menezes";
        
        System.out.println("Insira o numero da sua agencia: ");
        int agencia = scanner.nextInt();

        System.out.println("Insira o número de identificação");
        int numero = scanner.nextInt();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}

//da pra melhorar mas por agr apenas use o basico
//github ta estranho