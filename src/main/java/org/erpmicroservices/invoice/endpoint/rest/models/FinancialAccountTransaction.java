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

@Entity(name = "financial_account_transaction")
public class FinancialAccountTransaction extends AbstractPersistable<UUID> {

 @NotNull
 @Column(name = "transaction_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate transactionDate;

 @NotNull
 @Column(name = "entry_date", columnDefinition = "DATE")
 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
 @JsonFormat(pattern = "yyyy-MM-dd")
 private LocalDate entryDate;

 @NotNull
 private UUID executorOfPartyId;

 @ManyToOne
 private FinancialAccount financialAccount;

 public LocalDate getTransactionDate() {
  return transactionDate;
 }

 public void setTransactionDate(LocalDate transactionDate) {
  this.transactionDate = transactionDate;
 }

 public LocalDate getEntryDate() {
  return entryDate;
 }

 public void setEntryDate(LocalDate entryDate) {
  this.entryDate = entryDate;
 }

 public UUID getExecutorOfPartyId() {
  return executorOfPartyId;
 }

 public void setExecutorOfPartyId(UUID executorOfPartyId) {
  this.executorOfPartyId = executorOfPartyId;
 }

 public FinancialAccount getFinancialAccount() {
  return financialAccount;
 }

 public void setFinancialAccount(FinancialAccount financialAccount) {
  this.financialAccount = financialAccount;
 }
}
