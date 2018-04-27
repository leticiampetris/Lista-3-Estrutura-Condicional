import javax.swing.JOptionPane;

public class Lista3Ex10{

    public static void main (String[]args){

    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    int f = 0;
    int g = 0;
    int h = 0;
    int i = 0;
    int j = 0;
    int k = 0;
    int l = 0;
    int m = 0;
    int n = 0;
    int o = 0;
    int p = 0;
    int q = 0;
    int r = 0;
    int s = 0;
    int t = 0;
    int u = 0;
    int v = 0;
    int w = 0;
    int x = 0;
    int y = 0;
    int z = 0;
    
    String palavra = JOptionPane.showInputDialog("Digite uma palavra ou expressão.");    
    int ordem = 0;
    char letra = palavra.charAt(ordem);
    
    while (ordem < palavra.length()) {       
        letra = palavra.charAt(ordem);
        ordem = ordem + 1;



        System.out.println(letra);
        if (letra == 'a' || letra == 'A') {
            a = a + 1;
        }
        if (letra == 'b' || letra == 'B') {
            b = b + 1;
        }
        if (letra == 'c' || letra == 'C') {
            c = c + 1;
        }
        if (letra == 'd' || letra == 'D') {
            d = d + 1;
        }
        if (letra == 'e' || letra == 'E') {
            e = e + 1;
        }
        if (letra == 'f' || letra == 'F') {
            f = f + 1;
        }
        if (letra == 'g' || letra == 'G') {
            g = g + 1;
        }
        if (letra == 'h' || letra == 'H') {
            h = h + 1;
        }
        if (letra == 'i' || letra == 'I') {
            i = i + 1;
        }
        if (letra == 'j' || letra == 'J') {
            j = j + 1;
        }
        if (letra == 'k' || letra == 'K') {
            k = k + 1;
        }
        if (letra == 'l' || letra == 'L') {
            l = l + 1;
        }
        if (letra == 'm' || letra == 'M') {
            m = m + 1;
        }
        if (letra == 'n' || letra == 'N') {
            n = n + 1;
        }
        if (letra == 'o' || letra == 'O') {
            o = o + 1;
        }
        if (letra == 'p' || letra == 'P') {
            p = p + 1;
        }
        if (letra == 'q' || letra == 'Q') {
            q = q + 1;
        }
        if (letra == 'r' || letra == 'R') {
            r = r + 1;
        }
        if (letra == 's' || letra == 'S') {
            s = s + 1;
        }
        if (letra == 't' || letra == 'T') {
            t = t + 1;
        }
        if (letra == 'u' || letra == 'U') {
            u = u + 1;
        }
        if (letra == 'v' || letra == 'V') {
            v = v + 1;
        }
        if (letra == 'w' || letra == 'W') {
            w = w + 1;
        }
        if (letra == 'x' || letra == 'X') {
            x = x + 1;
        }
        if (letra == 'y' || letra == 'Y') {
            y = y + 1;
        }
        if (letra == 'z' || letra == 'Z') {
            z = z + 1;
        }

    }

    String texto = "";
    if(a > 0 ){
        texto = texto +  "Quantidade de letras \"A\": " + a;
    }
    
    JOptionPane.showMessageDialog(null, texto + 
                                "\nQuantidade de letras \"B\": " + b +
                                "\nQuantidade de letras \"C\": " + c +
                                "\nQuantidade de letras \"D\": " + d +
                                "\nQuantidade de letras \"E\": " + e +
                                "\nQuantidade de letras \"F\": " + f +
                                "\nQuantidade de letras \"G\": " + g +
                                "\nQuantidade de letras \"H\": " + h +
                                "\nQuantidade de letras \"I\": " + i +
                                "\nQuantidade de letras \"J\": " + j +
                                "\nQuantidade de letras \"K\": " + k +
                                "\nQuantidade de letras \"L\": " + l +
                                "\nQuantidade de letras \"M\": " + m +
                                "\nQuantidade de letras \"N\": " + n +
                                "\nQuantidade de letras \"O\": " + o +
                                "\nQuantidade de letras \"P\": " + p +
                                "\nQuantidade de letras \"Q\": " + q +
                                "\nQuantidade de letras \"R\": " + r +
                                "\nQuantidade de letras \"S\": " + s +
                                "\nQuantidade de letras \"T\": " + t +
                                "\nQuantidade de letras \"U\": " + u +
                                "\nQuantidade de letras \"V\": " + v +
                                "\nQuantidade de letras \"W\": " + w +
                                "\nQuantidade de letras \"X\": " + x +
                                "\nQuantidade de letras \"Y\": " + y +
                                "\nQuantidade de letras \"Z\": " + z);

    }
}