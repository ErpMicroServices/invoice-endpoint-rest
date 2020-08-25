package org.erpmicroservices.invoice.repositories;

import org.erpmicroservices.invoice.models.InvoiceStatusType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface InvoiceStatusTypeRepository extends PagingAndSortingRepository<InvoiceStatusType, UUID> {

}
