package dominio;

public class Ejercicio7 {
    public static int sumaPares(int n){
        if(n<=1){
            return 0;
        }
        if(n%2!=0){
            return sumaPares(n-1);
        }else{
            return sumaPares(n-2)+n;

        }
    }
}
