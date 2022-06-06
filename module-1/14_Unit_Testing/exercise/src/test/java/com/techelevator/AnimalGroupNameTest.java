package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTest {

    @Test
    public void when_name_of_animal_is_null_return_unknown(){

        //arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();

        String animals = null;

        //act
        String actual = animalGroupName.getHerd(animals);

        //assert
        Assert.assertEquals("unknown", actual);

    }
    @Test
    public void when_name_of_animal_is_empty_return_unknown() {

        //arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();

        String animals = "";

        //act
        String actual = animalGroupName.getHerd(animals);

        //assert
        Assert.assertEquals("unknown", actual);
    }
    @Test
    public void when_name_of_animal_is_not_found_return_unknown() {

        //arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();

        String animals = "cows";

        //act
        String actual = animalGroupName.getHerd(animals);

        //assert
        Assert.assertEquals("unknown", actual);
    }

    @Test
    public void when_animal_name_case_insensitive(){
        //arrange
        AnimalGroupName animalGroupName = new AnimalGroupName();

        String animals = "CrOw";

        //act
        String actual = animalGroupName.getHerd(animals);

        //assert
        Assert.assertEquals("Murder", actual);
    }

}
