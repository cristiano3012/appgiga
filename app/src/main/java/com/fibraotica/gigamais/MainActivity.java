package com.fibraotica.gigamais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto(View view){
        TextView sem = findViewById(R.id.sem_conexao);
        sem.setText("Procedimentos para teste de conexão\n");

    }
}
