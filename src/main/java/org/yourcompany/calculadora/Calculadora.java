package org.yourcompany.calculadora;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Hoshikuu
 */
public class Calculadora {
    /**
     * Mètode principal que inicia el menú de la calculadora
     * 
     * @param args Arguments de línia de comandes
     */
    public static void main(String[] args) {
        mostrarMenuConsola();
    }

    /**
     * Mostra un menú per consola per seleccionar diferents operacions matemàtiques
     */
    public static void mostrarMenuConsola() {
        try (Scanner teclat = new Scanner(System.in)) {
            int opcio;
            do {
                System.out.println("---- Supercalculadora ----");
                System.out.println("1. Sumar els primers numeros");
                System.out.println("2. Calcular factorials");
                System.out.println("3. Suma quadrats");
                System.out.println("4. Calcular potencia");
                System.out.println("5. Nombre de digits");
                System.out.println("6. Nombre de cares");
                System.out.println("7. Preu del cinema");
                System.out.println("8. Sortir");
                
                System.out.print("Entra la opció: ");
                opcio = teclat.nextInt();
                int num;
                
                switch (opcio) {
                    case 1 -> {
                        System.out.print("Entra el numero: ");
                        num = teclat.nextInt();
                        System.out.println("Suma dels primers " + num + " números: " + sumaPrimersNumeros(num));
                    }
                    case 2 -> {
                        System.out.print("Entra el numero: ");
                        num = teclat.nextInt();
                        System.out.println("Factorial de " + num + ": " + calcularFactorial(num));
                    }
                    case 3 -> {
                        System.out.print("Entra el numero: ");
                        num = teclat.nextInt();
                        System.out.println("Suma dels quadrats dels primers " + num + " números: " + sumaQuadrats(num));
                    }
                    case 4 -> {
                        System.out.print("Entra la base: ");
                        num = teclat.nextInt();
                        System.out.print("Entra el exponent: ");
                        int exponent = teclat.nextInt();
                        System.out.println(num + " elevat a la potència " + exponent + ": " + calcularPotencia(num, exponent));
                    }
                    case 5 -> {
                        System.out.print("Entra el numero: ");
                        num = teclat.nextInt();
                        System.out.println("Nombre de dígits de " + num + ": " + nombreDigits(num));
                    }
                    case 6 -> {
                        System.out.print("Entra el numero: ");
                        num = teclat.nextInt();
                        System.out.println("Nombre de cares en " + num + " tirades: " + numeroCares(num));
                    }
                    case 7 -> {
                        System.out.print("Entra el numero: ");
                        num = teclat.nextInt();
                        System.out.print("Es cap de setmana? (S/N): ");
                        boolean b_cap = Character.toUpperCase(teclat.next().charAt(0)) == 'S';
                        System.out.print("Te carnet jove? (S/N): ");
                        boolean b_carnet = Character.toUpperCase(teclat.next().charAt(0)) == 'S';
                        System.out.println("El preu del cinema es: " + preuCinema(num, b_cap, b_carnet) + "€");
                    }
                    case 8 -> {
                    }
                    default -> System.out.println("Opció no encontrada");
                }
            } while (opcio != 8);
        }
    }

    /**
     * Suma els primers números des de l'1 fins al número indicat
     * 
     * @param num Número fins al qual sumar
     * @return Suma dels primers números
     */
    public static int sumaPrimersNumeros(int num) {
        int suma = 0;
        
        for (int i = 1; i <= num ; i++) {
            suma += i;
        }

        return suma;
    }

    /**
     * Calcula el factorial d'un número enter positiu
     * 
     * @param num Número enter positiu
     * @return Factorial del número
     */
    public static int calcularFactorial(int num) {
        int factorial = 1;

        for (int i = 1; i <= num ; i++) {
            factorial *= i;
        }
        
        return factorial;
    }

    /**
     * Suma els quadrats dels primers números des de l'1 fins al número indicat
     * 
     * @param num Número fins al qual sumar els quadrats
     * @return Suma dels quadrats dels primers números
     */
    public static int sumaQuadrats(int num) {
        int suma = 0;

        for (int i = 1; i <= num ; i++) {
            suma += i * i;
        }
        
        return suma;
    }

    /**
     * Calcula la potència d'una base elevada a un exponent
     * 
     * @param base Base del exponent
     * @param exponent Exponent
     * @return Resultat de la potència
     */
    public static int calcularPotencia(int base, int exponent) {
        int resultat = 1;

        for (int i = 0; i < exponent; i++) {
            resultat *= base;
        }
        
        return resultat;
    }

    /**
     * Calcula la quantitat de dígits que té un nombre enter
     * 
     * @param nombre Nombre enter
     * @return Nombre de dígits que té el nombre
     */
    public static int nombreDigits(int nombre) {
        int comptador = 0;
        
        if (nombre == 0) {
            return 1;
        }

        while (nombre != 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    }

    /**
     * Calcula el nombre de cares obtingudes en un nombre de tirades d'una moneda
     * 
     * @param rep Nombre de tirades
     * @return Nombre de cares obtingudes
     */
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

    /**
     * Calcula el preu del cinema segons diferents condicions
     * 
     * @param preuBase Preu base de l'entrada
     * @param esCapDeSetmana Si és cap de setmana
     * @param teCarnetJove Si té carnet jove
     * @return Preu final de l'entrada
     */
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