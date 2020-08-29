package org.erpmicroservices.invoice.endpoint.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
public class PaymentMethodType extends AbstractPersistable<UUID> {
 @NotBlank
 @NotNull
 private String description;

 @ManyToOne
 private PaymentMethodType parent;

 public String getDescription() {
	return description;
 }

 public void setDescription(String description) {
	this.description = description;
 }

 public PaymentMethodType getParent() {
	return parent;
 }

 public void setParent(PaymentMethodType parent) {
	this.parent = parent;
 }
}
