package io.ysakhno.compose.multiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
