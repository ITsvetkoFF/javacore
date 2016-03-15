package com.javarush.test.level27.lesson15.big01.kitchen;

import com.javarush.test.level27.lesson15.big01.ConsoleHelper;
import com.javarush.test.level27.lesson15.big01.Tablet;

import java.io.IOException;
import java.util.List;

/**
 * Created by CMI-USER on 1/14/2016.
 */
public class Order
{
    private Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException
    {
        this.tablet = tablet;
        initDishes();
    }

    public String toString()
    {
        if (dishes == null || dishes.isEmpty())
            return "";
        else return "Your order: " + dishes.toString() + " of " + tablet;
    }

    public int getTotalCookingTime()
    {
        int totalDuration = 0;
        for (Dish dish : dishes)
        {
            totalDuration += dish.getDuration();
        }
        return totalDuration;
    }

    public boolean isEmpty()
    {
        return dishes == null || dishes.isEmpty();
    }

    public List<Dish> getDishes()
    {
        return dishes;
    }

    public Tablet getTablet()
    {
        return tablet;
    }

    protected void initDishes() throws IOException
    {
        dishes = ConsoleHelper.getAllDishesForOrder();
    }
}
