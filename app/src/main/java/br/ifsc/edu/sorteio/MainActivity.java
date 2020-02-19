package br.ifsc.edu.sorteio;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView tv;
        EditText editText;
        Button button;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycleActivity","OnCreate");
        tv = findViewById(R.id.textViewResultado);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText(editText.getText().toString());
            }
        });
    }

    public void mudarTexto(View view){
        TextView v = findViewById(R.id.test);
        v.setText("Finishing");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Resume", "OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onRestart", "onRestart");

    }


}
