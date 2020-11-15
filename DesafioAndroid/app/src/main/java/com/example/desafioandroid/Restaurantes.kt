package com.example.desafioandroid

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView
import android.content.Intent

class Restaurantes(val oRestaurante:List<InfoRestaurante>):RecyclerView.Adapter<Restaurantes.ListaRestaurantes>()
{
    class ListaRestaurantes(var oContexto: View): RecyclerView.ViewHolder(oContexto)
    {
        private val oCartao by lazy { oContexto.findViewById(R.id.objRestaurante) as MaterialCardView}
        private val oImagem by lazy { oContexto.findViewById(R.id.imgFoto) as ImageView }
        private val oNome by lazy { oContexto.findViewById(R.id.txtNome) as TextView }
        private val oEndereco by lazy { oContexto.findViewById(R.id.txtEndereco) as TextView }
        private val oHorario by lazy { oContexto.findViewById(R.id.txtHorario) as TextView }

        fun fnCarregar(oItem: InfoRestaurante)
        {
            oCartao.setOnClickListener{fnAbreDetalhes(oItem.nImagem, oItem.cNome)}
            oImagem.setImageResource(oItem.nImagem ?: 0)
            oNome.text = oItem.cNome
            oEndereco.text = oItem.cEndereco
            oHorario.text = oItem.cHorario
        }
        fun fnAbreDetalhes(nCodigo: Int?, cNome: String?)
        {
            startActivity(oContexto.context, Intent(oContexto.context, TelaDetalhe::class.java).putExtra("SelImg", nCodigo).putExtra("SelNome", cNome),null)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListaRestaurantes
    {
        return ListaRestaurantes(LayoutInflater.from(parent.context).inflate(R.layout.cartao_lista, parent, false))
    }

    override fun getItemCount() = oRestaurante.size

    override fun onBindViewHolder(holder: ListaRestaurantes, position: Int)
    {
        holder.fnCarregar(oRestaurante[position])
    }
}