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
    lateinit var btnStart : Button
    lateinit var btnStop : Button
    lateinit var vFlip : ViewFlipper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnStart = findViewById<Button>(R.id.btnStart)
        btnStop = findViewById<Button>(R.id.btnStop)
        vFlip = findViewById<ViewFlipper>(R.id.flipper)

        btnStart.setOnClickListener(btnListener)
        btnStop.setOnClickListener(btnListener)

        vFlip.setFlipInterval(2000)

    }

    val btnListener = View.OnClickListener {
        when(it.id){
            R.id.btnStart -> vFlip.startFlipping()
            R.id.btnStop -> vFlip.stopFlipping()
        }
    }
}