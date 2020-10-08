package org.erpmicroservices.invoice.endpoint.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity(name = "payment")
public class Payment extends AbstractPersistable<UUID> {

 @NotNull
 @Column(name = "effective_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate effectiveDate;

 @NotNull
 @NotEmpty
 private String paymentReferenceNumber;

 private BigDecimal amount;

 @NotBlank
 @NotNull
 private String comment;

 @OneToMany
 @JoinColumn(name = "payment_id")
 private List<PaymentApplication> paymentApplications = new ArrayList<>();

 private UUID receiverPartyRoleId;

 private UUID payorPartyRoleId;

 @ManyToOne
 @JoinColumn(name = "payment_method_type_id")
 private PaymentMethodType type;

 @OneToMany
 @JoinColumn(name = "payment_id")
 private List<FinancialAccountTransaction> financialAccountTransactions = new ArrayList<>();

 public List<FinancialAccountTransaction> getFinancialAccountTransactions() {
	return financialAccountTransactions;
 }

 public void setFinancialAccountTransactions(List<FinancialAccountTransaction> financialAccountTransactions) {
	this.financialAccountTransactions = financialAccountTransactions;
 }

 public LocalDate getEffectiveDate() {
	return effectiveDate;
 }

 public void setEffectiveDate(LocalDate effectiveDate) {
	this.effectiveDate = effectiveDate;
 }

 public String getPaymentReferenceNumber() {
	return paymentReferenceNumber;
 }

 public void setPaymentReferenceNumber(String paymentReferenceNumber) {
	this.paymentReferenceNumber = paymentReferenceNumber;
 }

 public BigDecimal getAmount() {
	return amount;
 }

 public void setAmount(BigDecimal amount) {
	this.amount = amount;
 }

 public String getComment() {
	return comment;
 }

 public void setComment(String comment) {
	this.comment = comment;
 }

 public List<PaymentApplication> getPaymentApplications() {
	return paymentApplications;
 }

 public void setPaymentApplications(List<PaymentApplication> paymentApplications) {
	this.paymentApplications = paymentApplications;
 }

 public UUID getReceiverPartyRoleId() {
	return receiverPartyRoleId;
 }

 public void setReceiverPartyRoleId(UUID receiverPartyRoleId) {
	this.receiverPartyRoleId = receiverPartyRoleId;
 }

 public UUID getPayorPartyRoleId() {
	return payorPartyRoleId;
 }

 public void setPayorPartyRoleId(UUID payorPartyRoleId) {
	this.payorPartyRoleId = payorPartyRoleId;
 }

 public PaymentMethodType getType() {
	return type;
 }

 public void setType(PaymentMethodType type) {
	this.type = type;
 }
}
