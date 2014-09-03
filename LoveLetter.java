import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class LoveLetter {
	static int mazo[] = {1,1,1,1,1,2,2,3,3,4,4,5,5,6,7,8};
	int mazoJ[] = new int[2];
	int mazoC[] = new int[2];
	static int token=0;
	static String nomjug="";
    static String nomcpu="";
    int tokenj=0;
    int tokenc=0;
    static Scanner en = new Scanner(System.in);
    
    
public static void main(String[]arg){
	menu();

	}

public static void menu()
{
    int eleccion=0;
	System.out.println("<<Bienvenido a Letter Love>>");
    System.out.println("(1) Jugar una partida.");
    System.out.println("(2) Elegir número de tokens.");
    System.out.println("(3) Mostrar las reglas del juego.");
    System.out.println("(4) Salir.");
    eleccion = en.nextInt();
    if (eleccion==1)
    {
    	System.out.println("Ingrese su nombre:");
    	nomjug = en.next();
    	System.out.println("Ingrese el nombre de su contrincate:");
    	nomcpu = en.next();
    	Partida();
    }
    if (eleccion==2)
    {
    	SeleccionDeTokens();
    }
	if (eleccion==3)
	{
		System.out.println("Las Reglas Del Juego Son:");
		System.out.println("Si desea regresar al menu principal, presione la tecla (1)");
		eleccion = en.nextInt();
		if (eleccion==1);{
			menu();
		}
	}
	if (eleccion==4)
	{
		System.out.println("¿Seguro que quiere salir? (1)Si/(2)No");
		eleccion = en.nextInt();
		if (eleccion==2) {  
		     menu();
		}  else { 
			System.exit(0);  
		}
	}	
}
public static void SeleccionDeTokens(){
	System.out.println("Cuántos tokens desea jugar?");
	token = en.nextInt();
	while(token!=1 && token!=3){
		System.out.println("Error debe elegir 1 o 3, nada más.");
		System.out.println("Vuelva a ingresar el número de tokens.");
		token = en.nextInt();
	}
		System.out.println("La cantidad de tokens a jugar es:" +token);
	menu();
}
public static void Partida(){

}
}