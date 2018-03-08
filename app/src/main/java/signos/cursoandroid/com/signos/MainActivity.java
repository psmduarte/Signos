package signos.cursoandroid.com.signos;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private TextView textDataN, textIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textDataN = findViewById(R.id.textDataN);
        textIdade = findViewById(R.id.textIdade);
        botao = findViewById(R.id.btnId);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData();
            }
        });

    }





    private void setData() {

        Calendar c = Calendar.getInstance();
        int dia = c.get(Calendar.DAY_OF_MONTH);
        int mes = c.get(Calendar.MONTH);
        int ano = c.get(Calendar.YEAR);

        DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                textDataN.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                calcularIdade( dayOfMonth, month, year);

            }
        },ano,mes,dia);
        datePickerDialog.show();
    }
    //Data de nascimento (N) / Data atual(A)
    private void calcularIdade(int diaN, int mesN,int anoN) {
        Calendar c = Calendar.getInstance();
        int diaA = c.get(Calendar.DAY_OF_MONTH);
        int mesA = c.get(Calendar.MONTH);
        int anoA = c.get(Calendar.YEAR);

        int idade = anoA - anoN;
        if (mesN > mesA) {
            idade=idade-1;//ou idade--;

        } else if (mesA == mesN) {
            if (diaA < diaN) {
                idade=idade-1;
            }
        }
        textIdade.setText("idade: " + idade);

    }
}
