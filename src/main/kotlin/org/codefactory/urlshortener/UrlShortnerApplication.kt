package org.codefactory.urlshortener

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class UrlShortnerApplication

fun main(args: Array<String>) {
    runApplication<UrlShortnerApplication>(*args)
    println("hello world!")
}
