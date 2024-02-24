package com.inc.eva.cbg.view.movies.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.inc.eva.cbg.databinding.ListItemMovieBinding
import com.inc.eva.cbg.network.entity.movies.Docs
import com.inc.eva.cbg.view.movies.adapter.MovieAdapter.MovieViewHolder

class MovieAdapter : RecyclerView.Adapter<MovieViewHolder>() {
    private var items: List<Docs> = listOf()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ) = MovieViewHolder(
        ListItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false),
    )

    override fun getItemCount() = items.size

    override fun onBindViewHolder(
        holder: MovieViewHolder,
        position: Int,
    ) {
        holder.bind(items[position])
    }

    fun setItems(items: List<Docs>) {
        this.items = items
        notifyDataSetChanged()
    }

    inner class MovieViewHolder(private val binding: ListItemMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Docs) {
            binding.tvMovie.text = item.name
        }
    }
}
