package com.poc.votingsystemkotlin.entities

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "TB_VOTES")
data class VoteEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val date: LocalDateTime,
    val favorable: Boolean,
    @ManyToOne
    val associate: AssociateEntity,
    @ManyToOne
    val session: SessionEntity,
)
