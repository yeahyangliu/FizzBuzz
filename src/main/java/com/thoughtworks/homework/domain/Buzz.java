package com.thoughtworks.homework.domain;

public class Buzz implements com.thoughtworks.homework.Number
{

    private static final String BUZZ = "Buzz";
    public static final int FIVE = 5;

    @Override
    public boolean isApplicable(Integer number)
    {
        return number % FIVE == 0;
    }

    @Override
    public String getResult()
    {
        return BUZZ;
    }
}
