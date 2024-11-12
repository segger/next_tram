package se.johannalynn.nexttram

import kotlin.random.Random

class Greeting {
    private val platform = getPlatform()

    fun greet(): List<String> = buildList {
        add(if (Random.nextBoolean()) "Hi" else "Hello")
        add("Platform = ${platform.name.reversed()}")
    }
}