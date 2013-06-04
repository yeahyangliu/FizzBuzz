package com.thoughtworks.homework.domain;

public class FizzBuzz implements com.thoughtworks.homework.Number
{

    private static final String FIZZ_BUZZ = "FizzBuzz";
    public static final int FIFTEEN = 15;

    @Override
    public boolean isApplicable(Integer number)
    {
        return number % FIFTEEN == 0;
    }

    @Override
    public String getResult()
    {
        return FIZZ_BUZZ;
    }
}