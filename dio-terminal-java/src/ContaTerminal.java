import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por Favor digite o número da Agencia: ");
        int numero = in.nextInt();

        System.out.println("Agencia: ");
        String agencia = in.next();

        System.out.println("Nome: ");
        String nome = in.next();

        System.out.println("Saldo: ");
        double saldo = in.nextDouble();

        System.out.println("Olá ["+nome+"]," +
                " obrigado por criar uma conta em nosso banco, sua agencia é ["+agencia+"]," +
                " conta ["+numero+"] e seu saldo ["+saldo+"] ja esta disponivel para saque");
    }
}
