package org.erpmicroservices.invoice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Invoice extends AbstractPersistable<UUID> {
 @NotBlank
 @NotNull
 private String description;

 @NotNull
 private LocalDate invoiceDate;

 private String message;

 @NotNull
 private UUID ofPartyId;

 @NotNull
 private UUID billedToPartyId;

 @NotNull
 private UUID billedFromPartyId;

 @NotNull
 private UUID addressedToContactMechanismId;

 @NotNull
 private UUID sentFromContactMechanismID;

}
