import java.util.Scanner;
public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce un dia de la semana: ");
		
		String diaSemana =  sc.nextLine().toLowerCase();
		
		switch (diaSemana) {
        case "lunes":
        case "martes":
        case "miércoles":
        case "jueves":
        case "viernes":
            System.out.println("El " + diaSemana + " es un día laborable");
            break;
        case "sábado":
        case "domingo":
            System.out.println("El " + diaSemana + " NO es un día laborable");
            break;
        default:
            System.out.println("El día introducido no existe");
    }


	}

}
