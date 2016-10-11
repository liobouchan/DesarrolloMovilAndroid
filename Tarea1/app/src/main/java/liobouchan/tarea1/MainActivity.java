package liobouchan.tarea1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumero;
    private Button  buttonCalcular;
    private double numeroDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumero = (EditText)findViewById(R.id.editTextNumero);
        buttonCalcular = (Button)findViewById(R.id.buttonCalcular);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Resultados.class);
                Bundle bundle = new Bundle();
                Algoritmos algoritmo = new Algoritmos();

                numeroDouble = Double.valueOf(editTextNumero.getText().toString());

                bundle.putString("resultadoFactorial", String.valueOf(algoritmo.factorial(numeroDouble)));
                bundle.putString("resultadoPrimo", algoritmo.esPrimo(numeroDouble));
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
