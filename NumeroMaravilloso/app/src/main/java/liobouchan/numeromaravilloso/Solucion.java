package liobouchan.numeromaravilloso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Solucion extends AppCompatActivity {

    private TextView textViewNumeros, textViewNumero;
    private int numero;
    private int original;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solucion);

        textViewNumeros = (TextView)findViewById(R.id.textViewNumeros);
        textViewNumero = (TextView)findViewById(R.id.textViewNumero);

        Bundle bundle = this.getIntent().getExtras();

        numero = Integer.valueOf(bundle.getString("numeroMaravilloso"));
        System.out.println("NUmero aqui ESTA PERRO MALDTO" + numero);
        textViewNumero.setText("Solución del Número Maravilloso");
        textViewNumeros.setText("Tu número es: " + numero + "\n" );

        int contador = 1;
        original = numero;

       while (true){
            if (numero % 2 == 0) {
                numero /= 2;
                textViewNumeros.append(String.valueOf(numero));
                textViewNumeros.append("\n");
            } else {
                numero = numero *3 + 1;
                textViewNumeros.append(String.valueOf(numero));
                textViewNumeros.append("\n");
            }
            if (numero == 1) {
                textViewNumeros.append(String.valueOf("El numero " + original + " es maravilloso"));
                textViewNumeros.append("\n");
                break;
            }
            else {
                contador++;
            }
        }

    }
}
