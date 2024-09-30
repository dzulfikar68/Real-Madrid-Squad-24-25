package io.github.dzulfikar68.realmadridsquad24_25

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.HtmlCompat
import com.bumptech.glide.Glide
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.button.MaterialButton
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

const val KEY_PLAYER = "key_player"

class DetailActivity: GeneralActivity() {

    private fun getPlayer() = intent.getParcelableExtra<Player>(KEY_PLAYER)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_page)
        setDataPlayer()
        setListener()
    }

    private fun setListener() {
        val player = getPlayer()

        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener {
            shareText(player)
        }

        val url = player?.website ?: return
        val btn: MaterialButton = findViewById(R.id.btn_website)
        btn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse(url)
            }
            startActivity(intent)
        }
    }

    private fun shareText(player: Player?) {
        if (player == null) return
        val text = "Please check this Real Madrid player (${player.name} - ${player.number}) info at : ${player.website}"
        val shareIntent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, text)
        }
        startActivity(Intent.createChooser(shareIntent, "Player Info : ${player.name} (${player.number}}"))
    }

    private fun getAge(): Int {
        return try {
            val formatter = SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH)
            val birthDate = formatter.parse("Jul 21, 2024")
            val currentDate = Calendar.getInstance().time
            val birthCalendar = Calendar.getInstance()
            if (birthDate != null) {
                birthCalendar.time = birthDate
            }
            val currentCalendar = Calendar.getInstance()
            currentCalendar.time = currentDate
            var age = currentCalendar.get(Calendar.YEAR) - birthCalendar.get(Calendar.YEAR)
            if (currentCalendar.get(Calendar.DAY_OF_YEAR) < birthCalendar.get(Calendar.DAY_OF_YEAR)) {
                age--
            }
            age
        } catch (e: Exception) {
            0
        }
    }

    @SuppressLint("SetTextI18n")
    private fun setDataPlayer() {
        val toolBar = findViewById<MaterialToolbar>(R.id.tool_bar)

        val player = getPlayer()
        if (player != null) {
            toolBar.setTitle("${player.name} (${player.number})")

            val imageView = findViewById<ImageView>(R.id.iv_photo)
            Glide.with(this)
                .load(player.imageUrl)
                .placeholder(R.drawable.ic_placeholder)
                .error(R.drawable.ic_placeholder)
                .into(imageView)

            val age = getAge()
            findViewById<TextView>(R.id.tv_birth)?.text = "Date of birth >> ${player.birthDate}"
            findViewById<TextView>(R.id.tv_age)?.text = "Age >> ${if (age >= 16) getAge() else player.age}"
            findViewById<TextView>(R.id.tv_height)?.text = "Height >> ${player.height} m"
            findViewById<TextView>(R.id.tv_national)?.text = "National >> ${player.national}"
            findViewById<TextView>(R.id.tv_number)?.text = "Number >> ${player.number}"
            findViewById<TextView>(R.id.tv_position)?.text = "Position >> ${player.position}"
            findViewById<TextView>(R.id.tv_foot)?.text = "Foot >> ${player.foot}"
            findViewById<TextView>(R.id.tv_joined)?.text = "Joined >> ${player.joinDate}"
            findViewById<TextView>(R.id.tv_expired)?.text = "Contract expires >> ${player.expiredDate}"

            showHtmlDescription(player.rawHtmlDescription)
        }

        setSupportActionBar(toolBar)
        toolBar.setNavigationOnClickListener {
            finish()
        }
    }

    private fun showHtmlDescription(rawHtml: Int) {
        val inputStream = resources.openRawResource(rawHtml)
        val htmlString = inputStream.bufferedReader().use { it.readText() }
        val textView = findViewById<TextView>(R.id.tv_description)
        textView.text = HtmlCompat.fromHtml(htmlString, HtmlCompat.FROM_HTML_MODE_LEGACY)
    }

}