package org.erpmicroservices.invoice.endpoint.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "financial_account_role")
public class FinancialAccountRole extends AbstractPersistable<UUID> {

 @NotNull
 @Column(name = "from_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate fromDate;

 @NotNull
 @Column(name = "thru_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate thruDate;

 private UUID partyId;

 @ManyToOne
 @JoinColumn(name = "financial_account_role_type_id")
 private FinancialAccountRoleType type;

 public LocalDate getFromDate() {
	return fromDate;
 }

 public void setFromDate(LocalDate fromDate) {
	this.fromDate = fromDate;
 }

	public LocalDate getThruDate() {
		return thruDate;
	}

	public void setThruDate(LocalDate thruDate) {
		this.thruDate = thruDate;
	}

	public UUID getPartyId() {
		return partyId;
	}

	public void setPartyId(UUID partyID) {
		this.partyId = partyID;
	}

	public FinancialAccountRoleType getType() {
		return type;
	}

	public void setType(FinancialAccountRoleType type) {
		this.type = type;
	}
}
