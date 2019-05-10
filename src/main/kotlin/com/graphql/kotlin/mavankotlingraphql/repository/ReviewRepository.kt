package com.graphql.kotlin.mavankotlingraphql.repository

import com.graphql.kotlin.mavankotlingraphql.entity.Review
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ReviewRepository : MongoRepository<Review, String>
