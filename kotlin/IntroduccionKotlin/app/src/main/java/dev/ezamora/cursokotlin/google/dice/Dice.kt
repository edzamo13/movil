package dev.ezamora.cursokotlin.google.dice;

public class Dice(val numSide:Int) {


   fun roll():Int {
    //  val diceRange = 1..numSide
     // val randomNumber= diceRange.random()
    //  println("Ramdom numbre: ${randomNumber}")
     // return randomNumber
      return (1..numSide).random()
   }

}
