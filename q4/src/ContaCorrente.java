import java.util.Scanner;
import java.lang.Math;

public class ContaCorrente {
    public static void main(String[] args) {

        DadosBancarios dados = new DadosBancarios();
        int escolhaOp;

        int numeroDaConta = (int) ((Math.random() * 1000000) + 100000);
        
        Scanner reader = new Scanner(System.in);
        while (true) {

            System.out.println("\nNúmero de conta: " + numeroDaConta);
            System.out.print("\nEscolha a operação que deseja fazer:\nSaque = 1\nDepósito = 2\nConsultar Saldo = 3\nVerificar Cheque Especial = 4\nEscolha: ");
            escolhaOp = reader.nextInt();
            
            switch (escolhaOp) {
    
                case 1:
                    System.out.print("\nQuanto deseja sacar: ");
                    dados.setSaque(reader.nextDouble());
                    dados.sacar();
                break;
    
                case 2:
                    System.out.print("\nQuanto deseja depositar: ");
                    dados.setDeposito(reader.nextDouble());
                    dados.depositar();
                break;
    
                case 3:
                    System.out.println("\nSaldo de: " + dados.getSaldo());
                break;
    
                case 4:
                    dados.cheque();
                break;
            }

            System.out.print("\nCaso queira parar o programa digite 1: ");
            int parar = reader.nextInt();

            if (parar == 1) {
                break;
            }
        }
        reader.close();
    }
}
