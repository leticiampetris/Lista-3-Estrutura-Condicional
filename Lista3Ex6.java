import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Lista3Ex6{

    public static void main (String[]args){

        int produto = Integer.parseInt(JOptionPane.showInputDialog (null,
        "Informe o código do produto desejado:",
        "CARDÁPIO",
        JOptionPane.QUESTION_MESSAGE,
        new ImageIcon(Lista3Ex6.class.getResource("cardapio.png")),null, null).toString());

        int quantidade = 0;

        double valor = 0;

        int bolos = 0;

        int doces = 0;

        int sanduiches = 0;

        int pizzas = 0;

        while (produto != 16) {
            
            if (produto == 1) {
                quantidade = quantidade + 1;
                bolos = bolos + 1;
                valor = valor + 29.5;
            } else if (produto == 2) {
                quantidade = quantidade + 1;
                bolos = bolos + 1;
                valor = valor + 2;
            } else if (produto == 3) {
                quantidade = quantidade + 1;
                bolos = bolos + 1;
                valor = valor + 29.23;
            } else if (produto == 4) {
                quantidade = quantidade + 1;
                bolos = bolos + 1;
                valor = valor +7.1;
            } else if (produto == 5) {
                quantidade = quantidade + 1;
                bolos = bolos + 1;
                valor = valor + 19.33;
            } else if (produto == 6) {
                quantidade = quantidade + 1;
                doces = doces + 1;
                valor = valor + 17.71;
            } else if (produto == 7) {
                quantidade = quantidade + 1;
                doces = doces + 1;
                valor = valor + 4.82;
            } else if (produto == 8) {
                quantidade = quantidade + 1;
                sanduiches = sanduiches + 1;
                valor = valor + 21.16;
            } else if (produto == 9) {
                quantidade = quantidade + 1;
                sanduiches = sanduiches + 1;
                valor = valor + 12.7;
            } else if (produto == 10) {
                quantidade = quantidade + 1;
                sanduiches = sanduiches + 1;
                valor = valor + 19.7;
            } else if (produto == 11) {
                quantidade = quantidade + 1;
                sanduiches = sanduiches + 1;
                valor = valor + 28.22;
            } else if (produto == 12) {
                quantidade = quantidade + 1;
                pizzas = pizzas + 1;
                valor = valor + 8.98;
            } else if (produto == 13) {
                quantidade = quantidade + 1;
                pizzas = pizzas + 1;
                valor = valor + 0.42;
            } else if (produto == 14) {
                quantidade = quantidade + 1;
                pizzas = pizzas + 1;
                valor = valor + 18.36;
            }  else if (produto == 15) {
                quantidade = quantidade + 1;
                pizzas = pizzas + 1;
                valor = valor + 27.5;
            }
            
            produto = Integer.parseInt(JOptionPane.showInputDialog (null,
            "Informe o código do produto desejado:",
            "CARDÁPIO",
            JOptionPane.QUESTION_MESSAGE,
            new ImageIcon(Lista3Ex6.class.getResource("cardapio.png")),null, null).toString());

        }

        double media = valor / quantidade;

        JOptionPane.showMessageDialog(null, "Quantidade de bolos escolhidos: " + bolos +
                                    "\nQuantidade de doces escolhidos: " + doces +
                                    "\nQuantidade de sanduiches escolhidos: " + sanduiches +
                                    "\nQuantidade de pizzas escolhidas: " + pizzas +
                                    "\nValor médio dos produtos: " + media);

    }
}