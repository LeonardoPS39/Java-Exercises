import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Retangulo dados = new Retangulo();

        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.print("\nEscolha uma operação para fazer com o retângulo:\n1 - Solicitar dados\n2 - Imprimir dados\n3 - Validar dados\n4 - Alterar a altura e a base\n5 - Somar 1 na altura\n6 - Somar 1 na base\n7 - Subtrair 1 na altura\n8 - Subtrair 1 na base\n9 - Calcular o perímetro do retangulo\n10 - Calcular area do retangulo\n11 - Verificar se e um quadrado\nEscreva: ");
            int escolhaOp = reader.nextInt();

            switch (escolhaOp) {
                case 1:
                    dados.solicitarDados();
                break;

                case 2:
                    dados.imprimirDados();
                break;

                case 3:
                    dados.validarDados(dados.altura, dados.base);
                    if (dados.isValido == false) {
                        System.out.println("\nOs dados inseridos não são válidos, recomece o programa!");
                        dados.setAltura(20.0);
                        dados.setBase(20.0);
                        dados.setValido(true);
                        dados.setQuadrado(true);
                        continue;
                    } else {
                        System.out.println("Dados válidos!");
                    }
                break;

                case 4:
                    dados.alterarAlturaAndBase();
                    if (dados.isValido == false) {
                        System.out.println("\nOs dados inseridos não são válidos, recomece o programa!");
                        dados.setAltura(20.0);
                        dados.setBase(20.0);
                        dados.setValido(true);
                        dados.setQuadrado(true);
                        continue;
                    } else {
                        System.out.println("Dados válidos!");
                    }
                break;

                case 5:
                    double dadoTemp = dados.somaAltura();
                    System.out.print(dadoTemp);
                break;

                case 6:
                    dadoTemp = dados.somaBase();
                    System.out.print(dadoTemp);
                break;
                
                case 7:
                    dadoTemp = dados.subAltura();
                    System.out.print(dadoTemp);
                break;

                case 8:
                    dadoTemp = dados.subBase();
                    System.out.print(dadoTemp);
                break;

                case 9:
                    dadoTemp = dados.perimetroRect();
                    System.out.print(dadoTemp);
                break;

                case 10:
                    dadoTemp = dados.areaRect();
                    System.out.print(dadoTemp);
                break;

                case 11:
                    Boolean dado = dados.isQuadrado();
                    System.out.print(dado);
                break;
            }
            dados.isQuadrado();

            //System.out.print("\n Altura: " + dados.altura + "| Base: " + dados.base + "| Quadrado? " + dados.isQuadrado + "| Valido? " + dados.isValido + "\n ");
            System.out.print("\nPara para de rodar o programa digite 1, se nao digite qualquer coisa: ");
            int rodar = reader.nextInt();

            if(rodar == 1) {
                break;
            }
        }
        reader.close();
    }
}
