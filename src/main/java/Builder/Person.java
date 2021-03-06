package Builder;


import lombok.Data;

@Data
public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public Person() {
    }

    public static class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder withFirstName(String firstName){
            newPerson.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName){
            newPerson.lastName = lastName;
            return this;
        }

        public Builder withMiddleName(String middleName){
            newPerson.middleName = middleName;
            return this;
        }

        public Builder withCountry(String country){
            newPerson.country = country;
            return this;
        }

        public Builder withAddress(String address){
            newPerson.address = address;
            return this;
        }

        public Builder withPhone(String phone){
            newPerson.phone = phone;
            return this;
        }

        public Builder withAge(int age){
            newPerson.age = age;
            return this;
        }

        public Builder withGender(String gender){
            newPerson.gender = gender;
            return this;
        }

        public Person build(){
            return newPerson;
        }
    }

    public static void main(String[] args) {
            Person newPerson = new Builder()
                    .withFirstName("ljc")
                    .withLastName("fekfguh")
                    .withMiddleName("kjfvh")
                    .withCountry("ksjfv")

                    .withPhone("hjbkdvkvkjvbkj")
                    .withAge(12)
                    .withGender("w")
                    .build();
        System.out.println(String.valueOf(newPerson));
    }
}