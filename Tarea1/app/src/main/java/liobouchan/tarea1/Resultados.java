package liobouchan.tarea1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {

    private TextView textViewFactorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        textViewFactorial = (TextView)findViewById(R.id.textViewFactorial);

        Bundle bundle = this.getIntent().getExtras();

        textViewFactorial.setText(bundle.getString("resultadoFactorial"));

    }
}
