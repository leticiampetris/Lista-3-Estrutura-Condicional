import javax.swing.JOptionPane;

public class Lista3Ex5{

    public static void main (String[]args){

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número inteiro:"));
        double resultado = 0;
        int operacao = 0;
        String escolha = "";
        String simbolo = "";

        while (operacao != 5) {
            operacao = Integer.parseInt(JOptionPane.showInputDialog("Números escolhidos: " + numero1 + " e " + numero2 +
            "\nDigite o número correspondente à operação que deseja realizar:" +
            "\n1  |  Somar\n2  |  Subtrair\n3  |  Multiplicar\n4  |  Dividir\n5  |  Sair").trim());

            if (operacao == 1) {
                resultado = (numero1 + numero2);
                escolha = "Somar";
                simbolo = "+";
            } else if (operacao == 2) {
                resultado = (numero1 - numero2);
                escolha = "Subtrair";
                simbolo = "-";
            } else if (operacao == 3) {
                resultado = (numero1 * numero2);
                escolha = "Multiplicar";
                simbolo = "*";
            } else if (operacao == 4) {
                resultado = ((double)numero1 / numero2);
                escolha = "Dividir";
                simbolo = "/";               
            }

            if (operacao==1 || operacao==2 || operacao==3 || operacao == 4) {
                JOptionPane.showMessageDialog(null, "Números escolhidos: " + numero1 + " e " 
                                        + numero2 +
                                        "\nOperação escolhida: " + escolha + "\nResultado: " +
                                        numero1 + simbolo + numero2 + "=" + resultado);
            }
        }
    }
}