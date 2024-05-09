package kr.ac.kopo.viewflippertest0425

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ViewFlipper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var btnNext : Button
    lateinit var btnPrev : Button
    lateinit var vFlip : ViewFlipper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNext = findViewById<Button>(R.id.btnNext)
        btnPrev = findViewById<Button>(R.id.btnPrev)
        vFlip = findViewById<ViewFlipper>(R.id.flipper)

        btnNext.setOnClickListener(btnListener)
        btnPrev.setOnClickListener(btnListener)

    }

    val btnListener = View.OnClickListener {
        when(it.id){
            R.id.btnNext -> vFlip.showNext()
            R.id.btnPrev -> vFlip.showPrevious()
        }
    }
}