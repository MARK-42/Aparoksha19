package org.aparoksha.app19.models

data class Sponsor(
    val id: String,
    val name: String,
    val imageUrl: String,
    val websiteLink: String
) {
    constructor() : this("", "", "", "")
}