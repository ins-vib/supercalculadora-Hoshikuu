

package org.yourcompany.calculadora;

import java.util.Random;

/**
 *
 * @author Posa el teu nom
 */


public class Calculadora {

    public static void main(String[] args) {

        // Exemples de crida per al mètode nombreDigits
        System.out.println("Nombre de dígits de 1234: " + nombreDigits(1234));
        System.out.println("Nombre de dígits de 56789: " + nombreDigits(56789));
        System.out.println("Nombre de dígits de -101010: " + nombreDigits(-101010));
        System.out.println("Nombre de dígits de 0: " + nombreDigits(0));

        // Exemples de crida per al mètode sumaPrimersNumeros
        // System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(5));
        // System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
        // System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));

        // Exemples de crida per al mètode calcularFactorial
        // System.out.println("Factorial de 5: " + calcularFactorial(5));
        // System.out.println("Factorial de 7: " + calcularFactorial(7));
        // System.out.println("Factorial de 10: " + calcularFactorial(10));

        // Exemples de crida per al mètode sumaQuadrats
        // System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
        // System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
        // System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));

        // Exemples de crida per al mètode calcularPotencia
        // System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
        // System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
        // System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));

        int rep1 = numeroCares(10000);
        int rep2 = numeroCares(10000);
        int rep3 = numeroCares(10000);

        System.out.println("Rep1: " + rep1 + "\nRep2: " + rep2 + "\nRep3: " + rep3);

        double preu1 = preuCinema(8, true, false);
        double preu2 = preuCinema(5, false, false);
        double preu3 = preuCinema(6, true, true);

        System.out.println("P1: " + preu1 + "\nP2: " + preu2 + "\nP3: " + preu3);
    }

    /**
     * Calcula el nombre de dígits d’un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     *
     * @param nombre Número del qual es vol saber el nombre de dígits
     * @return Quantitat de dígits que té {@code nombre}
     */
    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1; // el 0 té un dígit
        }        
        int comptador = 0;
        while (nombre != 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    }

    public static int numeroCares(int rep) {
        Random random = new Random();
        
        int cara = 0;
        int cruz = 0;
        
        for (int i = 0; i < rep; i++) {
            int lanzamiento = random.nextInt(0, 2);
            
            if (lanzamiento == 0) {
                cara++;
            }
            else {
                cruz++;
            }
        }
        
        System.out.println("Cara: " + cara);
        System.out.println("Cruz: " + cruz);

        return cara;
    }

    public static double preuCinema(double preuBase, boolean esCapDeSetmana, boolean teCarnetJove) {
        double preu = preuBase;
        
        if(esCapDeSetmana) {
            preu = preu * 1.1;
        }
        
        if(teCarnetJove) {
            preu = preu * 0.85;
        }
        
        return preu;
    }
}
