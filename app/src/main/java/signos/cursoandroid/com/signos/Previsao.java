package signos.cursoandroid.com.signos;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
public class Previsao extends AppCompatActivity {
//public class Previsao extends AppCompatActivity implements DialogInterface.OnClickListener {


    private ImageView carneiro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previsao);

        carneiro=findViewById(R.id.btnCarneiroId);
        carneiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Previsao.this, carneiro.class);
                startActivity(intent);




            }
        });
    }
  //  public void onClick(View view) {

    //    EditText campoEndereco = (EditText) findViewById(R.id.edUrl);

//        String endereco = campoEndereco.getText().toString();

  //      Uri uri = Uri.parse(endereco);

    //    Intent intent = new Intent(Intent.ACTION_VIEW, uri);

      //  startActivity(intent);
    //}
}

