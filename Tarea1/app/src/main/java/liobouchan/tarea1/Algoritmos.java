package liobouchan.tarea1;

/**
 * Created by liobouchan on 10/10/16.
 */

public class Algoritmos {
    public double factorial (double numero) {
        if (numero==0)
            return 1;
        else
            return numero * factorial(numero-1);
    }

    public String esPrimo (double numero){
        int a = 0;

        for(int i = 1; i<(numero+1);i++){
            if (numero%i == 0){
                a++;
            }
        }

        if (a!=2){
            return "No es Primo";
        }else{
            return "Si es Primo";
        }
    }

}
