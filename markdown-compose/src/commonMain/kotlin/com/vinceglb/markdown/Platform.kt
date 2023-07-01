package com.vinceglb.markdown

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform