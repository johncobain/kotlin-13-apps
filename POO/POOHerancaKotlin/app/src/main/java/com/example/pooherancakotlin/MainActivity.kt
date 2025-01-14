package com.example.pooherancakotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        lateinit var joao: Funcionario

        joao.setNome("João")
        joao.setSalario(1200)
        joao.setDataAdmissao("01/01/2024")

        lateinit var gerentePedro: Gerente

        gerentePedro.setNome("Pedro")
        gerentePedro.setDataAdmissao("01/01/2022")
        gerentePedro.setSalario(2400)
        gerentePedro.setComissao(10.5)
        gerentePedro.setTotalFuncionarios(25)


    }
}