package com.project.bootcamp.model;

import java.time.LocalDate;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class StockDTO {

  private Long id;

  @NotNull
  private String name;

  @NotNull
  @DecimalMin(value = "0.00")
  @Digits(integer = 6, fraction = 2)
  private Double price;

  @NonNull
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
  private LocalDate date;

  @NotNull
  @Digits(integer = 3, fraction = 2)
  private Double variation;
}
