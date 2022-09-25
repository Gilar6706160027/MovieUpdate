package com.example.movieupdate.ui.main.views.movie_detail.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.movieupdate.R
import com.example.movieupdate.model.Review

class ReviewAdapter(
    private val reviewList: List<Review>,
) : RecyclerView.Adapter<ReviewAdapter.CastViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ReviewAdapter.CastViewHolder {
        val inflate = LayoutInflater.from(parent.context).inflate(R.layout.review_items, null)
        return CastViewHolder(inflate)
    }

    override fun getItemCount(): Int {
        return reviewList.size
    }

    override fun onBindViewHolder(viewHolder: CastViewHolder, position: Int) {
        val review: Review = reviewList[position]

        viewHolder.tvCreatedDate.apply {
            text = review.created_at
        }
        viewHolder.tvContentReview.apply {
            text = review.content
        }

        Glide.with(viewHolder.profileAuthor.context).load(viewHolder.profileAuthor.context.getString(R.string.w220h330))
            .apply(RequestOptions().centerCrop())
            .into(viewHolder.profileAuthor)
    }


    inner class CastViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val profileAuthor: ImageView = itemView.findViewById(R.id.profileAuthor)
        val tvContentReview: TextView = itemView.findViewById(R.id.contentReview)
        val tvCreatedDate: TextView = itemView.findViewById(R.id.dateReview)
    }
}
