package chess.domain.chess.unit;

import chess.domain.chess.game.Team;
import chess.domain.geometric.Direction;
import chess.domain.geometric.Vector;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Queen extends Unit {
    private static List<Direction> directions;

    static {
        directions = Arrays.stream(Direction.values())
                .collect(toList());
    }

    public Queen(Team team) {
        super(team, UnitInformation.QUEEN.name());
    }

    @Override
    public boolean validateDirection(Vector another) {
        return directions.stream()
                .anyMatch(direction -> direction.isParallelTo(another));
    }
    @Override
    public String toString() {
        return getTeam().applyUpperCaseOrLowerCaseByTeam(UnitInformation.QUEEN.symbol());
    }
}