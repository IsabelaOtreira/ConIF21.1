import java.util.Scanner;

public class Main { 
	static int QtGrilos = 0;

	        
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Quantos participantes a corrida vai ter? ");
        QtGrilos = scanner.nextInt();
        System.out.println("Grilos participantes " + QtGrilos);
        System.out.println("Quantos cms a corrida vai ter? ");
        Corrida.Pista = scanner.nextInt();
		
		CtlThread threads[] = null;
        Grilo[] grilos = new Grilo[QtGrilos];
        
        for ( int i = 0; i < QtGrilos; i++) {
            grilos[i] = new Grilo("Grilo_" + (i+1));
        }


        Corrida.Inicio(QtGrilos, threads, grilos);


    }
		}


