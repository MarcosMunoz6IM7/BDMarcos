package marcosmunoz.edu.mx.ipn.bdmarcos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class dos extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);

        tv = (TextView) findViewById(R.id.textView);

        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        tv.setText("Nombre: " + recibe.getString("n") + "\nPersnoas: " + recibe.getString("p") );

    }
}
