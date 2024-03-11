import Handlers.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Handler100 h100 = new Handler100();
        Handler50 h50 = new Handler50();
        Handler20 h20 = new Handler20();
        Handler10 h10 = new Handler10();
        Handler5 h5 = new Handler5();

        double saldo = 0;

        System.out.println("Ingrese el saldo a retirar: ");
        saldo = sc.nextDouble();
        while(saldo % 5000 != 0){
            System.out.println("Ingrese por favor un saldo multiplo de 5000:");
            saldo = sc.nextDouble();
        }

        System.out.println("La devolucion de su retiro se dio de la siguiente manera");

        h100.asignarSiguiente(h50);
        h50.asignarSiguiente(h20);
        h20.asignarSiguiente(h10);
        h10.asignarSiguiente(h5);

        h100.devolver(saldo);
    }
}
/*
Uno de los grandes ejemplos del patrón de Cadena de Responsabilidad es la máquina
dispensadora de un cajero automático. El usuario ingresa la cantidad a dispensar y la
máquina dispensa la cantidad en términos de billetes de moneda definidos, como $100.000,
$50.000, $20.000, $10.000. etc. Si el usuario ingresa una cantidad que no es un múltiplo de
5.000, arroja un error. Debe usarse el patrón Cadena de responsabilidad para implementar
esta solución. La cadena procesará la solicitud en el mismo orden que la siguiente tabla.

Denominación
100.000
50.000
20.000
10.000
5.000*/