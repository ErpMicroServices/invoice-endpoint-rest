package org.erpmicroservices.invoice.endpoint.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.util.UUID;

@Entity(name = "time_entry_billing")
public class TimeEntryBilling extends AbstractPersistable<UUID> {

 private UUID timeEntryId;

}
