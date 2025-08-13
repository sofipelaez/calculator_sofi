// ANALISIS
/*
//Descripción: La calculadora deberá pedirle al usuario 2 numeros 
* y con esos 2 numeros realizar suma, resta,multiplicación, división y módulo
* Entadas: 2, numero 1 y numero 2, ambos ingresados por el usuario
* Salidas: 5, una por cada resultado de la operación aritmetica.
*/
import java.util.Scanner;

public class Calculadora{ 

    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);

            double numero1, numero2;

            System.out.println("Por favorcito deme el primer numerito:");
            numero1 = entrada.nextDouble();
            entrada.nextLine();
    
            System.out.println("Por favorcito deme el segundo numerito: ");
            numero2= entrada.nextDouble(); 
            entrada.nextLine();
            
            double suma, resta, multiplicacion, modulo, división; //Declaración
            suma = sumar (numero1 , numero2);
            resta = numero1 - numero2;
            multiplicacion = numero1 * numero2;
            modulo = numero1 % numero2;
            división = numero1 / numero2;

            System.out.println("El resultado de la suma es: " +suma);
            System.out.println("El resultado de la resta es: " +resta);
            System.out.println("El resultado de la multiplicacion es: "+ multiplicacion );
            System.out.println("El resultado del modulo es: " +modulo);
            System.out.println("El resultado de la división es: " +división);
    }
    public static double sumar (double a , double b) { 
        double suma = a + b;
        return suma;
    }
    
        public static double resta (double a, double b) {
            double resta = a - b;
            return a - b;
    }
    public static double multiplicacion (double a , double b){
        double multiplicacion = a * b;
        return a * b;
    }
    public static double modulo (double a , double b){
        double multiplicacion = a % b;
        return a % b;

    }
     public static double división (double a , double b){
        double división = a / b;
        return a / b;

    }
}
