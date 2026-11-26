package herancaearquivo;

import java.time.LocalDate;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;

    public Funcionario(String nome, String cpf, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Nascimento: " + dataNascimento;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Funcionario outro = (Funcionario) obj;
        return cpf != null && cpf.equals(outro.cpf);
    }

    @Override
    public int hashCode() {
        return cpf == null ? 0 : cpf.hashCode();
    }
}
