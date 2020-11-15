package com.example.desafioandroid

class InfoRestaurante()
{
    var nImagem: Int? = null
    var cNome: String? = null
    var cEndereco: String? = null
    var cHorario: String? = null

    constructor(nImagem: Int?, cNome: String, cEndereco: String): this()
    {
        this.nImagem = nImagem
        this.cNome = cNome
        this.cEndereco = if(cEndereco.trim().length>50) cEndereco.substring(0, 45) + "..." else cEndereco
        this.cHorario = "Aberto até as 22:00"
    }
}