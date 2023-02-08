package f_map;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 * @note A class to demonstrate how to implement and use a map's functional methods compute(),
 *     computeIfAbsent(), computeIfPresent(), merge()
 * @author David Kariuki
 * @since 07/02/2023
 */
public class FunctionalOperationsInAMap {

  /**
   * Main Method
   *
   * @param args - String array
   */
  public static void main(String[] args) {

    Map<String, String> map = new HashMap<>(0);
    map.put("name", "David Kariuki");
    map.put("dob", "22/10/1997");
    map.put("gender", "Male");
    map.put("age", "");
    map.put("dailySalaryInUSD", "200");

    // Compute
    map.compute("gender", (key, value) -> value == null ? null : value.toUpperCase());

    // ComputeIfPresent - I am calculating my age in years, months and days
    map.computeIfPresent(
        "age",
        (key, value) -> {
          LocalDate dob =
              LocalDate.parse(map.get("dob"), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

          return Period.between(dob, LocalDate.now()).toString();
        });

    // ComputeIfAbsent - Compute monthly salary
    map.computeIfAbsent(
        "monthlySalaryInUSD",
        (key) ->
            String.valueOf(
                new BigDecimal(map.get("dailySalaryInUSD"))
                    .multiply(new BigDecimal(30))
                    .doubleValue()));

    // Merge
    map.merge("123", "XYZ", (oldValue, newValue) -> newValue + "-abc");

    // Iterate Map
    for (Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }
}
