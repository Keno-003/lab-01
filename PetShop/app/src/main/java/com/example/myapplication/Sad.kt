package com.example.myapplication

class Sad(date: String): Mood(date) {
    override fun expressed(): String {
        return "cry"
    }
}