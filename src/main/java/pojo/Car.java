package pojo;

import lombok.*;

/**
 * @note
 * @author David Kariuki
 * @since 24/01/2023
 */
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Car {

  public String brand;
  public String numberPlate;
  public int noOfDoors;
}
