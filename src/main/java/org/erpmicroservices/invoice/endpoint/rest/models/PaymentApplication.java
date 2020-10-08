package org.erpmicroservices.invoice.endpoint.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "payment_application")
public class PaymentApplication extends AbstractPersistable<UUID> {

 private BigDecimal amountApplied;

 @ManyToOne
 private Invoice invoice;

 @ManyToOne
 private BillingAccount billingAccount;

 public BigDecimal getAmountApplied() {
  return amountApplied;
 }

 public void setAmountApplied(BigDecimal amountApplied) {
  this.amountApplied = amountApplied;
 }

 public Invoice getInvoice() {
  return invoice;
 }

 public void setInvoice(Invoice invoice) {
  this.invoice = invoice;
 }

 public BillingAccount getBillingAccount() {
  return billingAccount;
 }

 public void setBillingAccount(BillingAccount billingAccount) {
  this.billingAccount = billingAccount;
 }
}
