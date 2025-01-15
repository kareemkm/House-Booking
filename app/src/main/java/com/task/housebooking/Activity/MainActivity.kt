package com.task.housebooking.Activity

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.task.housebooking.Adapter.ItemsAdapter
import com.task.housebooking.Model.ItemsDomanData
import com.task.housebooking.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val itemsDomanData: ItemsDomanData = ItemsDomanData()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initList(itemsDomanData)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
    }

    private fun initList(itemsDomanData: ItemsDomanData) {

        val items = itemsDomanData.items

        binding.recomentedView.layoutManager =
            LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        binding.recomentedView.adapter = ItemsAdapter(items)

        binding.navigationBar.setItemSelected(0,true)

    }

}