package com.thoughtworks.homework;


public class FizzBuzzNew
{
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public String getAnswer(String numberStr)
    {
        return answer(toInt(numberStr), numberStr);
    }

    private String answer(Integer number, String defaultAnswer)
    {
        String answer;

        if (exactlyDivisible(number, 3)) {
            answer = FIZZ;
        } else if (exactlyDivisible(number, 5)) {
            answer = BUZZ;
        } else {
            answer = defaultAnswer;
        }

        return answer;
    }

    private Integer toInt(String inputNumber)
    {
        return Integer.valueOf(inputNumber);
    }

    private boolean exactlyDivisible(int dividend, int divider)
    {
        return dividend % divider == 0;
    }
}
