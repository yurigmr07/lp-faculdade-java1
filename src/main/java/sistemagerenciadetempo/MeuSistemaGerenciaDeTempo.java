package sistemagerenciadetempo;

import java.util.ArrayList;
import java.util.List;

public class MeuSistemaGerenciaDeTempo implements SistemaGerenciaDeTempo {
    private List<Tarefa> tarefas;

    public MeuSistemaGerenciaDeTempo() {
        this.tarefas = new ArrayList<>();
    }


    public List<Tarefa> pesquisarTarefasDaCategoria(String categoria) {
        List<Tarefa> tarefasPesq = new ArrayList<>();
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getCategoria().equals(categoria)) {
                tarefasPesq.add(tarefa);
            }
        }
        return tarefasPesq;

    }

    public void cadastrarTarefa(String descricao, String categoria, int tempoEmMinutos){
        Tarefa nova = new Tarefa(descricao, categoria, tempoEmMinutos);
        this.tarefas.add(nova);
    }

    public int calcularTempoTotalDeTarefasComDescricao(String descricaoTarefa) {
        int total = 0;
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getDescricao().equals(descricaoTarefa)) {
                total += tarefa.getTempoTarefaEmMinutos();
            }
        }
        return total;
    }

    @Override
    public List<Tarefa> pesquisarTarefasPorDescricao(String descricao) {
        return List.of();
    }

    @Override
    public List<Tarefa> pesquisarTarefasQueDuraramMaisDe(int tempoEmMinutos) {
        return List.of();
    }

    @Override
    public int calcularTempoTotalDeTarefasDaCategoria(String categoriaTarefa) {
        return 0;
    }



}
