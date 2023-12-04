package com.poc.votingsystemkotlin.services

import com.poc.votingsystemkotlin.entities.GuidelineEntity
import com.poc.votingsystemkotlin.repositories.GuidelineEntityRepository
import org.springframework.stereotype.Service

@Service
class FindGuidelineService(val repository: GuidelineEntityRepository){

    fun findAll(): List<GuidelineEntity> = repository.findAll();
}