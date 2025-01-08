package com.example.pooencapsulamento;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        criarObjetos();
    }

    public void criarObjetos(){
        Livro objLivro = new Livro();

        objLivro.setAutor("Marco Maddo");
        objLivro.setTitulo("POO Encapsulamento Seguro");
        objLivro.setEditora("Mundial POO");
        objLivro.setPaginas(140);
        objLivro.setLocalizacao("L1L1");

        Log.i("POO", "Obj Livro: Autor: "+objLivro.getAutor());
        Log.i("POO", "Obj Livro: Título: "+objLivro.getTitulo());
        Log.i("POO", "Obj Livro: Editora: "+objLivro.getEditora());
        Log.i("POO", "Obj Livro: Páginas: "+objLivro.getPaginas());
        Log.i("POO", "Obj Livro: Localização: "+objLivro.getLocalizacao());
    }
}