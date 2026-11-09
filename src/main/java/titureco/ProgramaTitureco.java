package titureco;

import java.util.List;

public class ProgramaTitureco {
    public static void main(String[] args) {
        TiturecoInterface titureco = new TiturecoList();

        Praia p1 = new Praia("Praia de Tambaú", -7.1155, -34.8250,
                "Siga pela Av. Cabo Branco", "João Pessoa", "PB",
                true, false, Praia.TIPO_ONDAS_MEDIAS);
        Praia p2 = new Praia("Picãozinho", -7.1130, -34.8220,
                "Barco saindo de Tambaú", "João Pessoa", "PB",
                true, false, Praia.TIPO_PISCINAS_NATURAIS);
        Praia p3 = new Praia("Boa Viagem", -8.1190, -34.9000,
                "Av. Boa Viagem", "Recife", "PE",
                false, true, Praia.TIPO_ONDAS_FORTES);

        System.out.println("Cadastrou Tambaú? " + titureco.cadastrarAtrativo(p1));
        System.out.println("Cadastrou Picãozinho? " + titureco.cadastrarAtrativo(p2));
        System.out.println("Cadastrou Boa Viagem? " + titureco.cadastrarAtrativo(p3));
        System.out.println("Cadastrou Tambaú de novo? " + titureco.cadastrarAtrativo(p1));

        System.out.println("\n--- Todos os atrativos ---");
        for (AtrativoTuristico a : titureco.getAtrativo()) {
            System.out.println(a);
        }

        System.out.println("\n--- Atrativos de João Pessoa/PB ---");
        List<AtrativoTuristico> daCidade = titureco.pesquisaAtrativoDaCidade("João Pessoa", "PB");
        for (AtrativoTuristico a : daCidade) {
            System.out.println(a);
        }

        System.out.println("\nApagou Boa Viagem? "
                + titureco.apagarAtrativo("Boa Viagem", "Recife", "PE"));
        System.out.println("Total de atrativos: " + titureco.getAtrativo().size());
    }
}
