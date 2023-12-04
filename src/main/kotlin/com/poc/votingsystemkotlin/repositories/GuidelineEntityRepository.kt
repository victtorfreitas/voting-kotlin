package com.poc.votingsystemkotlin.repositories

import com.poc.votingsystemkotlin.entities.GuidelineEntity
import org.springframework.data.jpa.repository.JpaRepository

interface GuidelineEntityRepository : JpaRepository<GuidelineEntity, Long> {
}