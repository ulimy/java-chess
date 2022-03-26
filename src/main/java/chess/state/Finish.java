package chess.state;

import chess.chessgame.Chessboard;
import chess.chessgame.Position;
import chess.chessgame.Turn;
import chess.piece.Color;

public class Finish implements State {

    private final Chessboard chessboard;

    public Finish(Chessboard chessboard) {
        this.chessboard = chessboard;
    }

    @Override
    public State start() {
        throw new UnsupportedOperationException();
    }

    @Override
    public State move(Position position, Turn turn) {
        throw new UnsupportedOperationException();
    }

    @Override
    public State end() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Chessboard getChessboard() {
        return chessboard;
    }

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public double computeScore(Color color) {
        return chessboard.computeScore(color);
    }
}
