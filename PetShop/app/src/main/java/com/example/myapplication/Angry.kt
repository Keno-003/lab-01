package com.example.myapplication

class Angry(date: String): Mood(date) {
    override fun expressed(): String {
        return "Frown"
    }
}