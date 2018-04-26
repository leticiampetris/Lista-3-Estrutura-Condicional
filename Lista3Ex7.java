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

        String comMenorPeso = "";
        double menorPeso = 100000;
        String comMaiorAltura = "";
        double maiorAltura = 0;
        String comMaiorNome = "";
        int tamanhoMaiorNome = 0;
        int mulheres = 0;
        int homens = 0;
        String comMenosAmarelos = "";
        int menosAmarelos = 100000;
        String comMenorNome = "";
        int tamanhoMenorNome = 100000;
        String comMaiorPeso = "";
        double maiorPeso = 0;        
        String comMaisVermelhos = "";
        int maisVermelhos = 0;        
        String comMaisAmarelos = "";
        int maisAmarelos = 0;        
        String comMenosVermelhos = "";
        int menosVermelhos = 100000;

        while (restante > 0) {
            restante = restante - 1;
            nome = JOptionPane.showInputDialog("Nome:");
            idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
            peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
            sexo = JOptionPane.showInputDialog(null, "Sexo:", null, JOptionPane.QUESTION_MESSAGE,
                                        null, new Object [] {"Masculino", "Feminino"},
                                        "Masculino").toString();
            altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
            gols = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de gols marcados:"));
            amarelos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de cartões amarelos:"));
            vermelhos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de cartões vermelhos:"));

            if (idade < menorIdade) {
                menorIdade = 
            }
            

        }

        


    

    }
}