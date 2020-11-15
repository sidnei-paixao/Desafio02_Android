package com.example.desafioandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class TelaDetalhe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_detalhe)

        var vPratos = arrayListOf<String>()
        val nImagem = intent.getIntExtra("SelImg", 0)

        findViewById<ImageView>(R.id.imgFoto).setImageResource(nImagem)
        findViewById<TextView>(R.id.txtNome).setText(intent.getStringExtra("SelNome"))



        for (nCont in 1..10)
            if(intent.getStringExtra("SelNome")=="MérDônis")
                vPratos.add("MerdLanche Infeliz")
            else
                vPratos.add("Prato 0" + nCont.toString())

        findViewById<RecyclerView>(R.id.lstPratos).apply{
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(this@TelaDetalhe,2)
            adapter = Pratos(nImagem, vPratos)
        }

    }
}