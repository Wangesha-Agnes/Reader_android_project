package com.agneswangesha.cc.blog_reader

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.agneswangesha.cc.blog_reader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvReader.layoutManager = LinearLayoutManager(this)
        displayReader()
    }

    fun displayReader(){
        val reader1 = Reader("Plato","","My home","11th May 2011","This novel explores the lives of Palestinian Americans in Baltimore through",
                " linked stories, focusing on themes of cultural identity, hope, and disappointment " ,"https://dribbble.com/shots/23220196-Modern-Ecommerce-Website-UI-Design")
        val reader2 = Reader("Plato","","My home","11th May 2011","This novel explores the lives of Palestinian Americans in Baltimore through",
                " linked stories, focusing on themes of cultural identity, hope, and disappointment " ,"https://dribbble.com/shots/23220196-Modern-Ecommerce-Website-UI-Design")
        val reader3 = Reader("Plato","","My home","11th May 2011","This novel explores the lives of Palestinian Americans in Baltimore through",
                " linked stories, focusing on themes of cultural identity, hope, and disappointment " ,"https://dribbble.com/shots/23220196-Modern-Ecommerce-Website-UI-Design")


        val readers= listOf(reader1,reader2,reader3)
        val readerAdapter=ReaderAdapter(readers)
        binding.rvReader.adapter=readerAdapter
    }
}