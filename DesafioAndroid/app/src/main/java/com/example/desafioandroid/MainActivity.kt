package com.example.desafioandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
  override fun onCreate(savedInstanceState: Bundle?)
  {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    findViewById<Button>(R.id.cmdLogin).setOnClickListener { fnValidaUsuario() }
    findViewById<Button>(R.id.cmdRegistro).setOnClickListener { fnNovoUsuario() }
  }

  private fun fnValidaUsuario()
  {
    if(findViewById<EditText>(R.id.txtEmail).text.toString().length==0 || findViewById<EditText>(R.id.txtSenha).text.toString().length==0)
      Toast.makeText(this, "Não é possível efetuar login: preencha corretamente os campos email e senha para continuar", Toast.LENGTH_LONG).show()
    else
      startActivity(Intent(this, ListaItens::class.java))
  }

  private fun fnNovoUsuario()
  {
    startActivity(Intent(this, NovoUsuario::class.java))
  }
}