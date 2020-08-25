package org.erpmicroservices.invoice.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
public class FinancialAccountTransactionType extends AbstractPersistable<UUID> {
 @NotBlank
 @NotNull
 private String description;

 @ManyToOne
 private FinancialAccountTransactionType parent;

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }

 public FinancialAccountTransactionType getParent() {
	return parent;
 }

 public void setParent(FinancialAccountTransactionType parent) {
	this.parent = parent;
 }
}
