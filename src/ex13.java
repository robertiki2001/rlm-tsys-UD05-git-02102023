import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un entero: ");
        int primerEntero = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce un entero: ");
        int segundoEntero = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Introduce un signo aritmético: ");
        String signoAritmetico = sc.nextLine();

        double totalDivision = (double) primerEntero / segundoEntero;
        double totalExponencial = Math.pow(primerEntero, segundoEntero);
        int totalResto = primerEntero % segundoEntero;

        switch (signoAritmetico) {
            case "+":
                System.out.println("La suma de los enteros es: " + (primerEntero + segundoEntero));
                break;
            case "-":
                System.out.println("La resta de los enteros es: " + (primerEntero - segundoEntero));
                break;
            case "*":
                System.out.println("La multiplicación de los enteros es: " + (primerEntero * segundoEntero));
                break;
            case "/":
                System.out.println("La división de los enteros es: " + totalDivision);
                break;
            case "^":
                System.out.println("El resultado de operando1 como base y operando2 como exponente es: " + totalExponencial);
                break;
            case "%":
                System.out.println("El resto de la división entre operando1 y operando2 es: " + totalResto);
                break;
            default:
                System.out.println("El signo aritmético introducido no existe");
        }
    }
}
