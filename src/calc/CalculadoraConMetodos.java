package calc;

import java.util.Scanner;

public class CalculadoraConMetodos {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        int opcion;

        do {
            opcion = menu();
            selecOperacion(opcion);
        } while(opcion != 7);
    }


    public static int menu() {


        System.out.println("Seleccione una operación:");
        System.out.println("1. Sumar dos números");
        System.out.println("2. Restar dos números");
        System.out.println("3. Multiplicar dos números");
        System.out.println("4. Dividir dos números");
        System.out.println("5. Comparar dos números");
        System.out.println("6. Calcular la potencia de un número");
        System.out.println("7. Salir");

        return validar();
    }

    public static int validar(){
        int valor;
            while(!input.hasNextInt()){
                System.err.println("Introduzca un número como respuesta");
                input.next();
            }
            valor = input.nextInt();
        return valor;
    }

    public static void selecOperacion(int selec){
        switch (selec){

            case 1: Suma();
            break;

            case 2: Resta();
            break;

            case 3: Multiplicacion();
            break;

            case 4:
                Division();
                break;

            case 5:
                Comparacion();
                break;

            case 6:
                Potencia();
                break;

            case 7:
                System.err.println("Terminando...");
                break;

            default:
                System.err.println("Elección inválida");
        }
    }


}
