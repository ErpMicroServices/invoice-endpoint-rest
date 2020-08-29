package org.erpmicroservices.invoice.endpoint.rest.models;


import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;


@Entity
public class InvoiceItem extends AbstractPersistable<UUID> {

 @NotNull
 @ManyToOne
 private InvoiceItemType type;

 private boolean taxableFlag;

 @NotNull
 private BigDecimal amount;

 private String description;

 private BigDecimal percentage;

 private UUID adjustmentForId;

 public InvoiceItemType getType() {
  return type;
 }

 public void setType(InvoiceItemType type) {
  this.type = type;
 }

 public boolean isTaxableFlag() {
  return taxableFlag;
 }

 public void setTaxableFlag(boolean taxableFlag) {
  this.taxableFlag = taxableFlag;
 }

 public BigDecimal getAmount() {
  return amount;
 }

 public void setAmount(BigDecimal amount) {
  this.amount = amount;
 }

 public String getDescription() {
  return description;
 }

 public void setDescription(String description) {
  this.description = description;
 }

 public BigDecimal getPercentage() {
  return percentage;
 }

 public void setPercentage(BigDecimal percentage) {
  this.percentage = percentage;
 }

 public UUID getAdjustmentForId() {
  return adjustmentForId;
 }

 public void setAdjustmentForId(UUID adjustmentForId) {
  this.adjustmentForId = adjustmentForId;
 }
}
