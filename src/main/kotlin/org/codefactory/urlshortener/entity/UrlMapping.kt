package org.codefactory.urlshortener.entity

import jakarta.persistence.*

@Entity
data class UrlMapping(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    @Column(unique = true)
    val shortUrl: String,
    val longUrl: String
)
