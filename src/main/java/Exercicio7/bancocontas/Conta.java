package Exercicio7.bancocontas;

public class Conta {

    private String cpfTitular;
    private String numeroConta;
    private String numeroAgencia;
    private double saldo;

    public Conta(){
    }

    public Conta(String cpfTitular, String numeroConta, String numeroAgencia, double saldo) {
        this.cpfTitular = cpfTitular;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public double creditar(double valor) {
        saldo = saldo + valor;
        return saldo;
    }


    public double debitar(double valor) {
        saldo = saldo - valor;
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta número " + this.numeroAgencia + " do cliente de CPF " + this.cpfTitular;
    }
}
