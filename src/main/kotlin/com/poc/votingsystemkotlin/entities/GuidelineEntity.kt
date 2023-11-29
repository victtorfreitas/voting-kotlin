package com.poc.votingsystemkotlin.entities

import jakarta.persistence.*
import java.time.ZoneOffset


@Entity
@Table(name = "TB_GUIDELINES")
data class GuidelineEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val description: String?,
    val dateCreate: ZoneOffset,
    @OneToMany
    val sessions: List<VoteSessionEntity>,
)