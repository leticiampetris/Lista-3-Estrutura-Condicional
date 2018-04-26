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

        int letraA = 0;

        int letraG = 0;

        while (contaCarros < quantidade) {
            modelo = JOptionPane.showInputDialog("Digite o modelo:");
            valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do carro:"));
            ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro:"));
            contaCarros = contaCarros + 1;
            somaAno = somaAno + ano;
            somaValor = somaValor + valor;
            char letra = modelo.charAt(0);
            letra = Character.toLowerCase(letra);

            if (letra == 'g') {
                letraG = letraG + 1;
            } else if (letra == 'a') {
                letraA = letraA + 1;
            }
        }

        double mediaAno =  ((double)somaAno / quantidade);

        double mediaValor = somaValor / quantidade;
        
        JOptionPane.showMessageDialog(null, "Ano médio dos carros: " + mediaAno +
                                            "\nValor médio dos carros: " + mediaValor +
                                            "\nQuantidade de Carros que começam com a letra \"G\": " +
                                            letraG +
                                            "\nQuantidade de Carros que começam com a letra \"A\": " +
                                            letraA);


    }
}