package org.anton.learncmp.base

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform