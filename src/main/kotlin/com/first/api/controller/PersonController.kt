package com.first.api.controller

import com.first.api.model.Person
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class PersonController {

    var counter = AtomicLong()

    @GetMapping("/people")
    fun getPeople() =
        listOf(Person(counter.incrementAndGet(), "Victor Tripeno", 27))
}