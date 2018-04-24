import javax.swing.JOptionPane;

public class Lista3Ex2{

    public static void main (String[]args){

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade."));

        while (idade < 129){
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade."));
        }
    }
}