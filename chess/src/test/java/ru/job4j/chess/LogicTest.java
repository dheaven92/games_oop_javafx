package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

public class LogicTest {

    @Test(expected = ImpossibleMoveException.class)
    public void moveWhenImpossible()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.C3);
    }

    @Test(expected = OccupiedCellException.class)
    public void moveWhenCellIsOccupied()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new PawnBlack(Cell.B2));
        logic.move(Cell.C1, Cell.B2);
    }

    @Test(expected = FigureNotFoundException.class)
    public void moveWhenFigureIsNotFound()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.B2, Cell.A3);
    }
}