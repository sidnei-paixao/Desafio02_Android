package com.example.desafioandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Pratos(val nImagem:Int, val oPratos:List<String>):RecyclerView.Adapter<Pratos.ListaPratos>()
{
    class ListaPratos(var oContexto: View): RecyclerView.ViewHolder(oContexto)
    {
        private val oImagem by lazy { oContexto.findViewById(R.id.imgFoto) as ImageView }
        private val oNome by lazy { oContexto.findViewById(R.id.txtNome) as TextView }

        fun fnCarregar(nImagem: Int, oItem: String)
        {
            oImagem.setImageResource(nImagem ?: 0)
            oNome.text = oItem
            oNome.gravity = 2
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaPratos
    {
        return ListaPratos(LayoutInflater.from(parent.context).inflate(R.layout.cartao_lista, parent, false))
    }

    override fun getItemCount() = oPratos.size

    override fun onBindViewHolder(holder: ListaPratos, position: Int)
    {
        holder.fnCarregar(nImagem, oPratos[position])
    }
}