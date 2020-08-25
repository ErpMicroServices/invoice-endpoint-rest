package org.erpmicroservices.invoice.repositories;

import org.erpmicroservices.invoice.models.FinancialAccountType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface FinancialAccountTypeRepository extends PagingAndSortingRepository<FinancialAccountType, UUID> {

}
