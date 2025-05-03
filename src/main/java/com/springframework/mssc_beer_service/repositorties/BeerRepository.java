package com.springframework.mssc_beer_service.repositorties;

import com.springframework.mssc_beer_service.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;


public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
