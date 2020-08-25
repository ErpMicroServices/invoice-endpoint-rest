package org.erpmicroservices.invoice.repositories;

import org.erpmicroservices.invoice.models.TermType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface TermTypeRepository extends PagingAndSortingRepository<TermType, UUID> {

}
