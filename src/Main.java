import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        // Classe objeto         Construtor
        Turista mochileiro = new Turista();
        // Definir formato do objeto
        mochileiro.setNome("Lindsay Lohan");
        mochileiro.setCpf("123");
        Turista mochileira = new Turista("Mariana");
        mochileira.setNome("James Gun");
        // Definir comportamento
        String retorno = mochileira.viajar();
        System.out.println(retorno);

        //Criar um novo objeto
        Turista outroTurista = new Turista();
        String nome = JOptionPane.showInputDialog(" Entre com seu nome:");
        outroTurista.setNome(nome);
        JOptionPane.showInputDialog(null, " O nome digitado foi" +
                outroTurista.getNome());
        //Criar a captura do CPF deste objeto
        String cpf = JOptionPane.showInputDialog(" Digite o seu CPF:");
        if(Validacao.cpf(cpf))
        outroTurista.setCpf(cpf);
        else
            System.out.println(" ERRO, CPF NÃO VALIDADO!!!");
        JOptionPane.showInputDialog(null , outroTurista.getCpf()
                + " validado!");
    }
}