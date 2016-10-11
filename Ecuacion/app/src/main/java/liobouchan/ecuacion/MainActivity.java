package liobouchan.ecuacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText valorA;
    private EditText valorB;
    private EditText valorC;
    private Button resolver;
    private int a,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenemos lo importante de la interfaz activity_main.mxl
        valorA = (EditText)findViewById(R.id.VariableA);
        valorB = (EditText)findViewById(R.id.VariableB);
        valorC = (EditText)findViewById(R.id.VariableC);
        resolver = (Button)findViewById(R.id.BotonResolver);

        resolver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , ResultadoActivity.class);
                Bundle bundle = new Bundle();
                a = Integer.valueOf(valorA.getText().toString());
                b = Integer.valueOf(valorB.getText().toString());
                c = Integer.valueOf(valorC.getText().toString());

                bundle.putString("resultadox1", String.valueOf(ResolverX1(a,b,c)));
                bundle.putString("resultadox2", String.valueOf(ResolverX2(a,b,c)));

                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

    }

    public double ResolverX1(int a, int b, int c){
        double discriminante;
        double x1;

        discriminante = b*b-4*a*c;

        if (discriminante < 0) {
            System.out.println ("La Ecuacion No Tiene Soluciones Reales");
            x1 = 0.0;
        }else {
            System.out.println ("La ecuacion tiene dos raizes reales");
            x1 = (-b+Math.sqrt(discriminante))/2.0/a;
            System.out.println ("La Solucion es, X1 = " +x1+ " y, X2 = ");
        }

        return x1;
    }

    public double ResolverX2(int a, int b, int c){
        double discriminante;
        double x2;

        discriminante = b*b-4*a*c;

        if (discriminante < 0) {
            System.out.println("La Ecuacion No Tiene Soluciones Reales");
            x2 = 0.0;
        }else {
            System.out.println ("La ecuacion tiene dos raizes reales");
            x2 = (-b - Math.sqrt(discriminante)) / 2.0/a;
            System.out.println ("La Solucion es, X1 = " +x2+ " y, X2 = ");
        }

        return x2;
    }
}
