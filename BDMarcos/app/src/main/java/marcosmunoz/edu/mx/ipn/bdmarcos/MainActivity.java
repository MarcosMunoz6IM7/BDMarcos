package marcosmunoz.edu.mx.ipn.bdmarcos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private EditText txtName;
    private SeekBar sb;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        creaVariables();

    }

    private void creaVariables() {
        txtName = (EditText) findViewById(R.id.txtNombre);
        sb = (SeekBar) findViewById(R.id.seekBar);
        tv = (TextView) findViewById(R.id.nBar);

        sb.setOnSeekBarChangeListener(this);

        tv.setText( "personas: "+sb.getProgress());
    }

    public void Save(View v){
        Intent envia = new Intent(this, dos.class);

        Bundle b = new Bundle();
        b.putString("n", txtName.getText().toString().trim());
        b.putString("p", Integer.toString(sb.getProgress()));
        envia.putExtras(b);

        finish();
        startActivity(envia);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        tv.setText("personas: "+sb.getProgress());
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
