package create_calculator.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Result {
  private String message;
  private double result;
}
