import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner

        var scanner = new Scanner(System.in);
        System.out.println("Seja bem vindo a nossa Conta Banco!");

        //Exibir uma mensagem para o nosso usuário
        //Obter pela scanner os valores digitados no terminal

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite nome completo: ");
        String nome = scanner.next();

        System.out.println("Digite o saldo: ");
        Float saldoEmConta = scanner.nextFloat();

        //Exibir a mensagem conta criada
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco! \n", nome);
        System.out.printf("Sua agência é %s, conta %s e seu saldo de R$%s já está disponível para saque.", agencia, conta, saldoEmConta);



    }
}
