package com.poc.votingsystemkotlin.controlles

import com.poc.votingsystemkotlin.entities.GuidelineEntity
import com.poc.votingsystemkotlin.services.FindGuidelineService
import com.poc.votingsystemkotlin.services.ProcessGuidelineService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/guidelines")
class GuidelineController(
    val findGuidelines: FindGuidelineService,
    val processGuidelines: ProcessGuidelineService,
) {
    @GetMapping
    fun listAll() = findGuidelines.findAll()

    @PostMapping
    fun create(@RequestBody guidelineRequest: GuidelineEntity) = processGuidelines.save(guidelineRequest)
}