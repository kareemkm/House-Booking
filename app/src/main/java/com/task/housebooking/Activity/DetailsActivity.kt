package com.task.housebooking.Activity

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.task.housebooking.Model.ItemsDomain
import com.task.housebooking.R
import com.task.housebooking.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding
    private lateinit var items: ItemsDomain

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        getBundles()
        setVariable()
    }

    private fun setVariable(){
        binding.backBtn.setOnClickListener {finish()}
        val drawableRecouceId = resources.getIdentifier(items.pickPath,"drawable",packageName)
        Glide.with(this@DetailsActivity)
            .load(drawableRecouceId)
            .into(binding.picDetails)

        binding.titleTxt.text = "${items.title} in ${items.address}"
        binding.typeTxt.text = items.type
        binding.descriptionTxt.text = items.description
        binding.priceTxt.text = "$ ${items.price}"
        binding.scoreTxt.text = items.score.toString()
        binding.betTxt.text = items.bed.toString()
        binding.bathrooTxt.text = items.bath.toString()
        binding.SizeTxt.text = "${items.size} m2"
        binding.garageTxt.text = items.isGarage.toString()
    }

    private fun getBundles() {
        items = intent.getSerializableExtra("object") as ItemsDomain
    }
}