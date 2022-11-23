package com.example.collectionlesson

fun main() {
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    val mutableSolarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    println(solarSystem.size)
    println(solarSystem[0])
    println(solarSystem.get(3))

//    for (planet in solarSystem){
//        println(planet)
//    }
    mutableSolarSystem.add("Pluto")
    println(mutableSolarSystem)
    mutableSolarSystem.add(3,"Theia")
    println(mutableSolarSystem)
    mutableSolarSystem[3] = "Future moon"
    println(mutableSolarSystem)
    mutableSolarSystem.removeAt(9)
    mutableSolarSystem.remove("Future moon")
    println(mutableSolarSystem)
    println(mutableSolarSystem.contains("Pluto"))
    println("Future Moon" in mutableSolarSystem)
}