package iConstantes.test;

import iConstantes.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro car = new Carro("Fusca");
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(car);
    }
}
