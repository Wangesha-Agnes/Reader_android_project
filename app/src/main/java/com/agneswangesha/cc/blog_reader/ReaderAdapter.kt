package com.agneswangesha.cc.blog_reader

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReaderAdapter (val reader:List<Reader>): RecyclerView.Adapter<ReaderViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReaderViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.reader_list_item,parent,false)
        return ReaderViewHolder(itemView)
    }


    override fun getItemCount(): Int {
        return reader.size
    }


    override fun onBindViewHolder(holder: ReaderViewHolder, position: Int) {
        val article= reader[position]
        holder.tvName.text=article.author
        holder.tvPublish.text=article.published
        holder.tvTitle.text=article.title
        holder.tvPreview.text=article.preview
        holder.tvLink.text=article.link

    }
}

class  ReaderViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    val tvName=itemView.findViewById<TextView>(R.id.tvName)
    val tvPublish=itemView.findViewById<TextView>(R.id.tvPublished)
    val tvTitle=itemView.findViewById<TextView>(R.id.tvTitle)
    val tvPreview=itemView.findViewById<TextView>(R.id.tvPreview)
    val tvLink=itemView.findViewById<TextView>(R.id.tvLink)
}