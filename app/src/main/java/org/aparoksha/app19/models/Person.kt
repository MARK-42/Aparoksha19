package org.aparoksha.app19.models

data class Person(
    val id: String,
    val name: String,
    val imageUrl: String,
    val designation: String,
    val phoneNumber: Long
) {
    constructor() : this("", "", "", "", 0)
}