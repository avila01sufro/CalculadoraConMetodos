package calculadora;

import java.util.Scanner;

public class CalculadoraConMetodos {

    static Scanner teclado = new Scanner(System.in);
    static int num1, num2, opcion;
    public static void main(String[] args) {
            float resultado=0;

            while(opcion !=7) {
                menu();
                validacion_menu();
                validacion_numeros();
                resultado = menu_opciones();
                System.out.println("La operacion retorna: " + resultado);
            }

    }

    static void menu() {
        System.out.println("Seleccione una operacion: "+"\n 1. Sumar"+" 2. Restar"+" 3. Multiplicar"+"\n 4. Dividir"+" 5. Encontrar mayor"+" 6. Calcular potencia"+" 7. Salir");

    }

    static float menu_opciones() {
        //despues de validados los numeros y la opcion, se seleccionara con un “switch” la operación elegida
            float resultado=0;
        switch (opcion) {

            case 1:
                resultado=Suma(num1, num2);
                break;

            case 2:
                resultado=Resta(num1, num2);
                break;

            case 3:
                resultado=Multiplicacion(num1, num2);
                break;

            case 4:
                resultado=Division(num1, num2);
                break;

            case 5:
                resultado=Comparacion(num1, num2);
                break;

            case 6:
                resultado=Potencia(num1, num2);
                break;

            case 7:
                System.out.println("Terminando...");
                System.exit(0);
                break;

            default:
                System.out.println("Elección invalida");
        }
        return resultado;

    }

     static void validacion_menu(){
            /*los 2 metodos validadores funcionan en base a try-catch y do-while. si se comete un error,
             la flag volvera a ser 0, por lo cual el bucle comenzara de nuevo. si los valores intriducidos
             son correctos, flag seguira siendo 1, saliendo del bucle*/
         int flag;
         do {
             flag=1;
            try {
                System.out.println("Ingrese la opción: ");
                opcion = teclado.nextInt();

            } catch (Exception e) {
                System.out.println("Error, ingrese nuevamente");
                teclado.next();
                //opcion=0;
                flag=0;
            }

        }while(flag==0);
     }

     static void validacion_numeros(){
         int flag;
        do {
            try {
                flag = 1;
                System.out.println("Ingrese 2 numeros: ");
                num1 = teclado.nextInt();
                num2 = teclado.nextInt();
            } catch (Exception e) {
                System.err.println("Error, reingrese numeros: ");
                teclado.next();

                flag = 0;
            }
        }while(flag==0);
     }

    static float Suma(int num1, int num2) {
        //Sumara 2 valores  enteros y los almacenara dentro de una variable float
        int suma = num1 + num2;
        return suma;
    }

    static float Resta(int num1, int num2) {
        //Restara 2 Valores  enteros y los almacenara dentro de una variable int
        int resta = num1 - num2;
        return resta;
    }

    static float Multiplicacion(int num1, int num2) {
        //Multiplicara 2 Valores enteros , devolviendo un int
        int mult = (num1 * num2);
        return mult;
    }

    static float Division(float num1, float num2) {
        // Divide dos valores enteros (el 2do número no puede ser 0), y devolverá un float como resultado.

            float div = (num1 / num2);
            return div;}

    static float Comparacion(int num1, int num2) {
        // Compara ambos números con el condicional "if".
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    static float Potencia(int num1, int num2) {
        /* Potencia el primer numero usando como exponente el segundo. "pot" ira almacenando el valor resultante
         en cada iteracion del bucle "for", y por cada ciclo, el numero se ira multiplicando por su potencia anterior. */
        int pot = 1;
        for (int i = 0; i < num2; i++) {
            pot = pot * num1;
        }
        return pot;
    }
}
