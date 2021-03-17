package com.example.eva1_6_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
    // OnClickListener
implements View.OnClickListener {

    Button btnListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnListener = findViewById(R.id.btnListener);
        btnListener.setOnClickListener(this);
    }
    //Usando la propiedad android:onclick del Widget
    //  public void NOMBREDELMETODO(view arg){}

    public void clickBtn (View arg){
    //MOSTRAR MENSAJE (TOAST)
        Toast.makeText( this,  "Evento por OnClick XML", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        Toast.makeText( this,  "EVENTO POR LISTENER", Toast.LENGTH_LONG).show();
    }


}

