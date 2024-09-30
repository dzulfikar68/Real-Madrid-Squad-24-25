package io.github.dzulfikar68.realmadridsquad24_25

import android.app.AlertDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : GeneralActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setToolbarNav()
        setListView()
        setListener()
    }

    private fun setListener() {
        findViewById<ImageView>(R.id.iv_logo)?.setOnClickListener {
            openWebRealMadrid()
        }
    }

    private fun openWebRealMadrid() {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse("https://www.realmadrid.com/en-US")
        }
        startActivity(intent)
    }

    private fun setListView() {
        val rvList = findViewById<RecyclerView>(R.id.rv_list)
        rvList.layoutManager = GridLayoutManager(this, 2)
        rvList.adapter = PlayerAdapter(listPlayer.sortedBy { it.number })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_icon -> {
                val popupMenu = PopupMenu(this, findViewById(item.itemId))
                popupMenu.menuInflater.inflate(R.menu.action_menu, popupMenu.menu)
                popupMenu.setOnMenuItemClickListener { e ->
                    when (e.itemId) {
                        R.id.option1 -> {
                            val intentDetail = Intent(this, ProfileActivity::class.java)
                            startActivity(intentDetail)
                            true
                        }
                        R.id.option2 -> {
                            openDialogRealMadrid()
                            true
                        }
                        else -> false
                    }
                }
                popupMenu.show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun openDialogRealMadrid() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(getString(R.string.title_about))
        builder.setMessage(getString(R.string.desc_about))
        builder.setPositiveButton("Click to goto website") { dialog, _ ->
            openWebRealMadrid()
            dialog.dismiss()
        }
        builder.setNegativeButton("Close") { dialog, _ ->
            dialog.dismiss()
        }
        val dialog = builder.create()
        dialog.show()
    }

    private fun setToolbarNav() {
        val toolbar = findViewById<MaterialToolbar>(R.id.tool_bar)
        setSupportActionBar(toolbar)
    }

}
