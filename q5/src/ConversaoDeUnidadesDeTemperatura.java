import java.util.Scanner;

public class ConversaoDeUnidadesDeTemperatura {

    private static double tempResult;
    private static int resp;
    
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        while (true) {

            System.out.println("Digite o tipo de conversao que deseja fazer:\nCelcius para Fahrenheit = 1\nFahrenheit para Celcius = 2\nCelcius para Kelvin = 3\nKelvin para Celcius = 4\nCelcius para Reaumur = 5\nReaumur para Celcius = 6\nKelvin para Rankine = 7\nRankine para Kelvin = 8");
            int tempInicial = reader.nextInt();

            System.out.print("\nDigite a temperatura em graus: ");
            double tempGraus = reader.nextInt();
    
            switch (tempInicial) {
                case 1:
                    cParaF(tempGraus);
                break;
        
                case 2:
                    fParaC(tempGraus);
                break;
        
                case 3:
                    cParaK(tempGraus);
                break;
        
                case 4:
                    kParaC(tempGraus);
                break;
        
                case 5:
                    cParaRe(tempGraus);
                break;
        
                case 6:
                    reParaC(tempGraus);
                break;
        
                case 7:
                    kParaRa(tempGraus);
                break;
        
                case 8:
                    raParaK(tempGraus);
                break;
            }

            System.out.print("\nPara parar o programa digite 1: ");
            resp = reader.nextInt();
            
            if (resp == 1) {
                break;
            }
        }
        reader.close();
    }

    public static void cParaF(double tempGraus) {
        tempResult = (9 * tempGraus/5) + 32;
        System.out.println("O resultado da conversao e " + tempResult);
    }

    public static void fParaC(double tempGraus) {
        tempResult = (tempGraus - 32) * 5/9;
        System.out.println("O resultado da conversao e " + tempResult);
    }

    public static void cParaK(double tempGraus) {
        tempResult = tempGraus + 273.15;
        System.out.println("O resultado da conversao e " + tempResult);
    }

    public static void kParaC(double tempGraus) {
        tempResult = tempGraus - 273.15;
        System.out.println("O resultado da conversao e " + tempResult);
    }

    public static void cParaRe(double tempGraus) {
        tempResult = tempGraus * 4/5;
        System.out.println("O resultado da conversao e " + tempResult);
    }

    public static void reParaC(double tempGraus) {
        tempResult = tempGraus * 5/4;
        System.out.println("O resultado da conversao e " + tempResult);
    }

    public static void kParaRa(double tempGraus) {
        tempResult = tempGraus * 1.8;
        System.out.println("O resultado da conversao e " + tempResult);
    }

    public static void raParaK(double tempGraus) {
        tempResult = tempGraus / 1.8;
        System.out.println("O resultado da conversao e " + tempResult);
    }

}