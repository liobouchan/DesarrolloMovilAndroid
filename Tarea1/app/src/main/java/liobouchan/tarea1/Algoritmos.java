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
}
