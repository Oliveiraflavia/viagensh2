public class Turista {
   // Atributos
    private String nome;
    private String cpf;

    // Métodos
    public String viajar(){
        return "Viajando...";
    }
    //Construtor Padrão
    Turista(){
    }
    // Sobrecarga do construtor personalizao
    Turista(String _nome){
        this.nome =  _nome;
    }

    // Encapsulamento - Getters e Setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
