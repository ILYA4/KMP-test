package ru.chit.recyclemap.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.chit.recyclemap.Greeting
import ru.chit.recyclemap.android.fragments.view.BitcoinCurrencyFragment

fun greet(): String {
    return Greeting().greeting()
}

class AppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragment = BitcoinCurrencyFragment()
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.container, fragment)
            .addToBackStack(null)
            .commit()
    }
}
