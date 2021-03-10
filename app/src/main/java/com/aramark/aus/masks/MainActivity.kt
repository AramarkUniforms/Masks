package com.aramark.aus.masks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aramark.aus.masks.ui.main.MainFragment

class MainActivity : AppCompatActivity() {
    companion object {
        const val FRAGMENT_INFO = "info"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(
                        R.id.container,
                        MainFragment()
                    )
                    .commitNow()
        }
    }
    /*
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_info -> {
                InfoFragment().show(supportFragmentManager, FRAGMENT_INFO)
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    class InfoFragment : DialogFragment() {
        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
            return AlertDialog.Builder(requireContext())
                .setMessage(R.string.intro_message)
                .setPositiveButton(android.R.string.ok, null)
                .show()
        }
    }

     */
}
