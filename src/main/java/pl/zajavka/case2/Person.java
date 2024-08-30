package pl.zajavka.case2;

import java.math.BigDecimal;

record Person(String name, String surname) {

    public String whatIsYourJob() {
        return "Software developer!";
    }
    public Boolean doYouHaveABike() {
        return true;
    }

    public Boolean doYouLikePizza() {
        return true;
    }


    public String whatDoYouLike() {
        return "Strawberries";
    }
}
