package liobouchan.ecuacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView resultadoX1;
    private TextView resultadoX2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        resultadoX1 = (TextView)findViewById(R.id.resultadoX1);
        resultadoX2 = (TextView)findViewById(R.id.resultadoX2);

        Bundle bundle = this.getIntent().getExtras();

        resultadoX1.setText("EL resultado es X1= " + bundle.getString("resultadox1"));
        resultadoX2.setText(" y X2= " + bundle.getString("resultadox2"));
    }
}
