package interfaces.som;

public class Tambor implements EmissorDeSom{

    private String marca;
    private String tamanho;


    public Tambor( String tamanho, String marca){
        this.marca = marca;
        this.tamanho = tamanho;
    }

    public String emitirSom(){
        return "bum bum";
    }

}
