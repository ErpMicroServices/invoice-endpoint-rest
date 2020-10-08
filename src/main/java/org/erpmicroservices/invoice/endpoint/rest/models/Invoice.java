package org.erpmicroservices.invoice.endpoint.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Entity
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
