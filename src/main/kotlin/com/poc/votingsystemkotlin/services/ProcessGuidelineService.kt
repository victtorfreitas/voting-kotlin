package com.poc.votingsystemkotlin.services

import com.poc.votingsystemkotlin.entities.GuidelineEntity
import com.poc.votingsystemkotlin.repositories.GuidelineEntityRepository
import org.springframework.stereotype.Service

@Service
class ProcessGuidelineService(val repository: GuidelineEntityRepository) {
    fun save(guidelineRequest: GuidelineEntity) = repository.save(guidelineRequest);
}