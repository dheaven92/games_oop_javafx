package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        Cell initCell = Cell.C8;
        BishopBlack bishopBlack = new BishopBlack(initCell);
        assertEquals(initCell, bishopBlack.position());
    }

    @Test
    public void copy() {
        Cell initCell = Cell.C8;
        BishopBlack bishopBlackOriginal = new BishopBlack(initCell);
        Figure bishopBlackCopy = bishopBlackOriginal.copy(initCell);
        assertEquals(initCell, bishopBlackCopy.position());
    }

    @Test
    public void wayFromC1ToG5() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expectedPath = new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Cell[] actualPath = bishopBlack.way(Cell.G5);
        assertArrayEquals(expectedPath, actualPath);
    }

    @Test
    public void wayFromC1ToA3() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expectedPath = new Cell[] {Cell.B2, Cell.A3};
        Cell[] actualPath = bishopBlack.way(Cell.A3);
        assertArrayEquals(expectedPath, actualPath);
    }
}