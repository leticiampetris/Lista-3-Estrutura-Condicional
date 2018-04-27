import javax.swing.JOptionPane;

public class Lista3Ex9{

    public static void main (String[]args){

    String palavra = JOptionPane.showInputDialog("Digite uma palavra ou expressão.");
    
    int ordem = 1;

    char letra = palavra.charAt(ordem-1);

    JOptionPane.showMessageDialog(null, ordem + "º caractere digitado:\n" + letra);

    while (ordem <= palavra.length()) {       
        ordem = ordem + 1;
        letra = palavra.charAt(ordem-1);
        JOptionPane.showMessageDialog(null, ordem + "º caractere digitado:\n" + letra);
    }
    
    }
}