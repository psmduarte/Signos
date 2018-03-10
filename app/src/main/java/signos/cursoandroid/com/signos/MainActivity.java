package signos.cursoandroid.com.signos;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private Button botao, btnSignos;
    private TextView textDataN, textIdade, signo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSignos = findViewById(R.id.btnSignosId);
        textDataN = findViewById(R.id.textDataN);
        textIdade = findViewById(R.id.textIdade);
        signo = findViewById(R.id.signoId);
        botao = findViewById(R.id.btnId);


        btnSignos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SignosActivity.class);
                startActivity(intent);
            }
        });


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
                textDataN.setText(dayOfMonth + "/" + (month + 1) + "/" + year);
                calcularIdade(dayOfMonth, month, year);

            }
        }, ano, mes, dia);
        datePickerDialog.show();
    }


    //Data de nascimento (N) / Data atual(A)
    private void calcularIdade(int diaN, int mesN, int anoN) {
        Calendar c = Calendar.getInstance();
        int diaA = c.get(Calendar.DAY_OF_MONTH);
        int mesA = c.get(Calendar.MONTH);
        int anoA = c.get(Calendar.YEAR);

        int idade = anoA - anoN;
        if (mesN > mesA) {
            idade = idade - 1;//ou idade--;

        } else if (mesA == mesN) {
            if (diaA < diaN) {
                idade = idade - 1;
            }
        }
        textIdade.setText("idade: " + idade);
        if ((diaN >= 20 && mesN >= 1 - 1) && (diaN <= 18 && mesN <= 2 - 1)) {
            signo.setText("Aquário");
        }
        if ((diaN >= 19 && mesN >= 2 - 1) && (diaN <= 20 && mesN <= 3 - 1)) {
            signo.setText("Peixes");
        }
        if ((diaN >= 21 && mesN >= 3 - 1) && (diaN <= 19 && mesN <= 4 - 1)) {
            signo.setText("Carneiro");
        }
        if ((diaN >= 20 && mesN >= 4 - 1) && (diaN <= 20 && mesN <= 5 - 1)) {
            signo.setText("Touro");
        }
        if ((diaN >= 21 && mesN >= 5 - 1) && (diaN <= 20 && mesN <= 6 - 1)) {
            signo.setText("Gémeos");
        }
        if ((diaN >= 21 && mesN >= 6 - 1) && (diaN <= 22 && mesN <= 7 - 1)) {
            signo.setText("Aquário");
        }
        if ((diaN >= 20 && mesN >= 1 - 1) && (diaN <= 18 && mesN <= 2 - 1)) {
            signo.setText("Carangueijo");
        }
        if ((diaN >= 23 && mesN >= 7 - 1) && (diaN <= 22 && mesN <= 8 - 1)) {
            signo.setText("Leão");
        }
        if ((diaN >= 23 && mesN >= 8 - 1) && (diaN <= 22 && mesN <= 9 - 1)) {
            signo.setText("Virgem");
        }
        if ((diaN >= 23 && mesN >= 9 - 1) && (diaN <= 22 && mesN <= 10 - 1)) {
            signo.setText("Balança");
        }
        if ((diaN >= 23 && mesN >= 10 - 1) && (diaN <= 21 && mesN <= 11 - 1)) {
            signo.setText("Escorpião");
        }
        if ((diaN >= 22 && mesN >= 11 - 1) && (diaN <= 21 && mesN <= 12 - 1)) {
            signo.setText("Sagitário");
        } else {
            signo.setText("Capricórnio");
        }

    }
}
