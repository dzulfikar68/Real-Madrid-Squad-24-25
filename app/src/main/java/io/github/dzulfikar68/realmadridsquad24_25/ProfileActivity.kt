package io.github.dzulfikar68.realmadridsquad24_25

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.button.MaterialButton

class ProfileActivity: GeneralActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_page)
        val toolBar = findViewById<MaterialToolbar>(R.id.tool_bar)
        setSupportActionBar(toolBar)
        toolBar.setNavigationOnClickListener {
            finish()
        }
        findViewById<MaterialButton>(R.id.btn_profile)?.setOnClickListener {
            val url = "https://www.dzulfikar68.github.io/"
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(url)
            }
            startActivity(intent)
        }
    }

}
