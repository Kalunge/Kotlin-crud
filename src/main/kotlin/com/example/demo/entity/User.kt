package com.example.demo.entity

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data

@Entity
@Table(name = "users")
data class User(
        @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       val id: Long,
       val name: String,
       val email: String
)