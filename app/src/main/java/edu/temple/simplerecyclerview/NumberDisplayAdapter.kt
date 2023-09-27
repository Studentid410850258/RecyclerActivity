package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter:RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>()/* Step 3a: Provide Adapter Parent */ {

    class NumberViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView) {}

    //Step 3b: Complete function definitions for adapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(TextView(
            parent.context
        ).apply { layoutParams = ViewGroup.LayoutParams(300, 300) })
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.text = position.toString()
    }

    override fun getItemCount(): Int {
        return 100
    }

}