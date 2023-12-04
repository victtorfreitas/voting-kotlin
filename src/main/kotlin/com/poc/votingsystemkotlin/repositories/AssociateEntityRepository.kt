package com.poc.votingsystemkotlin.repositories

import com.poc.votingsystemkotlin.entities.AssociateEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AssociateEntityRepository : JpaRepository<AssociateEntity, Long> {
}