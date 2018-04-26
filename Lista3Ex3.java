import javax.swing.JOptionPane;

public class Lista3Ex3{

    public static void main (String[]args){

        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso."));

        int pessoas = 1;

        while (peso >= 0 && peso <= 300){
            peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso."));
            pessoas = pessoas + 1;
        }

        JOptionPane.showMessageDialog(null, pessoas + " pessoas informaram o peso.");
    }
}