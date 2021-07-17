package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.firstapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.personsRV.layoutManager = LinearLayoutManager(this)
        binding.personsRV.adapter = RecyclerViewAdapter(this, getData())
    }

    private fun getData():List<Affirmation>{
        return listOf(
            Affirmation(R.string.affirmation1,R.drawable.image1),
            Affirmation(R.string.affirmation2,R.drawable.image2),
            Affirmation(R.string.affirmation3,R.drawable.image3),
            Affirmation(R.string.affirmation4,R.drawable.image4),
            Affirmation(R.string.affirmation5,R.drawable.image5),
            Affirmation(R.string.affirmation6,R.drawable.image6),
            Affirmation(R.string.affirmation7,R.drawable.image7),
            Affirmation(R.string.affirmation8,R.drawable.image8),
            Affirmation(R.string.affirmation9,R.drawable.image9),
            Affirmation(R.string.affirmation10,R.drawable.image10)
        )
    }
}

