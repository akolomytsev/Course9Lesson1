package Builder;


import lombok.Data;

@Data
public class Person {
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String country;
    private final String address;
    private final String phone;
    private final int age;
    private final String gender;

    public static class Builder {
        private final String firstName;
        private final String lastName;
        private final String middleName;
        private final String country;
        private final String address;
        private final String phone;
        private final int age;
        private final String gender;

        //С учетом что все поля обязательные
        public Builder(String firstName, String lastName, String middleName, String country, String address, String phone, int age, String gender) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.middleName = middleName;
            this.country = country;
            this.address = address;
            this.phone = phone;
            this.age = age;
            this.gender = gender;
        }

        public Person build(){
            return new Person(this);
        }
    }
    public Person(Builder.Person.Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        middleName = builder.middleName;
        country = builder.country;
        address = builder.address;
        phone = builder.phone;
        age = builder.age;
        gender = builder.gender;
    }
}