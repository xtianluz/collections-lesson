package com.example.collectionlesson

fun main(){
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    println(solarSystem.size)
    solarSystem.add("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))
    //As mentioned before, sets can't contain duplicates. Try adding "Pluto" again.
    println(solarSystem.contains("Pluto"))
    println(solarSystem.size)
    solarSystem.remove("Pluto")
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))
}