package org.erpmicroservices.invoice.endpoint.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Entity(name = "invoice")
public class Invoice extends AbstractPersistable<UUID> {

 private String description;

 @NotNull
 @Column(name = "invoice_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate invoiceDate;

 private String message;

 @OneToMany
 @JoinColumn(name = "invoice_id")
 private List<InvoiceItem> invoiceItems = new ArrayList<>();

 @OneToMany
 @JoinColumn(name = "invoice_id")
 private List<InvoiceRole> roles = new ArrayList<>();

 private UUID sentFromContactMechanismId;

 private UUID addressedToContactMechanismId;

 private UUID billedFromPartyRoleId;

 private UUID billedToPartyRoleId;

 @ManyToOne
 private BillingAccount billingAccount;


 public List<InvoiceRole> getRoles() {
  return roles;
 }

 public void setRoles(List<InvoiceRole> roles) {
  this.roles = roles;
 }

 public UUID getSentFromContactMechanismId() {
  return sentFromContactMechanismId;
 }

 public void setSentFromContactMechanismId(UUID sentFromContactMechanismId) {
  this.sentFromContactMechanismId = sentFromContactMechanismId;
 }

 public UUID getAddressedToContactMechanismId() {
  return addressedToContactMechanismId;
 }

 public void setAddressedToContactMechanismId(UUID addressedToContactMechanismId) {
  this.addressedToContactMechanismId = addressedToContactMechanismId;
 }

 public UUID getBilledFromPartyRoleId() {
  return billedFromPartyRoleId;
 }

 public void setBilledFromPartyRoleId(UUID billedFromPartyRoleId) {
  this.billedFromPartyRoleId = billedFromPartyRoleId;
 }

 public UUID getBilledToPartyRoleId() {
  return billedToPartyRoleId;
 }

 public void setBilledToPartyRoleId(UUID billedToPartyRoleId) {
  this.billedToPartyRoleId = billedToPartyRoleId;
 }

 public BillingAccount getBillingAccount() {
  return billingAccount;
 }

 public void setBillingAccount(BillingAccount billingAccount) {
  this.billingAccount = billingAccount;
 }

 public String getDescription() {
  return description;
 }

 public void setDescription(String description) {
  this.description = description;
 }

 public LocalDate getInvoiceDate() {
	return invoiceDate;
 }

 public void setInvoiceDate(LocalDate invoiceDate) {
	this.invoiceDate = invoiceDate;
 }

 public String getMessage() {
	return message;
 }

 public void setMessage(String message) {
	this.message = message;
 }

 public List<InvoiceItem> getInvoiceItems() {
	return invoiceItems;
 }

 public void setInvoiceItems(List<InvoiceItem> invoiceItems) {
	this.invoiceItems = invoiceItems;
 }
}
