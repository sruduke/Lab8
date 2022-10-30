package com.example.lab8;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @Before
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void hasCityTest() {
        City city = new City("Edmonton", "AB");
        assertEquals(list.hasCity(city), false);
        list.addCity(city);
        assertEquals(list.hasCity(city), true);
    }

    /* Signatures for other funcs

    @Test
    public void deleteCityTest() {

    }

    @Test
    public void countCityTest() {

    }

     */


}
