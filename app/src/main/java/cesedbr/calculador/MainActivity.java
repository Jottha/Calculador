package cesedbr.calculador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_soma = (Button)findViewById(R.id.btn_soma);
        Button btn_dividir = (Button)findViewById(R.id.btn_dividir);
        Button btn_multiplicar = (Button)findViewById(R.id.btn_multiplicacao);
        Button btn_subtrair = (Button)findViewById(R.id.btn_diminuir);
        Button cinco = (Button)findViewById(R.id.btn_cinco);
        Button sete = (Button)findViewById(R.id.btn_sete);





    }
}
