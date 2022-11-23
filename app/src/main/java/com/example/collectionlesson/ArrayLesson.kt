package com.example.collectionlesson

private val rockPlanets = arrayOf<String>("Mercury", "Venus", "Earth", "Mars")
private val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")

private val solarSystem = rockPlanets + gasPlanets

fun main(){
    solarSystem[3] = "Little Earth"
    println(solarSystem[3])
}