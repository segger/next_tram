package se.johannalynn.nexttram

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform