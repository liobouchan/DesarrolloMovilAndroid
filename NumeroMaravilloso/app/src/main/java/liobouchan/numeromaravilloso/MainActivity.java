package liobouchan.numeromaravilloso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumero;
    private Button botonMaravilloso;
    private String numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Elementos del código iguales a los elementos del XML
        editTextNumero = (EditText)findViewById(R.id.editTextNumero);
        botonMaravilloso = (Button)findViewById(R.id.buttonMaravilloso);

        //Implementación del OnCLickListener
        botonMaravilloso.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this , Solucion.class);
                Bundle bundle = new Bundle();

                numero = editTextNumero.getText().toString();

                bundle.putString("numeroMaravilloso", numero);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
