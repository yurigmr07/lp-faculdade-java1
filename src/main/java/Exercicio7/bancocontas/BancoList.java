package Exercicio7.bancocontas;

import java.util.ArrayList;

public class BancoList{
    private String nome;
    private String cnpj;
    private ArrayList<Conta> contas;

    public BancoList(String nome, String cnpj, ArrayList<Conta> contas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.contas = contas;
    }

    private Conta buscarConta(String numConta, String numAgencia) {
        for (Conta c : contas) {
            if (c.getNumeroConta().equals(numConta)
                    && c.getNumeroAgencia().equals(numAgencia)) {
                return c;
            }
        }
        return null;
    }

    public void abrirConta(String cpfTitular, String numConta,
                           String numAgencia, double saldoInicial) {
        Conta nova = new Conta(cpfTitular, numConta, numAgencia, saldoInicial);
        contas.add(nova);
    }

    public void transferir(String numContaO, String numAgO,
                           String numContaD, String numAgenciaD, double valor) {
        Conta origem = buscarConta(numContaO, numAgO);
        Conta destino = buscarConta(numContaD, numAgenciaD);

        if (origem != null && destino != null) {
            origem.debitar(valor);
            destino.creditar(valor);
        } else {
            System.out.println("Transferência não realizada: conta não encontrada.");
        }
    }

    public ArrayList<Conta> pesquisarContasComSaldoNegativo() {
        ArrayList<Conta> negativas = new ArrayList<>();
        for (Conta c : contas) {
            if (c.getSaldo() < 0) {
                negativas.add(c);
            }
        }
        return negativas;
    }


    public double consultarSaldoDeConta(String numConta, String numAgencia) {
        Conta c = buscarConta(numConta, numAgencia);
        if (c == null) {
            return 0;
        }
        return c.getSaldo();
    }

    public double sacarDeConta(String numConta, String numAgencia, double valor) {
        Conta c = buscarConta(numConta, numAgencia);
        if (c == null) {
            return 0;
        }
        return c.debitar(valor);
    }


    public double depositarEmConta(String numConta, String numAgencia, double valor) {
        Conta c = buscarConta(numConta, numAgencia);
        if (c == null) {
            return 0;
        }
        return c.creditar(valor);
    }

    public ArrayList<Conta> pesquisarContasDoCliente(String cpf) {
        ArrayList<Conta> doCliente = new ArrayList<>();
        for (Conta c : contas) {
            if (c.getCpfTitular().equals(cpf)) {
                doCliente.add(c);
            }
        }
        return doCliente;
    }
}

