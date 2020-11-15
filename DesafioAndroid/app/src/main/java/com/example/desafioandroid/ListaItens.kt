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
                InfoRestaurante(R.drawable.rest01, "Restaurante do Zé", "Rua Augusta, 69"),
                InfoRestaurante(R.drawable.rest02, "MérDônis", "Em todos os shoppings da cidade"),
                InfoRestaurante(R.drawable.rest03, "Rotisseria Pinto Feliz", "Avenida Braz Leme, 500"),
                InfoRestaurante(R.drawable.rest04, "Restaurante ChingLing", "Avenida Liberdade, 333"),
                InfoRestaurante(R.drawable.rest05, "Pizzaria Carcamano", "Avenida Lins de Vasconcelos, 13")
            ))
        }
    }
}