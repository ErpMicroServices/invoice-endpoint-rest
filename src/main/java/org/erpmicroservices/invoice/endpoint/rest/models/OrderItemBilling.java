package org.erpmicroservices.invoice.endpoint.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "order_item_billing")
public class OrderItemBilling extends AbstractPersistable<UUID> {

 private long quantity;

 private BigDecimal amount;

 private UUID orderItemId;

 public long getQuantity() {
	return quantity;
 }

 public void setQuantity(long quantity) {
	this.quantity = quantity;
 }

 public BigDecimal getAmount() {
	return amount;
 }

 public void setAmount(BigDecimal amount) {
	this.amount = amount;
 }

 public UUID getOrderItemId() {
	return orderItemId;
 }

 public void setOrderItemId(UUID orderItemId) {
	this.orderItemId = orderItemId;
 }
}
