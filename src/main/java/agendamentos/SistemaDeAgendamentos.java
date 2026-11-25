package agendamentos;
import java.util.List;


public interface SistemaDeAgendamentos {


        // 1 - Marca um horário (lança erro se o horário já estiver ocupado)
        public void agendar(String cliente, String data, String hora) throws HorarioIndisponivelException;

        // 2 - Cancela um agendamento pelo número (lança erro se não existir)
        public void cancelar(int id) throws AgendamentoNaoEncontradoException;

        // 3 - Confere se os dados são válidos (lança erro se algo estiver vazio ou errado)
         public void validarDados(String cliente, String data, String hora) throws DadosInvalidosException;

        // 4 - Lista todos os agendamentos
        public List<String> listarAgendamentos();

        // 5 - Busca os agendamentos de um cliente
         public List<String> buscarPorCliente(String cliente);

        // 6 - Diz se um horário está livre
        public boolean horarioDisponivel(String data, String hora);

        // 7 - Conta quantos agendamentos existem
        public int contarAgendamentos();

}
