package com.example.pooencapsulamento;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView  txtTituloLivro;
    private TextView txtAutor;
    private TextView txtEditora;
    private TextView txtPagina;
    private TextView txtLocalizacao;

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

        iniciarComponentesDoLayout();
        criarObjetos();
    }

    private void iniciarComponentesDoLayout() {
        txtTituloLivro = findViewById(R.id.txtTituloLivro);
        txtAutor = findViewById(R.id.txtAutor);
        txtEditora = findViewById(R.id.txtEditora);
        txtPagina = findViewById(R.id.txtPagina);
        txtLocalizacao = findViewById(R.id.txtLocalizacao);
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

        txtAutor.setText(objLivro.getAutor());
        txtTituloLivro.setText(objLivro.getTitulo());
        txtEditora.setText(objLivro.getEditora());
        txtPagina.setText(String.valueOf(objLivro.getPaginas()));
        txtLocalizacao.setText(objLivro.getLocalizacao());
    }
}