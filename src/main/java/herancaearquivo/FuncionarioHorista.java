package herancaearquivo;

import java.time.LocalDate;

public class FuncionarioHorista extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    public FuncionarioHorista(String nome, String cpf, LocalDate dataNascimento,
                              double valorHora, int horasTrabalhadas) {
        super(nome, cpf, dataNascimento);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() { return valorHora; }
    public void setValorHora(double valorHora) { this.valorHora = valorHora; }

    public int getHorasTrabalhadas() { return horasTrabalhadas; }
    public void setHorasTrabalhadas(int horasTrabalhadas) { this.horasTrabalhadas = horasTrabalhadas; }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Valor/hora: " + valorHora
                + ", Horas: " + horasTrabalhadas
                + ", Salário: " + calcularSalario();
    }
}
