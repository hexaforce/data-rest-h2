package com.example.demo.data.billionaires;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BillionairesRepository extends PagingAndSortingRepository<Billionaires, Integer> {
	Billionaires findByFirstName(String firstName);
}
