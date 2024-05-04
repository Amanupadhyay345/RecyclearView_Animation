package com.app.recyclearviewanimation

import android.content.Context
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.view.animation.LayoutAnimationController
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.app.recyclearviewanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.mainRecyclearview.adapter = MainAdapter()

        binding.Animation.setOnClickListener {
            loadAnimation(binding.mainRecyclearview)
        }

    }

    fun loadAnimation(recyclearview: RecyclerView) {
        var context: Context = recyclearview.context

        var animation: LayoutAnimationController =
            AnimationUtils.loadLayoutAnimation(context, R.anim.layout_fall_down)
        recyclearview.layoutAnimation = animation
        recyclearview.adapter!!.notifyDataSetChanged()
        recyclearview.scheduleLayoutAnimation()
    }
}