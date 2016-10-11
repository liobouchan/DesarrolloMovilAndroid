package liobouchan.numeromaravilloso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumero;
    private Button botonMaravilloso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Elementos del código iguales a los elementos del XML
        editTextNumero = (EditText)findViewById(R.id.editTextNumero);
        botonMaravilloso = (Button)findViewById(R.id.buttonMaravilloso);

        //Implementación del OnCLickListener

    }
}
