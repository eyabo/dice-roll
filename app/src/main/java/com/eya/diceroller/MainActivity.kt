package com.eya.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val diceImage: ImageView = findViewById(R.id.imageView)
            rollButton.setOnClickListener{ rollDice()}
        Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()


    } }
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.one)
            2 -> diceImage.setImageResource(R.drawable.two)
            3 -> diceImage.setImageResource(R.drawable.three)
            4 -> diceImage.setImageResource(R.drawable.four)
            5 -> diceImage.setImageResource(R.drawable.five)
            6 -> diceImage.setImageResource(R.drawable.six)
        }    }

    class Dice(private val numSides: Int) {
        fun roll(): Int{
            return(1..numSides).random()
        }

    }
}