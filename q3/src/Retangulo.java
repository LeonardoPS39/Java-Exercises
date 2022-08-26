import java.util.Scanner;

public class Retangulo {
    
    double base;
    double altura;
    boolean isValido;
    boolean isQuadrado;
    
    /* Começo do Getter and Setter */

    public void setQuadrado(boolean isQuadrado) {
        this.isQuadrado = isQuadrado;
    }
    public boolean isValido() {
        return isValido;
    }

    public void setValido(boolean isValido) {
        this.isValido = isValido;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    
    /* Fim do Getter and Setter */

    public Retangulo() {
        this.altura = 10.0;
        this.base = 10.0;
        this.isValido = true;
        this.isQuadrado = true;
    }

    public void solicitarDados() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Insira a altura do retangulo: ");
        setAltura(reader.nextDouble());
        System.out.print("\nInsira a base do retangulo: ");
        setBase(reader.nextDouble());
        isQuadrado();
    }

    public void imprimirDados() {
        System.out.println("\nA base do retangulo e " + this.base + " e a altura e " + this.altura + "!");
    }

    public void validarDados(double alturaTemp, double baseTemp) {

        if (alturaTemp <= 0) {
            this.isValido = false;
            return;
        } else {
            this.isValido = true;
        }

        if (baseTemp <= 0) {
            this.isValido = false;
        } else {
            this.isValido = true;
        }
    }

    public void alterarAlturaAndBase() {
        Scanner reader = new Scanner(System.in);
        System.out.print("\nDigite a nova altura: ");
        setAltura(reader.nextDouble());
        System.out.print("Digite a nova base: ");
        setBase(reader.nextDouble());
        
        isQuadrado();
        validarDados(this.altura, this.base);
        
    }

    public double somaAltura(){
        return this.altura++;
    }

    public double somaBase(){
        return this.base++;
    }

    public double subAltura(){
        return this.altura--;
    }

    public double subBase(){
        return this.base--;
    }

    public double perimetroRect() {
        double perimetro = (this.base + this.altura) * 2;
        return perimetro;
    }

    public double areaRect() {
        double area = this.base * this.altura;
        return area;
    }

    public boolean isQuadrado() {
        if (this.altura == this.base) {
            this.isQuadrado = true;
            return true;
        }else {
            this.isQuadrado = false;
            return false;
        }
    }

}
