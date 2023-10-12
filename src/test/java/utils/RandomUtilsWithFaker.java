package utils;

import com.github.javafaker.Faker;


import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


public class RandomUtilsWithFaker {
    Faker faker = new Faker(new Locale("EN"));
    final String[] genders = new String[]{"Male", "Female", "Other"},
            subject = new String[]{"Maths", "Chemistry", "Computer Science", "Commerce", "Economics"},
            hobby = new String[]{"Sports", "Reading", "Music"},
            pictures = new String[]{"1.png", "2.png"};
    final Map<String, String[]> stateAndCity = new HashMap<>();

    {
        stateAndCity.put("NCR", new String[]{"Delhi", "Gurgaon", "Noida"});
        stateAndCity.put("Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"});
        stateAndCity.put("Haryana", new String[]{"Karnal", "Panipat"});
        stateAndCity.put("Rajasthan", new String[]{"Jaipur", "Jaiselmer"});
    }

    public Integer dayOfBirth = faker.number().numberBetween(1, 28);

    public String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = getRandomGender(),
            userNumberInput = faker.phoneNumber().subscriberNumber(10),

    monthOfBirth = faker.options().option("January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"),
            yearOfBirth = String.valueOf(faker.number().numberBetween(1901, 2023)),


    subjects = getRandomSubjects(),
            hobbies = getRandomHobbies(),
            picture = getRandomPicture(),
            randomAddress = faker.address().fullAddress(),
            State = getRandomStates(),
            City = getRandomCities(State);


    public String getRandomGender() {return faker.options().option(genders);}

    public String getRandomHobbies() {
        return faker.options().option(hobby);
    }

    public String getRandomSubjects() {
        return faker.options().option(subject);
    }

    public String getRandomPicture() {
        return faker.options().option(pictures);
    }

    public String getRandomStates() {
        return faker.options().option(stateAndCity.keySet().toArray()).toString();
    }

    public String getRandomCities(String state) {
        return faker.options().option(stateAndCity.get(state));
    }
}

