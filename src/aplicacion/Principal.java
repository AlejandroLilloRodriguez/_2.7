package aplicacion;
import java.util.Scanner;
import dominio.Ejercicio7;
public class Principal {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduzca el numero");
        int numero=sc.nextInt();
        System.out.print(+Ejercicio7.sumaPares(numero));
    }
}
