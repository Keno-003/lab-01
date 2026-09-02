package com.example.myapplication

abstract class Mood(val date: String) {
    abstract fun expressed(): String
}