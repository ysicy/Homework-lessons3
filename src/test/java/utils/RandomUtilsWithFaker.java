package utils;

import com.github.javafaker.Faker;



public class RandomUtilsWithFaker {
    Faker faker = new Faker();

   public String getFirstName = faker.name().fullName(),
           getLastName = faker.name().firstName(),
           getRandomEmail = faker.internet().emailAddress(),

           getRandomCurrentAddress = faker.address().streetAddress(),
           getDayOfBirth = String.valueOf(faker.number().numberBetween(1, 28),
    getYearOfBirth = String.valueOf(faker.number().numberBetween(1901, 2020));


    public String getRandomGender() {
        String[] genders = {"Male", "Female", "Other"};
        return faker.options().option(genders);
    }

    public String getRandomHobbies(){
        String[] hobbies = {"Sports", "Reading", "Music"};
        return faker.options().option(hobbies);
    }
    public String getRandomSubjects(){
        String[] subjects = {"Maths", "Chemistry", "computer Science", "Commerce", "Economics"};
        return faker.options().option(subjects);
    }


    String monthOfBirth = faker.options().option("January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"),
    }