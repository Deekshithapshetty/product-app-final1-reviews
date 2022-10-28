package com.training.rws.galaxe.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.training.rws.galaxe.model.Reviews;

@RepositoryRestResource(collectionResourceRel="reviews",path="reviews")
public interface ReviewsRepository extends PagingAndSortingRepository<Reviews, Long> {

	
}
