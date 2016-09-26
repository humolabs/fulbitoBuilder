package humolabs.com.fulbitobuilder;

import android.icu.text.MessagePattern;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public final static String TAG = "MainActivity.class";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Firebase.setAndroidContext(this);
        setContentView(R.layout.activity_main);

        // Get a database reference to our posts
        // Get a reference to our posts
        Firebase ref = new Firebase("https://fulbitobuilder.firebaseio.com");
        // Attach an listener to read the data at our posts reference
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                System.out.println(snapshot.getValue());
                Log.e(TAG,""+snapshot.getChildrenCount());

                List<String> playersUsers = new ArrayList<String>();
                List<Jugador> jugadores = new ArrayList<Jugador>();


                for (DataSnapshot partidoSnapshot: snapshot.getChildren()) {

                    Partido partido = partidoSnapshot.getValue(Partido.class);

                    EditText textNomCancha = (EditText) findViewById(R.id.txtfNombreCancha);
                    textNomCancha.setText(partido.getCancha().getNombre());

                    EditText textHrPartido = (EditText) findViewById(R.id.txtfHorarioPartido);
                    textHrPartido.setText(partido.getHorario());

                    final int size = partido.getJugadores().size();
                    for (int i = 1; i < size; i++)
                    {
                        Jugador jugador = partido.getJugadores().get(i);
                        playersUsers.add(jugador.getUsuario());
                    }
                }

                ListView listViewJugadores = (ListView) findViewById(R.id.listaJugadores);
                ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, playersUsers);
                listViewJugadores.setAdapter(arrayAdapter);
            }
            @Override
            public void onCancelled(FirebaseError firebaseError) {
                System.out.println("The read failed: " + firebaseError.getMessage());
            }
        });
    }
}
