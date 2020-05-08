package calculadora;

import java.util.Scanner;

public class CalculadoraConMetodos {

    static Scanner teclado = new Scanner(System.in);
    static int num1, num2, opcion;
    public static void main(String[] args) {
            float resultadoF=0;

            while(opcion !=7) {
                menu();
                validacion_menu();
                
                menu_opciones(resultadoF);
                
            }

    }

    static void menu() { //Usa System.out.print para mostrar las opciones.
        System.out.println("Seleccione una operacion: "+"\n 1. Sumar"+" 2. Restar"+" 3. Multiplicar"+"\n 4. Dividir"+" 5. Encontrar mayor"+" 6. Calcular potencia"+" 7. Salir");

    }

    static float menu_opciones(float resol) {
        //despues de validados los numeros y la opcion, se seleccionara con un “switch” la operación elegida

        switch (opcion) {

            case 1:
                validacion_numeros();
                resol = Suma(num1, num2);
                MostrarResultadoFloat(resol);
                break;

            case 2:
                validacion_numeros();
                resol = Resta(num1, num2);
                MostrarResultadoFloat(resol);
                break;

            case 3:
                validacion_numeros();
                resol = Multiplicacion(num1, num2);
                MostrarResultadoFloat(resol);
                break;

            case 4:
                validacion_numeros();
                if (num2 != 0) {
                    resol = Division(num1, num2);
                    MostrarResultadoFloat(resol);
                    }else {
                    System.out.println("La división por 0 no está definida");
                    System.out.println("");
                }
                break;

            case 5:
                validacion_numeros();
                resol=Comparacion(num1, num2);
                MostrarResultadoFloat(resol);
                break;

            case 6:
                validacion_numeros();
                resol=Potencia(num1, num2);
                MostrarResultadoFloat(resol);
                break;

            case 7:
                System.out.println("Terminando...");
                System.exit(0);
                break;

            default:
                System.out.println("Elección invalida");
        }
        return resol;

    }

     static void validacion_menu(){
            /*Los 2 metodos validadores funcionan en base a try-catch y do-while. Si se comete un error,
             la flag volverá a ser 0 y el bucle comenzará de nuevo. Si los valores introducidos
             son correctos, flag seguirá siendo 1, terminando el bucle.*/
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
        //Segundo método de validación.
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
        //Suma dos valores enteros y los almacena dentro de una variable float.
        int suma = num1 + num2;
        return suma;
    }

    static float Resta(int num1, int num2) {
        //Resta dos valores enteros y los devuelve dentro de una variable int.
        int resta = num1 - num2;
        return resta;
    }

    static float Multiplicacion(int num1, int num2) {
        //Multiplica dos valores enteros, devolviendo un int.
        int mult = (num1 * num2);
        return mult;
    }

    static float Division(float num1, float num2) {
        // Divide dos valores enteros (el 2do número no puede ser 0), y devolverá un float como resultado.

            float div = (num1 / num2);
            return div;
        }

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

    static void MostrarResultadoFloat(float result){
        System.out.println("El resultado de la operación es: " +result);
        System.out.println("");
    }
}
