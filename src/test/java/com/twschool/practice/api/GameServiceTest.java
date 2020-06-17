package com.twschool.practice.api;

import com.twschool.practice.domain.Answer;
import com.twschool.practice.domain.GameService;
import com.twschool.practice.domain.GuessNumberGame;
import com.twschool.practice.domain.RandomAnswerGenerator;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;

public class GameServiceTest {
    @Test
    public void should_return_0A0B_given_when_input_1234_answer_5678(){
        RandomAnswerGenerator randomAnswerGenerator = Mockito.mock(RandomAnswerGenerator.class);
        Mockito.when(randomAnswerGenerator.generateAnswer()).thenReturn(new Answer(Arrays.asList("5 6 7 8")));
        GuessNumberGame guessNumberGame = new GuessNumberGame(randomAnswerGenerator);
        GameService gameService = new GameService(guessNumberGame);
        String result = gameService.guess("1 2 3 4");
        assertNotNull(result);
    }

    
}
