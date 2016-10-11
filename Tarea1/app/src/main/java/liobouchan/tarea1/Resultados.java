package liobouchan.tarea1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {

    private TextView textViewFactorial;
    private TextView textViewPrimo;
    private TextView textViewSeno;
    private TextView textViewCoseno;
    private TextView textViewTangente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        textViewFactorial = (TextView)findViewById(R.id.textViewFactorial);
        textViewPrimo = (TextView)findViewById(R.id.textViewPrimo);
        textViewSeno = (TextView)findViewById(R.id.textViewSeno);
        textViewCoseno = (TextView)findViewById(R.id.textViewCoseno);
        textViewTangente = (TextView)findViewById(R.id.textViewTangente);

        Bundle bundle = this.getIntent().getExtras();

        textViewFactorial.setText(bundle.getString("resultadoFactorial"));
        textViewPrimo.setText(bundle.getString("resultadoPrimo"));
        textViewSeno.setText(bundle.getString("resultadoSeno"));
        textViewCoseno.setText(bundle.getString("resultadoCoseno"));
        textViewTangente.setText(bundle.getString("resultadoTangente"));
    }
}
