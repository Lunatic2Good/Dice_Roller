package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {

            //val toast= Toast.makeText(this,"Dice Rolled!",Toast.LENGTH_SHORT)
            //toast.show()
            //or
            //Toast.makeText(this,"Dice Rolled!",Toast.LENGTH_SHORT).show()

            //val resultTextView: TextView = findViewById(R.id.textView)
            //resultTextView.text = "6"

            rollDice()
        }
        // Do a dice roll when the app starts
        rollDice()
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Update the screen with the dice roll
//        val resultTextView: TextView = findViewById(R.id.textView)
//        resultTextView.text = diceRoll.toString()
//        //val str = "himeshtyagi"
//        //resultTextView.text = str.random().toString()
//
//
//        //homework= Add another dice to the app. Clicking on the Roll button should roll 2 dice.
//        // The results should be displayed in 2 different TextViews on screen.
//
//        val dice2 = Dice(6)
//        val resultTextView2: TextView = findViewById(R.id.textView2)
//        resultTextView2.text = dice2.roll().toString()
//
        // OR

        //var resultTextView: TextView = findViewById(R.id.textView)
        //resultTextView.text = diceRoll.toString()

//        val dice2 = Dice(6)
//        resultTextView: TextView = findViewById(R.id.textView2)
//        resultTextView.text = dice2.roll().toString()

        //adding image when rolled
//        val diceImage: ImageView = findViewById(R.id.imageView)
//        when (diceRoll) {
//            1 -> diceImage.setImageResource(R.drawable.dice_1)
//            2 -> diceImage.setImageResource(R.drawable.dice_2)
//            3 -> diceImage.setImageResource(R.drawable.dice_3)
//            4 -> diceImage.setImageResource(R.drawable.dice_4)
//            5 -> diceImage.setImageResource(R.drawable.dice_5)
//            6 -> diceImage.setImageResource(R.drawable.dice_6)

        // OR

        // Find the ImageView in the layout
        val diceImage: ImageView = findViewById(R.id.imageView)

        // Determine which drawable resource ID to use based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)

        // Update the content description
        diceImage.contentDescription = diceRoll.toString()
        }
    }


class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}