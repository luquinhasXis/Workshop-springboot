package com.techlucas.workmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.techlucas.workmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	
	
}
