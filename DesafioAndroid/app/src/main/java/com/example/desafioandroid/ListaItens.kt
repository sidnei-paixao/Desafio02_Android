package com.example.desafioandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListaItens : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_itens)

        findViewById<RecyclerView>(R.id.lstRestaurantes).apply{
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@ListaItens)
            adapter = Restaurantes(arrayListOf(
                InfoRestaurante(R.drawable.rest01, "Restaurante do Zé", "Endereço do local"),
                InfoRestaurante(R.drawable.rest02, "Restaurante do Zé", "Endereço do local"),
                InfoRestaurante(R.drawable.rest03, "Restaurante do Zé", "Endereço do local"),
                InfoRestaurante(R.drawable.rest04, "Restaurante do Zé", "Endereço do local"),
                InfoRestaurante(R.drawable.rest05, "Restaurante do Zé", "Endereço do local")
            ))
        }
    }
}