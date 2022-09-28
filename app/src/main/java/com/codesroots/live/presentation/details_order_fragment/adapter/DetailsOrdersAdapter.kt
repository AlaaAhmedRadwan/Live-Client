package com.codesroots.live.presentation.details_order_fragment.adapter
import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.codesroots.live.R
import com.codesroots.live.databinding.DetailsOrderAdapterBinding
import com.codesroots.live.helper.ClickHandler
import com.codesroots.live.models.current_orders.OrderDetail
import com.codesroots.live.presentation.map_activity.MapActivity


class DetailsOrderAdapter ( var context:Context)
    : ListAdapter<OrderDetail, MenuViewHolder>(MenuDiffCallback()) {


    override  fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(context, currentList[position])

    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MenuViewHolder {
        val binding: DetailsOrderAdapterBinding = DataBindingUtil.inflate(
            LayoutInflater.from(p0.context),
            R.layout.details_order_adapter, p0, false
        )


        return MenuViewHolder(binding)
    }
}

private  class MenuDiffCallback : DiffUtil.ItemCallback<OrderDetail>() {

    override fun areItemsTheSame(oldItem: OrderDetail, newItem: OrderDetail) =
        oldItem.id == newItem.id

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: OrderDetail, newItem: OrderDetail) =
        oldItem == newItem
}

class MenuViewHolder(
    val binding: DetailsOrderAdapterBinding
) : RecyclerView.ViewHolder(binding.root) {


    fun bind(context: Context?, data: OrderDetail) {

        binding.listener = ClickHandler()
        binding.data = data
        binding.context = context as MapActivity?
    }


}
