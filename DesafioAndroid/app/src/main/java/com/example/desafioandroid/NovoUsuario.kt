package com.example.desafioandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class NovoUsuario : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo_usuario)

        findViewById<Button>(R.id.cmdCriar).setOnClickListener { fnExibeTela() }
    }

    fun fnExibeTela()
    {
        if(findViewById<EditText>(R.id.txtNome).text.toString().length==0 || findViewById<EditText>(R.id.txtEmail).text.toString().length==0 || findViewById<EditText>(R.id.txtSenha).text.toString().length==0 || findViewById<EditText>(R.id.txtRepete).text.toString().length==0)
            Toast.makeText(this, "Não é possível criar este usuário: preencha todos os campos na tela para continuar", Toast.LENGTH_LONG).show()
        else
        {
            if(findViewById<EditText>(R.id.txtSenha).text.toString() != findViewById<EditText>(R.id.txtRepete).text.toString())
                Toast.makeText(this, "Não é possível criar este usuário: a senha e confirmação de senha não conferem", Toast.LENGTH_LONG).show()
            else
            {
                startActivity(Intent(this, ListaItens::class.java))
                finish()
            }
        }
    }
}