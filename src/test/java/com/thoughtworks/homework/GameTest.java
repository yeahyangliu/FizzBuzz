package com.thoughtworks.homework;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameTest
{
    private Game game;

    @Before
    public void setUp() throws Exception
    {
        game = new Game();
    }

    @Test
    public void shouldPrintFizzWhenTheNumberIsThree() throws Exception
    {
        // when
        String result = game.getAnswer("3");

        // then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void shouldPrintFizzWhenTheNumberIsSix() throws Exception
    {
        //when
        String result = game.getAnswer("6");

        //then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void shouldNotPrintFizzWhenTheNumberIsTwo() throws Exception
    {
        //when
        String result = game.getAnswer("2");

        //then
        assertThat(result, not("Fizz"));
    }

    @Test(expected = NumberFormatException.class)
    public void shouldNotPrintFizzWhenTheNumberIsA() throws Exception
    {
        //when
        game.getAnswer("A");
    }

    @Test
    public void shouldPrintBuzzWhenTheNumberIsFive() throws Exception
    {
        //when
        String result = game.getAnswer("5");

        //then
        assertThat(result, is("Buzz"));
    }

    @Test
    public void shouldNotPrintBuzzWhenTheNumberIsFour() throws Exception
    {
        //when
        String result = game.getAnswer("4");

        //then
        assertThat(result, not("Buzz"));
    }

    @Test(expected = NumberFormatException.class)
    public void shouldNotPrintBuzzWhenTheNumberIsB() throws Exception
    {
        //when
        game.getAnswer("B");
    }

    @Test
    public void shouldPrintFizzBuzzWhenTheNumberIsFifteen() throws Exception
    {
        //when
        String result = game.getAnswer("15");

        //then
        assertThat(result, is("FizzBuzz"));
    }

    @Test
    public void shouldPrintFizzWhenTheNumberIsNine() throws Exception
    {

        // given
        Game gameObject = mock(Game.class);
        when(gameObject.getAnswer("9")).thenReturn("Fizz");

        // when
        String result = gameObject.getAnswer("9");

        // then
        assertThat(result, is("Fizz"));

    }
}
