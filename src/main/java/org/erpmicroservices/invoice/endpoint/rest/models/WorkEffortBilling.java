package org.erpmicroservices.invoice.endpoint.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "work_effort_billing")
public class WorkEffortBilling extends AbstractPersistable<UUID> {

 private BigDecimal percentage;

 private UUID workEffortId;
}
