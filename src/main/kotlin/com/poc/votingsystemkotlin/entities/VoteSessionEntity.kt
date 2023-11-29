package com.poc.votingsystemkotlin.entities

import jakarta.persistence.*
import java.time.ZoneOffset

@Entity
@Table(name = "TB_VOTE_SESSIONS")
data class VoteSessionEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val dateCreate: ZoneOffset,
    val timeOpen: Int,
    val favorable: Boolean,
    @ManyToOne
    val associate: AssociateEntity,
)
