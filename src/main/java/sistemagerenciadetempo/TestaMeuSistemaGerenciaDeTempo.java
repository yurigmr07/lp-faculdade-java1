package sistemagerenciadetempo;

import java.util.List;

public class TestaMeuSistemaGerenciaDeTempo {
    public static void main(String[] args) {
        SistemaGerenciaDeTempo sistema = new MeuSistemaGerenciaDeTempo();
        sistema.cadastrarTarefa("Estudar LP", "Estudo", 120);
        sistema.cadastrarTarefa("Estudar LP", "Estudo", 80);
        sistema.cadastrarTarefa("Estudar Cálculo", "Estudo", 60);
        System.out.println(sistema.calcularTempoTotalDeTarefasComDescricao("Estudar LP"));
        List<Tarefa> tarefasEstudo = sistema.pesquisarTarefasDaCategoria("Estudo");
        for (Tarefa f : tarefasEstudo) {
            System.out.println(f.toString());
        }

        // a) cadastrar mais uma tarefa de 20 minutos
        sistema.cadastrarTarefa("Ler artigo", "Estudo", 20);

// b) guardar a lista das tarefas da categoria "Estudo"
        List<Tarefa> listaEstudo = sistema.pesquisarTarefasDaCategoria("Estudo");

// c) imprimir só a descrição de cada tarefa
        for (Tarefa t : listaEstudo) {
            System.out.println(t.getDescricao());
        }
    }

}
