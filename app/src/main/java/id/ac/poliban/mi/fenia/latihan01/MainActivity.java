package id.ac.poliban.mi.fenia.latihan01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNama =findViewById(R.id.etNama);
        EditText etNIM =findViewById(R.id.etNIM);
        EditText etProdi =findViewById(R.id.etProdi);
        EditText etAlamat =findViewById(R.id.etAlamat);
        Button btClear = findViewById(R.id.btClear);
        Button btSubmit = findViewById(R.id.btSubmit);

        btClear.setOnClickListener(v ->{
            //mengkosongkan EditText
            etNama.setText("");
            etNIM.setText("");
            etProdi.setText("");
            etAlamat.setText("");
        });

        btSubmit.setOnClickListener(v ->{
            etNama.setText("");
            etNIM.setText("");
            etProdi.setText("");
            etAlamat.setText("");
            etNama.clearFocus();
            Toast.makeText(this, "anda sudah masuk", Toast.LENGTH_SHORT).show();
        });

    }
}
