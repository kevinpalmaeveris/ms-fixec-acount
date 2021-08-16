package com.everis.fixedtermaccount.model;

import java.util.Date;
import javax.validation.constraints.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class movements {
  private Date dateCreated = new Date();  
  @NotBlank(message = "Debe seleccionar un typo de movimiento.")
  private String type;

  @Min(10)
  private double amount;

  @NotBlank(message = "Debe seleccionar un numero de cuenta.")
  private String accountEmisor;

  private String accountRecep;

  public movements(
    String accountEmisor,
    String type,
    double amount,
    String accountRecep
  ) {
    this.type = type;
    this.amount = amount;
    this.accountEmisor = accountEmisor;
    this.accountRecep = accountRecep;
  }

  public movements(String accountNumber, String type, double amount) {
    this.type = type;
    this.amount = amount;
    this.accountEmisor = accountNumber;
  }
}
