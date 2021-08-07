package com.example.motionlayoutexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.motionlayoutexample.databinding.ItemFoodBinding
import com.example.motionlayoutexample.model.Food

/**
 * @author mvn-vinhnguyen on 8/6/21.
 */
class FoodAdapter(private val foodList: MutableList<Food>) :
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val layoutInflater =
            LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(
            layoutInflater
        )
    }

    override fun getItemCount() = foodList.size

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private fun getItem(position: Int): Food {
        return foodList[position]
    }

    inner class FoodViewHolder(private val root: View) : RecyclerView.ViewHolder(root) {

        private var binding: ItemFoodBinding = ItemFoodBinding.bind(root)

        fun bind(food: Food) {
            binding.run {
                tvTitle.text = food.title
                tvDescription.text = food.description
                tvRate.text = food.rate
                tvCalories.text = food.calories
                ivFood.setImageResource(food.imgId)
            }
        }
    }
}
