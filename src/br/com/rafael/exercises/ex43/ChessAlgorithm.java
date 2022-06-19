package br.com.rafael.exercises.ex43;

//Final classes cannot be subclassed but may be instantiated.

public final class ChessAlgorithm {
    enum ChessPlayer {WHITE, BLACK}

    /*final*/ ChessPlayer getFirstPlayer() {
        return ChessPlayer.WHITE;
    }
}
