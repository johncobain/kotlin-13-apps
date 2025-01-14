package com.example.pooheranca;

import android.os.Bundle;

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

        Funcionario joao = new Funcionario();
        Funcionario pedro = new Funcionario();
        Gerente gerentePedro = new Gerente();

        gerentePedro.setNome("pedro");
        gerentePedro.setDataAdmissao("01/02/2024");
        gerentePedro.setSalario(2000.50);
        gerentePedro.setComissao(15);
        gerentePedro.setTotalFuncionarios(10);
        gerentePedro.setDataNascimento("01/02/1999");
    }
}