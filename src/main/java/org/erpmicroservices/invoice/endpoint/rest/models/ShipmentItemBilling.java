package org.erpmicroservices.invoice.endpoint.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity(name = "shipment_item_billing")
public class ShipmentItemBilling extends AbstractPersistable<UUID> {

 @NotNull
 private UUID shipmentItemId;

 public UUID getShipmentItemId() {
	return shipmentItemId;
 }

 public void setShipmentItemId(UUID shipmentItemId) {
	this.shipmentItemId = shipmentItemId;
 }
}
