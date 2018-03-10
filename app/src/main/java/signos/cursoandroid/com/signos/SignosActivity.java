package signos.cursoandroid.com.signos;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SignosActivity extends AppCompatActivity {

    private ListView listaSignos;
    private String[] signos={"Carneiro","Touro","Gemeos","Carangueijo","Leão","Virgem",
    "Balança","Escorpião","Sagitário","Capricornio","Aquário","Peixes"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signos);

        listaSignos = findViewById(R.id.listViewId);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),android.R.layout.simple_list_item_1,
                android.R.id.text1, signos
        );
            listaSignos.setAdapter(adaptador);

            listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {



                        Intent intent = new Intent(getApplicationContext(),PerfilSigno.class);
                        // set no intent o id ou a position do item selecionado
                        intent.putExtra("POSITION", position);

                        startActivity(intent);



                }
            });
    }
}
