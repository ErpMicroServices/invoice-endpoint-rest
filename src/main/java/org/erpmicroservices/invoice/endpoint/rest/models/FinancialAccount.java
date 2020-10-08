package org.erpmicroservices.invoice.endpoint.rest.models;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity(name = "financial_account")
public class FinancialAccount extends AbstractPersistable<UUID> {

 @NotNull
 @NotEmpty
 private String name;

 @OneToMany
 private List<FinancialAccountRole> financialAccountRoles = new ArrayList<>();

 @ManyToOne
 @JoinColumn(name = "financial_account_type_id")
 private FinancialAccountType type;

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public List<FinancialAccountRole> getFinancialAccountRoles() {
  return financialAccountRoles;
 }

 public void setFinancialAccountRoles(List<FinancialAccountRole> financialAccountRoles) {
  this.financialAccountRoles = financialAccountRoles;
 }

 public FinancialAccountType getType() {
  return type;
 }

 public void setType(FinancialAccountType type) {
  this.type = type;
 }
}
