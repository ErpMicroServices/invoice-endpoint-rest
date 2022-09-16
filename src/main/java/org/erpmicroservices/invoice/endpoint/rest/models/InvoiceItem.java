package org.erpmicroservices.invoice.endpoint.rest.models;


import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Entity(name = "invoice_item")
public class InvoiceItem extends AbstractPersistable<UUID> {

 private BigDecimal sequence;

 @Column(name = "taxable_flag")
 private boolean isTaxable;

	private BigDecimal quantity;

 private BigDecimal amount;

 private String description;

 @OneToMany
 @JoinColumn(name = "adjustment_for_id")
 private List<InvoiceItem> adjustments;

 @OneToMany
 @JoinColumn(name = "sold_for_id")
 private List<InvoiceItem> soldWith;

 private UUID inventoryItemId;

 private UUID productFeatureId;

 private UUID productId;

 @NotNull
 @ManyToOne
 private InvoiceItemType type;

 @OneToMany
 @JoinColumn(name = "invoice_item_id")
 private List<Term> terms = new ArrayList<>();

 @OneToMany
 @JoinColumn(name = "invoice_item_id")
 private final List<ShipmentItemBilling> shipmentItemBillings = new ArrayList<>();

 @OneToMany
 @JoinColumn(name = "invoice_item_id")
 private final List<TimeEntryBilling> timeEntryBillings = new ArrayList<>();

 @OneToMany
 @JoinColumn(name = "invoice_item_id")
 private final List<OrderItemBilling> orderItemBillings = new ArrayList<>();

 @OneToMany
 @JoinColumn(name = "invoice_item_id")
 private final List<PaymentApplication> applications = new ArrayList<>();

 public List<Term> getTerms() {
	return terms;
 }

 public void setTerms(List<Term> terms) {
	this.terms = terms;
 }

	public BigDecimal getSequence() {
		return sequence;
	}

	public void setSequence(BigDecimal sequence) {
		this.sequence = sequence;
	}

 public boolean isTaxable() {
	return isTaxable;
 }

 public void setTaxable(boolean taxable) {
	isTaxable = taxable;
 }

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
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

 public List<InvoiceItem> getAdjustments() {
	return adjustments;
 }

 public void setAdjustments(List<InvoiceItem> adjustments) {
	this.adjustments = adjustments;
 }

 public List<InvoiceItem> getSoldWith() {
	return soldWith;
 }

 public void setSoldWith(List<InvoiceItem> soldWith) {
	this.soldWith = soldWith;
 }

 public UUID getInventoryItemId() {
	return inventoryItemId;
 }

 public void setInventoryItemId(UUID inventoryItemId) {
	this.inventoryItemId = inventoryItemId;
 }

 public UUID getProductFeatureId() {
	return productFeatureId;
 }

 public void setProductFeatureId(UUID productFeatureId) {
	this.productFeatureId = productFeatureId;
 }

 public UUID getProductId() {
	return productId;
 }

 public void setProductId(UUID productId) {
	this.productId = productId;
 }

 public InvoiceItemType getType() {
	return type;
 }

 public void setType(InvoiceItemType type) {
	this.type = type;
 }
}
