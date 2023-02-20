package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        // Créez une variable de type ImageView appelée diceImage
        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_2)
    }
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}