package com.thoughtworks.homework.domain;


public class Fizz implements com.thoughtworks.homework.Number
{
    private static final String FIZZ = "Fizz";
    private static final int THREE = 3;

    @Override
    public boolean isApplicable(Integer number)
    {
        return number % THREE == 0;
    }

    @Override
    public String getResult()
    {
        return FIZZ;
    }
}
