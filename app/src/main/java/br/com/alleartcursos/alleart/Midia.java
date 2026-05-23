package br.com.alleartcursos.alleart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Midia extends AppCompatActivity {

    Intent tela;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midia);
    }

    public void clickVoltar (View view){
        finish();
    }
}
