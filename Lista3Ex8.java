import javax.swing.JOptionPane;

public class Lista3Ex8{

    public static void main (String[]args){

    int quantidade = Integer.parseInt(JOptionPane.showInputDialog(
        "Escolha a quantidade de caracteres de uma palavra ou expressão."));
    
    String palavra = "";
    int ordem = 0;

    while (quantidade > 0) {

        ordem = ordem + 1;
        quantidade = quantidade -1;

        char letra = (JOptionPane.showInputDialog("Digite o " + ordem + "º caractere.")).charAt(0);

        palavra = palavra + letra;
    }        

    JOptionPane.showMessageDialog(null, "A palavra ou expressão digitada foi:\n" + palavra);

    }
}