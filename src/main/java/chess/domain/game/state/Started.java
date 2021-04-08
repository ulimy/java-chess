package chess.domain.game.state;

import chess.domain.board.Board;
import chess.domain.board.position.Position;
import chess.domain.piece.Piece;
import chess.domain.piece.team.Color;

import java.util.Map;
import java.util.Set;

public abstract class Started implements State {
    private final Board board;

    public Started(Board board) {
        this.board = board;
    }

    protected Board board() {
        return this.board;
    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public boolean isNotEnd() {
        return true;
    }

    @Override
    public State passTurn() {
        throw new UnsupportedOperationException("현재 수행할 수 없는 명령입니다.");
    }

    @Override
    public Map<Position, Piece> squares() {
        return board.squares();
    }

    @Override
    public Color winner() {
        throw new UnsupportedOperationException("현재 수행할 수 없는 명령입니다.");
    }

    @Override
    public boolean isInit() {
        return false;
    }

    @Override
    public Set<Position> movablePath(Position source) {
        throw new UnsupportedOperationException("현재 수행할 수 없는 명령입니다.");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException();
    }
}