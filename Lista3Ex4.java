import javax.swing.JOptionPane;

public class Lista3Ex4{

    public static void main (String[]args){

        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite a quantidade de carros que deseja informar."));

        int contaCarros = 0;

        String modelo = "";

        double valor = 0;

        int ano = 0;

        double somaValor = 0;

        int somaAno = 0;

        while (contaCarros < quantidade) {
            modelo = JOptionPane.showInputDialog("Digite o modelo:");
            valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do carro:"));
            ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro:"));
            contaCarros = contaCarros + 1;
            somaAno = somaAno + ano;
            somaValor = somaValor + valor;
        }

        Double mediaAno = (double) (somaAno / quantidade);

        Double mediaValor = somaValor / quantidade;
        
        JOptionPane.showMessageDialog(null, "Ano médio dos carros: " + mediaAno +
                                            "\nValor médio dos carros: " + mediaValor);

    }
}