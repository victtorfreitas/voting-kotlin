package com.poc.votingsystemkotlin.entities

import jakarta.persistence.*

@Entity
@Table(name = "TB_RESULT")
data class ResultEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val approved: Boolean,
    @ManyToOne
    val guideline: GuidelineEntity,
)
