package utils;

import com.github.javafaker.Faker;



public class RandomUtilsWithFaker {
    Faker faker = new Faker();

   public String getFirstName = faker.name().fullName(),
           getLastName = faker.name().firstName(),
     getRandomEmail = faker.internet().emailAddress(),

     getRandomAddress = faker.address().streetAddress();


}
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
}
