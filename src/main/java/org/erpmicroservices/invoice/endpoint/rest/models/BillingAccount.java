package org.erpmicroservices.invoice.endpoint.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity(name = "billing_account")
public class BillingAccount extends AbstractPersistable<UUID> {

 @OneToMany
 @JoinColumn(name = "billing_account_id")
 private final List<BillingAccountRole> billingAccountRoles = new ArrayList<>();
 @OneToMany
 @JoinColumn(name = "billing_account_id")
 private final List<Invoice> invoices = new ArrayList<>();
 @Column(name = "from_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate fromDate;
 @Column(name = "thru_date", columnDefinition = "TIMESTAMP")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
 @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
 private LocalDate thruDate;
 @NotNull
 @NotEmpty
 private String description;
 private UUID billedAtContactMechanismId;
 @OneToMany
 @JoinColumn(name = "billing_account_id")
 private List<PaymentApplication> paymentApplications = new ArrayList<>();

 public List<BillingAccountRole> getBillingAccountRoles() {
  return billingAccountRoles;
 }

 public List<Invoice> getInvoices() {
  return invoices;
 }

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

 public String getDescription() {
  return description;
 }

 public void setDescription(String description) {
  this.description = description;
 }

 public UUID getBilledAtContactMechanismId() {
  return billedAtContactMechanismId;
 }

 public void setBilledAtContactMechanismId(UUID billedAtContactMechanismId) {
  this.billedAtContactMechanismId = billedAtContactMechanismId;
 }

 public List<PaymentApplication> getPaymentApplications() {
  return paymentApplications;
 }

 public void setPaymentApplications(List<PaymentApplication> paymentApplications) {
  this.paymentApplications = paymentApplications;
 }
}
