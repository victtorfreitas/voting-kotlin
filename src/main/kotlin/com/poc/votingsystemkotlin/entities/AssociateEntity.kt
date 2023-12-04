package com.poc.votingsystemkotlin.entities

import jakarta.persistence.*

@Entity
@Table(name = "TB_ASSOCIATES")
data class AssociateEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,
    val identifier: String,
    val type: TypeEnum,
)
