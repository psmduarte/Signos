package signos.cursoandroid.com.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listasignos;
    private String [] signos ={"Carneiro","touro", "Gemeos", "Caranguejo",
            "Leão", "Virgem", "Balança", "Escorpião", "Sagitário", "Capricórnio", "Aquário","Peixes"} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listasignos =findViewById(R.id.listViewId);
    }
}
