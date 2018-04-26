import javax.swing.JOptionPane;

public class Lista3Ex7{

    public static void main (String[]args){

        JOptionPane.showMessageDialog (null, "Informe os dados solicitados para cada jogador da seleção.");
        
        int restante = 22;
        String nome = "";
        int idade = 0;
        double peso = 0;
        String sexo = "";
        double altura = 0;
        int gols = 0;
        int amarelos = 0;
        int vermelhos = 0;

        sexo = JOptionPane.showInputDialog(null, "Selecione o sexo:", null, JOptionPane.QUESTION_MESSAGE, null,
                                        new Object [] {"Masculino", "Feminino"}, "Masculino").toString();


    

    }
}