package br.com.etecia.appsloginfolha;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FolhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.folha_layout);
    }

    public void Entrar(View view){
        Intent entrar = new Intent(FolhaActivity.this, FormularioAPPLoginActivity.class);
        startActivity(entrar);

    }
}
