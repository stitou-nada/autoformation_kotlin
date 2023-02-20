package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * Cette activité permet à l’utilisateur de lancer un dé et de voir le résultat
 * à l’écran.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }
    /**
     * Lancez les dés et mettez à jour l’écran avec le résultat.
     */
    private fun rollDice() {
        // Créer un nouvel objet Dice avec 6 côtés et le faire rouler
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // Mettre à jour l’écran avec le rouleau de dés
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}