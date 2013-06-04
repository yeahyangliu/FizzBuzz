package com.thoughtworks.homework;

import com.google.common.collect.ImmutableList;
import com.thoughtworks.homework.domain.Buzz;
import com.thoughtworks.homework.domain.Fizz;
import com.thoughtworks.homework.domain.FizzBuzz;

public class NumberFactory
{
    private static final ImmutableList<Number> numbers = ImmutableList.of(new FizzBuzz(), new Fizz(), new Buzz());

    public static String getPrint(Integer input)
    {
        for (Number number : numbers) {
            if (number.isApplicable(input)) {
                return number.getResult();
            }
        }
        return input.toString();
    }
}
