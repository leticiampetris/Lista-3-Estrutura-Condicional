import javax.swing.JOptionPane;

public class Lista3Ex7{

    public static void main (String[]args){

      
        int restante = Integer.parseInt(JOptionPane.showInputDialog (
            "Informe a quantidade de jogadores da seleção.\nNas próximas telas, informe os dados solicitados para cada jogador."));
        
        int numeroJogador = 0;
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
        int maisVermelhos = -1;        
        String comMaisAmarelos = "";
        int maisAmarelos = -1;        
        String comMenosVermelhos = "";
        int menosVermelhos = 100000;

        while (restante > 0) {

            numeroJogador = numeroJogador + 1;
            restante = restante - 1;

            String nome = JOptionPane.showInputDialog(null, "Nome:", "Jogador "
                        + numeroJogador, JOptionPane.QUESTION_MESSAGE).trim();
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Idade:", "Jogador "
                        + numeroJogador, JOptionPane.QUESTION_MESSAGE));
            double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Peso:", "Jogador "
                        + numeroJogador, JOptionPane.QUESTION_MESSAGE));
            String sexo = JOptionPane.showInputDialog(null, "Sexo:", "Jogador" + numeroJogador,
                        JOptionPane.QUESTION_MESSAGE,
                        null, new Object [] {"Masculino", "Feminino"}, "Masculino").toString();
            double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Altura:", "Jogador "
                        + numeroJogador, JOptionPane.QUESTION_MESSAGE));
            int gols = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Quantidade de gols marcados:", "Jogador "
                        + numeroJogador, JOptionPane.QUESTION_MESSAGE));
            int amarelos = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Quantidade de cartões amarelos:", "Jogador "
                        + numeroJogador, JOptionPane.QUESTION_MESSAGE));
            int vermelhos = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Quantidade de cartões vermelhos:", "Jogador "
                        + numeroJogador, JOptionPane.QUESTION_MESSAGE));
                      
            if (peso < menorPeso) {
                menorPeso = peso;
                comMenorPeso = nome;
            } else if (peso == menorPeso) {
                comMenorPeso = comMenorPeso + " - " + nome;
            }

            if (altura > maiorAltura) {
                maiorAltura = altura;
                comMaiorAltura = nome;
            } else if (altura == maiorAltura) {
                comMaiorAltura = comMaiorAltura + " - " + nome;
            }
            
            if (nome.length() > tamanhoMaiorNome) {
                tamanhoMaiorNome = nome.length();
                comMaiorNome = nome;
            } else if (nome.length() == tamanhoMaiorNome) {
                comMaiorNome = comMaiorNome + " - " + nome;
            }

            if (sexo.equals("Feminino")) {
                mulheres = mulheres + 1;
            } else if (sexo.equals("Masculino")) {
                homens = homens + 1;
            }

            if (amarelos < menosAmarelos) {
                menosAmarelos = amarelos;
                comMenosAmarelos = nome;
            } else if (amarelos == menosAmarelos) {
                comMenosAmarelos = comMenosAmarelos + " - " + nome;
            }

            if (nome.length() < tamanhoMenorNome) {
                tamanhoMenorNome = nome.length();
                comMenorNome = nome;
            } else if (nome.length() == tamanhoMenorNome) {
                comMenorNome = comMenorNome + " - " + nome;
            }

             if (peso > maiorPeso) {
                maiorPeso = peso;
                comMaiorPeso = nome;
            } else if (peso == maiorPeso) {
                comMaiorPeso = comMaiorPeso + " - " + nome;
            }

            if (vermelhos > maisVermelhos) {
                maisVermelhos = vermelhos;
                comMaisVermelhos = nome;
            } else if (vermelhos == maisVermelhos) {
                comMaisVermelhos = comMaisVermelhos + " - " + nome;
            }

            if (amarelos > maisAmarelos) {
                maisAmarelos = amarelos;
                comMaisAmarelos = nome;
            } else if (amarelos == maisAmarelos) {
                comMaisAmarelos = comMaisAmarelos + " - " + nome;
            }

            if (vermelhos < menosVermelhos) {
                menosVermelhos = vermelhos;
                comMenosVermelhos = nome;
            } else if (vermelhos == menosVermelhos) {
                comMenosVermelhos = comMenosVermelhos + " - " + nome;
            }

                            
        }

        JOptionPane.showMessageDialog(null, "Jogador(es) com menor peso: " + comMenorPeso +
                                    "\nJogador(es) com maior altura: " + comMaiorAltura +
                                    "\nJogador(es) com maior nome: " + comMaiorNome +
                                    "\nJogador(es) do sexo Feminino: " + mulheres +
                                    "\nJogador(es) do sexo Masculino: " + homens +
                                    "\nJogador(es) com menos cartões amarelos: " + comMenosAmarelos +
                                    "\nJogador(es) com menor nome: " + comMenorNome +
                                    "\nJogador(es) com maior peso: " + comMaiorPeso +
                                    "\nJogador(es) com mais cartões vermelhos: " + comMaisVermelhos +
                                    "\nJogador(es) com mais cartões amarelos: " + comMaisAmarelos +
                                    "\nJogador(es) com menos cartões vermelhos: " + comMenosVermelhos);
    

    }
}