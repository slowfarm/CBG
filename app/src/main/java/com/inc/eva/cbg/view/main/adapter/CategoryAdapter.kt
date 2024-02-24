package com.inc.eva.cbg.view.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.inc.eva.cbg.databinding.ListItemCategoryBinding
import com.inc.eva.cbg.network.entity.Category
import com.inc.eva.cbg.view.main.adapter.CategoryAdapter.CategoryViewHolder

class CategoryAdapter : RecyclerView.Adapter<CategoryViewHolder>() {

    var items: MutableList<Category> = mutableListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CategoryViewHolder(
        ListItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun getCheckedCategories() = items.filter { it.checked }.map { it.name }.toTypedArray()

    inner class CategoryViewHolder(private val binding: ListItemCategoryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Category) {
            binding.tvCategory.text = item.name
            binding.cbSelect.setOnCheckedChangeListener(null)
            binding.cbSelect.isChecked = item.checked
            binding.cbSelect.setOnCheckedChangeListener { _, checked ->
                items[adapterPosition] = item.copy(checked = checked)
            }
        }
    }
}


