import javax.swing.JOptionPane;

public class Lista3Ex1{

    public static void main (String[]args){

        String nome = JOptionPane.showInputDialog("Digite um nome ou digite \"fim\" para encerrar.").trim();

        while (!nome.equalsIgnoreCase("fim")){
            nome = JOptionPane.showInputDialog("Digite um nome ou digite \"fim\" para encerrar.").trim();

        }
    }
}