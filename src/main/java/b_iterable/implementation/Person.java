package b_iterable.implementation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Person {

    private String fullName;
    private String dateOfBirth;
    private Gender gender;

    public enum Gender {
        MALE, FEMALE
    }
}


