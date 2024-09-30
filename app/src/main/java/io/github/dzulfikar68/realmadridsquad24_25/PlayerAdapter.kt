package io.github.dzulfikar68.realmadridsquad24_25

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PlayerAdapter(private val data: List<Player>) : RecyclerView.Adapter<PlayerAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameText: TextView = view.findViewById(R.id.tv_player)
        val positionText: TextView = view.findViewById(R.id.tv_position_number)
        val photoView: ImageView = view.findViewById(R.id.iv_photo)
        val cardView: CardView = view.findViewById(R.id.cv_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_view, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameText.text = data[position].name
        holder.positionText.text = "${data[position].role} (${data[position].number})"
        Glide.with(holder.itemView.context)
            .load(data[position].imageUrl)
            .placeholder(R.drawable.ic_placeholder)
            .error(R.drawable.ic_placeholder)
            .into(holder.photoView)
        holder.cardView.setOnClickListener {
            val intentDetail = Intent(holder.itemView.context, DetailActivity::class.java)
            intentDetail.putExtra(KEY_PLAYER, data[holder.adapterPosition])
            holder.itemView.context.startActivity(intentDetail)
        }
    }

    override fun getItemCount(): Int = data.size
}
