package com.example.desafioandroid

class InfoRestaurante()
{
    var nImagem: Int? = null
    var cNome: String? = null
    var cEndereco: String? = null

    constructor(nImagem: Int?, cNome: String, cEndereco: String): this()
    {
        this.nImagem = nImagem
        this.cNome = cNome
        this.cEndereco = if(cEndereco.trim().length>30) cEndereco.substring(0, 25) + "..." else cEndereco
    }
}