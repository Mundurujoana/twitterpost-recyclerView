package dev.mundu.twitterpost

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.mundu.twitterpost.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        displayTweets()

    }
    fun displayTweets() {
        var tweet = Tweeter("", "joana@Mundurujoana . 6h", "100k to whoever gets this!  Who started calling me joana first ??",
            "#loveAndLight", "", "", "","","123","","456","","987","")
        var tweet2 = Tweeter("", "joana@Mundurujoana . 6h", "100k to whoever gets this!  Who started calling me joana first ??",
            "#loveAndLight", "", "", "","","123","","456","","987","")
        var tweet3 = Tweeter("", "joana@Mundurujoana . 6h", "100k to whoever gets this!  Who started calling me joana first ??",
            "#loveAndLight", "", "", "","","123","","456","","987","")
        var tweet4 = Tweeter("", "joana@Mundurujoana . 6h", "100k to whoever gets this!  Who started calling me joana first ??",
            "#loveAndLight", "", "", "","","123","","456","","987","")
        var tweet5 = Tweeter("", "joana@Mundurujoana . 6h", "100k to whoever gets this!  Who started calling me joana first ??",
            "#loveAndLight", "", "", "","","123","","456","","987","")
        var tweet6 = Tweeter("", "joana@Mundurujoana . 6h", "100k to whoever gets this!  Who started calling me joana first ??",
            "#loveAndLight", "", "", "","","123","","456","","987","")
        var tweet7 = Tweeter("", "joana@Mundurujoana . 6h", "100k to whoever gets this!  Who started calling me joana first ??",
            "#loveAndLight", "", "", "","","123","","456","","987","")

        var twitterList = listOf(tweet,tweet2,tweet3,tweet4,tweet5,tweet6,tweet7)

        var contactsAdapter = TwitterRvAdapter(twitterList)
        binding.rvTwitter.layoutManager = LinearLayoutManager(this)
        binding.rvTwitter.adapter = contactsAdapter
    }
}
