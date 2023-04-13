import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        Scanner leitorVariaveis = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String digito;
        String nomeCliente;
        float saldo;
        String saldoEmString;

        System.out.println("Por favor digite o numero da conta: ");
        numeroConta = leitorVariaveis.nextInt();

        System.out.println("Por favor digite o numero da agencia: ");
        agencia = leitorVariaveis.next();
        System.out.println("Por favor digite o digito da agencia: ");
        digito = leitorVariaveis.next();

        System.out.println("Por favor digite seu nome: ");
        nomeCliente = leitorVariaveis.next();

        System.out.println("Por favor digite seu saldo: ");
        saldo = leitorVariaveis.nextFloat();
        saldoEmString=String.format("%.2f", saldo);
        
        


        System.out.println("Ola "+nomeCliente+" obrigado por criar uma conta em nosso banco, sua agencia e: " +agencia+"-"+digito+" , conta e: "+numeroConta+" seu saldo:"+saldoEmString+" ja esta disponivel para saque");


    }
}
