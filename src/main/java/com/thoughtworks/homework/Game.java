package com.thoughtworks.homework;


public class Game
{
    public String getAnswer(String inputNumber)
    {
        try {
            return retrieveAnswer(inputNumber);
        } catch (NumberFormatException numberFormatException) {
            throw new NumberFormatException("Invalid number");
        }
    }

    private String retrieveAnswer(String inputNumber)
    {
        return NumberFactory.getPrint(Integer.valueOf(inputNumber));
    }

}
