package dev.mundu.twitterpost

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TwitterRvAdapter (var twitterList: List<Tweeter>):
RecyclerView.Adapter<tweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tweetViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.twitter_list_item, parent, false)
        return  tweetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: tweetViewHolder, position: Int) {
        var currenttweet =twitterList.get(position)
        holder.tvName.text = currenttweet.name
        holder.tvHashtag.text = currenttweet.hashtag
        holder.tvTweet.text = currenttweet.tweet
        holder.tvOne.text = currenttweet.text
        holder.tvTwo.text = currenttweet.text1
        holder.tvThree.text = currenttweet.text2

    }

    override fun getItemCount(): Int {
        return twitterList.size
    }
}

class  tweetViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvTweet = itemView.findViewById<TextView>(R.id.tvTweet)
    var tvHashtag = itemView.findViewById<TextView>(R.id.tvHashtag)
    var mvIo = itemView.findViewById<ImageView>(R.id.mvIo)
    var mvIf = itemView.findViewById<ImageView>(R.id.mvIf)
    var mvIt = itemView.findViewById<ImageView>(R.id.mvIt)
    var ivUser = itemView.findViewById<ImageView>(R.id.ivUser)
    var mvOne = itemView.findViewById<ImageView>(R.id.mvOne)
    var tvOne = itemView.findViewById<TextView>(R.id.tvOne)
    var mvTwo = itemView.findViewById<ImageView>(R.id.mvTwo)
    var tvTwo = itemView.findViewById<TextView>(R.id.tvTwo)
    var mvThree = itemView.findViewById<ImageView>(R.id.mvThree)
    var tvThree = itemView.findViewById<TextView>(R.id.tvThree)
    var mvFour = itemView.findViewById<ImageView>(R.id.mvFour)

}

