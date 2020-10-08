package org.erpmicroservices.invoice.endpoint.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "invoice_status")
public class InvoiceStatus extends AbstractPersistable<UUID> {

 @NotNull
 @Column(name = "status_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate statusDate;

 @NotNull
 @ManyToOne
 private InvoiceStatusType type;

 public LocalDate getStatusDate() {
  return statusDate;
 }

 public void setStatusDate(LocalDate statusDate) {
  this.statusDate = statusDate;
 }

 public InvoiceStatusType getType() {
  return type;
 }

 public void setType(InvoiceStatusType type) {
  this.type = type;
 }
}
