package dev.mundu.twitterpost

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.mundu.twitterpost.databinding.ActivityMainBinding
import dev.mundu.twitterpost.databinding.TwitterListItemBinding

class TwitterRvAdapter (var twitterList: List<Tweeter>):
RecyclerView.Adapter<tweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tweetViewHolder {
            var binding =
                TwitterListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            var tweetsViewHolder = tweetViewHolder(binding)
            return  tweetsViewHolder
    }

    override fun onBindViewHolder(holder: tweetViewHolder, position: Int) {
        var currenttweet =twitterList.get(position)
        holder.binding.tvName.text = currenttweet.name
        holder.binding.tvHashtag.text = currenttweet.hashtag
        holder.binding.tvTweet.text = currenttweet.tweet
        holder.binding.tvOne.text = currenttweet.text
        holder.binding.tvTwo.text = currenttweet.text1
        holder.binding.tvThree.text = currenttweet.text2

    }

    override fun getItemCount(): Int {
        return twitterList.size
    }
}

class  tweetViewHolder(var binding: TwitterListItemBinding):
    RecyclerView.ViewHolder(binding.root){

}

