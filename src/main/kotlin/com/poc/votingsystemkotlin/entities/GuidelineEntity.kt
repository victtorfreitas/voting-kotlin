package com.poc.votingsystemkotlin.entities

import jakarta.persistence.*
import java.time.LocalDateTime


@Entity
@Table(name = "TB_GUIDELINES", schema = "voting-system")
class GuidelineEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    var description: String?,
    var dateCreate: LocalDateTime,
)