package ro.pub.cs.systems.eim.practicaltest01var07

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PracticalTest01Var07SecondaryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practical_test01_var07_secondary)

        val tvTopLeft = findViewById<TextView>(R.id.text_top_left)
        val tvTopRight = findViewById<TextView>(R.id.text_top_right)
        val tvBottomLeft = findViewById<TextView>(R.id.text_bottom_left)
        val tvBottomRight = findViewById<TextView>(R.id.text_bottom_right)

        // Extragem valorile trimise prin extra in intentie[cite: 1]
        val intentFromMain = intent
        if (intentFromMain != null) {
            tvTopLeft.text = intentFromMain.getStringExtra("TOP_LEFT") ?: ""
            tvTopRight.text = intentFromMain.getStringExtra("TOP_RIGHT") ?: ""
            tvBottomLeft.text = intentFromMain.getStringExtra("BOTTOM_LEFT") ?: ""
            tvBottomRight.text = intentFromMain.getStringExtra("BOTTOM_RIGHT") ?: ""
        }
    }
}