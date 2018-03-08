package signos.cursoandroid.com.signos;

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

    private String[] perfis={"O Diabo de Desafio Enérgico. Aventureiro e espontâneo. Confiante e entusiástico. Divertido. Ama um desafio. EXTREMAMENTE impaciente. Às vezes egoísta. Fusível curto (enfurece facilmente) Vivido, inteligência apaixonada e afiada. Gosta de sair. Perde interesse depressa - facilmente entediado. Egoístico. Corajoso e afirmativo. Tende a ser físico e atlético.",
            "O Resistente. Que encanta mas agressivo. Podem parecer enfadonhos, mas não são. Trabalhadores duros. Amável. Forte, tem resistência. Seres sólidos e estáveis e seguros dos modos deles/delas. Não procuram atalhos. Orgulhosos da beleza deles/delas. Pacientes e seguros. Fazem grandes amigos e dão bons conselhos. Bom coração. Amam profundamente - apaixonados. Expressam-se emocionalmente. Propenso a temperamento-acessos de raiva ferozes. Determinado. Cedem aos seus desejos freqüentemente. Muito generoso.",
            "O Tagarela. Inteligente e engenhoso. Parece estar sempre de saída, muito falador. Vivo, enérgico. Adaptável mas com necessidade de se expressar. Argumentativo e franco. Gosta de mudança. Versátil. Ocupado, mas às vezes nervoso e tenso. Fofoqueiros. Pode parecer superficial ou incoerente. Mas só é sujeito a mudança. Bonito fisicamente e mentalmente. 5 anos de azar se você não remeter",
            "O Protetor Mal-humorado. Emocional. Pode ser tímido. Muito amoroso e gentil. Bonito . Sócios excelentes para vida. Projetor. Inventivo e imaginativo. Cauteloso. Tipo de pessoa Sensível. Necessidade de ser amado pelos outros. Magoa-se facilmente, mas simpático",
            "O Chefe. Muito organizado. Precisa de ordem nas vidas deles/delas - como estar em controle. Gosta de limites. Tende a assumir tudo. Mandão. Gosta de ajudar os outros. Social e gosta de sair. Extrovertido. Generoso, amável. Sensível. Energia criativa. Confiantes neles próprios. Bons amantes. Fazer a coisa certa é importante para Leão. Atraente.",
            "O Perfeccionista. Dominante em relações. Conservador. Sempre quer a última palavra. Argumentativo. Preocupado. Muito inteligente. Antipatiza com barulho e caos. Ansioso. Trabalhador. Leal. Bonito. Fácil falar. Difícil de agradar. Severo. Prático e muito exigente. Freqüentemente tímido. Pessimista.",
            "O Harmonizador. Agradável a todo o mundo que se encontra com eles. Indeciso. Tem uma aeração própria sem igual. Criativo, enérgico e muito social. Odeia estar só. Calmo, generoso. Muito amoroso e bonito. Gosta de flertar. Cede muito facilmente. Tende a deixar para depois. Muito crédulo.",
            "O Intenso. Muito enérgico. Inteligente. Pode ser ciumento e/ou possessivo. Trabalhador. Grande beijador. Pode ficar obsessivo ou reservado. Guarda rancor. Atraente. Determinado. Amores que estão em relações longas. Falador. Romântico. Pode ser às vezes egocêntrico. Apaixonado e emocional.",
            "O Otimista Agradável Irrefletido. Não quer crescer (Peter Pan Síndroma). Favorece ego. Orgulhoso. Gosta de luxos e jogar. Social e gosta de sair. Não gosta de responsabilidades. Freqüentemente fantasia. Impaciente. Divertido estar ao seu redor. Tem muitos amigos. Coquete e gosta de flerta. Não gosta de regras. Às vezes hipócrita. Antipatiza com espaços limitados - apertados ou até mesmo roupas apertadas. Não gosta que duvidem dele. Bonito por dentro e por fora.",
            "O Paciente (não no meu caso). Pessoa agressiva e sábio. Prático e rígido. Ambicioso. Tende a estar sempre bonito. Humorístico e engraçado. Pode ser um pouco tímido e reservado. Freqüentemente pessimistas. Capricórnio tendem a agir antes de pensar e podem ser às vezes pouco amigáveis. Guarda rancor. Gosta de competição. Obtém o que eles querem.","O Amado. Otimista e honesto. Doce personalidade. Muito independente. Inventivo e inteligente. Amigável e leal. Pode parecer não emotivo. Pode ser um pouco rebelde. Muito teimoso, mas original e sem igual. Atraente no lado de dentro e fora. Personalidade excêntrica.","O Sonhador Generoso. Bom coração e pensativo. Muito criativo e imaginativo. Pode ficar reservado e vago. Sensível. Não gosta de detalhes. Sonhador e irreal. Simpático e amoroso. Tipo. Desinteressado. Bom beijador. Bonito."};

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
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    int codigoPosicao = position;
                    Toast.makeText(getApplicationContext(),perfis[codigoPosicao],Toast.LENGTH_LONG).show();

                }
            });
    }
}
