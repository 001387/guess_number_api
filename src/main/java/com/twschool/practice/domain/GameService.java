package com.twschool.practice.domain;

import java.util.Collections;
import java.util.List;

public class GameService {
    private GuessNumberGame guessNumberGame;
    public GameService(GuessNumberGame guessNumberGame) {
        this.guessNumberGame = guessNumberGame;
    }

    public String guess(String answer) {

        List<String> answerList = Collections.singletonList(answer);
        return this.guessNumberGame.guess(answerList);
    }
}
