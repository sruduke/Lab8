package com.example.lab8;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
        assertFalse(list.hasCity(city));
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

    @Test
    public void deleteCityTest() {
        int listSize = list.getCount();
        City city = new City("Saskatchewan", "SK");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
        assertEquals(list.getCount(),listSize);
    }

    @Test
    public void countCitiesTest() {
        CustomList cityList = new CustomList(null, new ArrayList<City>());
        City city = new City("Saskatchewan", "SK");
        assertEquals(0, cityList.getCount());

        list.addCity(city);
        assertEquals(1, cityList.getCount());

        list.remove(city);
        assertEquals(0, cityList.getCount());
    }

}
