package MPolimorifismo.test;

import MPolimorifismo.dominio.Computador;
import MPolimorifismo.dominio.Produto;
import MPolimorifismo.dominio.Tomate;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto01 = new Computador("intel CORE i5",2000);
        Produto produto02 = new Tomate("Tomate cereja" , 5);

        produto01.Calculartaxa();
        produto02.Calculartaxa();



    }
}
