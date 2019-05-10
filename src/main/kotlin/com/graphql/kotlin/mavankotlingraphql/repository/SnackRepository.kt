package com.graphql.kotlin.mavankotlingraphql.repository

import com.graphql.kotlin.mavankotlingraphql.entity.Snack
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface SnackRepository : MongoRepository<Snack, String>
