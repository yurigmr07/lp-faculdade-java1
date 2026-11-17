package agendamentos;
import java.util.List;


public interface SistemaDeAgendamentos {


        // 1 - Marca um horário (lança erro se o horário já estiver ocupado)
        void agendar(String cliente, String data, String hora) throws HorarioIndisponivelException;

        // 2 - Cancela um agendamento pelo número (lança erro se não existir)
        void cancelar(int id) throws AgendamentoNaoEncontradoException;

        // 3 - Confere se os dados são válidos (lança erro se algo estiver vazio ou errado)
        void validarDados(String cliente, String data, String hora) throws DadosInvalidosException;

        // 4 - Lista todos os agendamentos
        List<String> listarAgendamentos();

        // 5 - Busca os agendamentos de um cliente
        List<String> buscarPorCliente(String cliente);

        // 6 - Diz se um horário está livre
        boolean horarioDisponivel(String data, String hora);

        // 7 - Conta quantos agendamentos existem
        int contarAgendamentos();

}
