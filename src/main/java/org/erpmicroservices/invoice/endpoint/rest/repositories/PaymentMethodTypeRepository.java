package org.erpmicroservices.invoice.endpoint.rest.repositories;

import org.erpmicroservices.invoice.endpoint.rest.models.PaymentMethodType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface PaymentMethodTypeRepository extends PagingAndSortingRepository<PaymentMethodType, UUID> {

}
