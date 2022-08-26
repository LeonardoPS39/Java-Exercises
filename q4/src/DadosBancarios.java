public class DadosBancarios {
    
    double saldo;
    double deposito;
    double saque;
    boolean isEspecial;
    final double limite = -500;

    /* Getter and Setter */

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor) {
        this.saldo = valor;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double valor) {
        this.deposito = valor;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double valor) {
        this.saque = valor;
    }

    /* End of Getter and Setter */

    /* Métodos: */

    public DadosBancarios() {
        this.saldo = 0.0;
        this.isEspecial = false;
    }

    public void depositar() {
        this.saldo += this.deposito;
        System.out.println("\nVoce depositou " + this.deposito);
    }

    public void sacar() {
        if (this.saldo - this.saque < 0.0 && this.saldo - this.saque >= limite) {
            this.saldo -= this.saque;
            System.out.println("\nSeu cheque especial foi ativado, e você sacou dele o valor de " + this.saldo);
            this.isEspecial = true;
        } else if(this.saldo - this.saque < limite) {
            System.out.println("\nVocê não possui mais limite de cheque especial!");
            this.isEspecial = true;
        } else {
            System.out.println("Saque de " + this.saque + " realizado com sucesso!");
            this.saldo -= this.saque;
            this.isEspecial = false;
        }
    }

    public void cheque() {
        if (this.isEspecial) {
            System.out.println("\nSeu cheque especial está ativo");
        } else {
            System.out.println("\nSeu cheque não está ativo!");
        }
    }

}
