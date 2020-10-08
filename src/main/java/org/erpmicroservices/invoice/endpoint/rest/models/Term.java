package org.erpmicroservices.invoice.endpoint.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.UUID;

@Entity(name = "term")
public class Term extends AbstractPersistable<UUID> {

 @Column(name = "term_value")
 private BigDecimal value;

 @ManyToOne
 @JoinColumn(name = "term_type_id")
 private TermType type;

 public BigDecimal getValue() {
	return value;
 }

 public void setValue(BigDecimal value) {
	this.value = value;
 }

 public TermType getType() {
	return type;
 }

 public void setType(TermType type) {
	this.type = type;
 }
}
