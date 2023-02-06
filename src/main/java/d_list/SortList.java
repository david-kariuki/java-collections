/**
 * @note Class to demonstrate how to sort a list
 * @author David Kariuki
 * @since 24/01/2023
 */
package d_list;

import pojo.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

  /**
   * Main Method
   *
   * @param args - String array
   */
  @SuppressWarnings("ComparatorCombinators")
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();

    Collections.addAll(list, "c", "b", "a");
    Collections.sort(list);
    list.forEach(System.out::println);

    List<Car> carList = new ArrayList<>();

    Car car1 = Car.builder().brand("Volvo v40").numberPlate("KBB 678Q").noOfDoors(5).build();
    Car car2 = Car.builder().brand("Citroen C1").numberPlate("KCG 543R").noOfDoors(4).build();
    Car car3 = Car.builder().brand("Dodge Ram").numberPlate("KLM 845A").noOfDoors(2).build();

    Collections.addAll(carList, car1, car2, car3);

    Comparator<Car> carBrandComparator = (car, t1) -> car.getBrand().compareTo(t1.getBrand());
    carList.sort(carBrandComparator);
    System.out.println("\n\nSorting by brand name");
    carList.forEach(element -> System.out.println(element.toString()));

    Comparator<Car> carPlatesComparator = Comparator.comparing(Car::getNumberPlate);
    carList.sort(carPlatesComparator);
    System.out.println("\n\nSorting by car plates");
    carList.forEach(element -> System.out.println(element.toString()));

    Comparator<Car> carDoorsComparator = Comparator.comparing(car -> car.noOfDoors);
    carList.sort(carDoorsComparator);
    System.out.println("\n\nSorting by no of doors");
    carList.forEach(element -> System.out.println(element.toString()));
  }
}
