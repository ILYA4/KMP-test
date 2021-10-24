package ru.chit.recyclemap

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}