package com.example.pookotlinencapsulamento

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var txtTituloLivro: TextView
    lateinit var txtAutor: TextView
    lateinit var txtEditora: TextView
    lateinit var txtLocalizacao: TextView
    lateinit var txtPagina: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        iniciarComponentesDoLayout()

        criarObjetos()
    }

    private fun iniciarComponentesDoLayout() {
        txtTituloLivro = findViewById(R.id.txtTituloLivro)
        txtAutor = findViewById(R.id.txtAutor)
        txtEditora = findViewById(R.id.txtEditora)
        txtLocalizacao = findViewById(R.id.txtLocalizacao)
        txtPagina = findViewById(R.id.txtPagina)
    }

    private fun criarObjetos() {
        var livro = Livro(
            "Kotlin",
            "Maddo",
            "Mundial POO",
            "L1L1",
            140
        )

        val titulo = livro.titulo
        val autor = livro.autor
        val editora = livro.editora
        val localizacao = livro.localizacao
        val paginas = livro.paginas

        Log.i("POO", "Obj Livro: Autor: "+autor);
        Log.i("POO", "Obj Livro: Título: "+titulo);
        Log.i("POO", "Obj Livro: Editora: "+editora);
        Log.i("POO", "Obj Livro: Páginas: "+paginas);
        Log.i("POO", "Obj Livro: Localização: "+localizacao);

        txtTituloLivro.setText(titulo)
        txtAutor.setText(autor)
        txtEditora.setText(editora)
        txtLocalizacao.setText(localizacao)
        txtPagina.setText(paginas.toString())
    }
}