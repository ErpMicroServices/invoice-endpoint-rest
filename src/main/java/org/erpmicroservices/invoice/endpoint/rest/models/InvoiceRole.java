package org.erpmicroservices.invoice.endpoint.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity(name = "invoice_role")
public class InvoiceRole extends AbstractPersistable<UUID> {

 @NotNull
 @Column(name = "datetime", columnDefinition = "DATE_TIME")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
 @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
 private OffsetDateTime dateTime;

 private BigDecimal percentage;

 @ManyToOne
 @JoinColumn(name = "invoice_role_type_id")
 private InvoiceRoleType type;

 private UUID partyId;

 public OffsetDateTime getDateTime() {
	return dateTime;
 }

 public void setDateTime(OffsetDateTime dateTime) {
	this.dateTime = dateTime;
 }

 public BigDecimal getPercentage() {
	return percentage;
 }

 public void setPercentage(BigDecimal percentage) {
	this.percentage = percentage;
 }

 public InvoiceRoleType getType() {
	return type;
 }

 public void setType(InvoiceRoleType type) {
	this.type = type;
 }

 public UUID getPartyId() {
	return partyId;
 }

 public void setPartyId(UUID partyId) {
	this.partyId = partyId;
 }
}
