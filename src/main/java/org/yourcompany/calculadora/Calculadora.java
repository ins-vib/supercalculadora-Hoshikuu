package org.yourcompany.calculadora;

import java.util.Random;

public class Calculadora {
    public static void main(String[] args) {
        // Exemples de crida per al mètode sumaPrimersNumeros
        System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(5));
        System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
        System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));

        // Exemples de crida per al mètode calcularFactorial
        System.out.println("Factorial de 5: " + calcularFactorial(5));
        System.out.println("Factorial de 7: " + calcularFactorial(7));
        System.out.println("Factorial de 10: " + calcularFactorial(10));

        // Exemples de crida per al mètode sumaQuadrats
        System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
        System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
        System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));

        // Exemples de crida per al mètode calcularPotencia
        System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
        System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
        System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));

        // Exemples de crida per al mètode nombreDigits
        System.out.println("Nombre de dígits de 1234: " + nombreDigits(1234));
        System.out.println("Nombre de dígits de 56789: " + nombreDigits(56789));
        System.out.println("Nombre de dígits de -101010: " + nombreDigits(-101010));
        System.out.println("Nombre de dígits de 0: " + nombreDigits(0));

        // Exemples de tirar monedes amb el mètode numeroCares
        System.out.println("Nombre de cares en 10 tirades: " + numeroCares(10));
        System.out.println("Nombre de cares en 100 tirades: " + numeroCares(100));
        System.out.println("Nombre de cares en 1000 tirades: " + numeroCares(1000));

        // Exemples de preus de cinema amb el mètode preuCinema
        System.out.println("Preu del cinema si 8€ de base, es cap de setmana i no te carnet jove: " + preuCinema(8, true, false));
        System.out.println("Preu del cinema si 5€ de base, es cap de setmana i te carnet jove: " + preuCinema(5, true, true));
        System.out.println("Preu del cinema si 7€ de base, no es cap de setmana i te carnet jove: " + preuCinema(7, false, true));
    }

    public static int sumaPrimersNumeros(int num) {
        int suma = 0;
        
        for (int i = 1; i <= num ; i++) {
            suma += i;
        }

        return suma;
    }

    public static int calcularFactorial(int num) {
        int factorial = 1;

        for (int i = 1; i <= num ; i++) {
            factorial *= i;
        }
        
        return factorial;
    }

    public static int sumaQuadrats(int num) {
        int suma = 0;

        for (int i = 1; i <= num ; i++) {
            suma += i * i;
        }
        
        return suma;
    }

    public static int calcularPotencia(int base, int exponent) {
        int resultat = 1;

        for (int i = 0; i < exponent; i++) {
            resultat *= base;
        }
        
        return resultat;
    }

    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1;
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
        
        for (int i = 0; i < rep; i++) {
            int lanzamiento = random.nextInt(0, 2);
            
            if (lanzamiento == 0) {
                cara++;
            }
        }

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