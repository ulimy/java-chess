package chess.piece;

import chess.chessgame.Position;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {

    private static final List<Pair<Integer, Integer>> COORDINATES_OF_MOVABLE = List.of(
            Pair.of(0, 1),
            Pair.of(0, -1),
            Pair.of(1, 1),
            Pair.of(1, 0),
            Pair.of(1, -1),
            Pair.of(-1, 1),
            Pair.of(-1, 0),
            Pair.of(-1, -1)
    );

    public King(Color color) {
        super(Type.KING, color);
    }

    @Override
    public boolean isMovable(Position position) {
        return position.isAnyPossible(COORDINATES_OF_MOVABLE);
    }

    @Override
    public List<Pair<Integer, Integer>> computeMiddlePosition(Position position) {
        return new ArrayList<>();
    }

}
