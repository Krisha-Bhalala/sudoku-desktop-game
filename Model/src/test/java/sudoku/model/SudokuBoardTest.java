package sudoku.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import sudoku.model.models.SudokuBoard;
import sudoku.model.models.SudokuField;
import sudoku.model.solver.BacktrackingSudokuSolver;

public class SudokuBoardTest {

    @Test
    public void testBoardSizeIsNine() {
        SudokuBoard board = new SudokuBoard(new BacktrackingSudokuSolver());
        assertEquals(9, SudokuBoard.BOARD_SIZE);
    }

    @Test
    public void testBoxSizeIsThree() {
        assertEquals(3, SudokuBoard.BOX_SIZE);
    }

    @Test
    public void testNewFieldDefaultValueIsZero() {
        SudokuField field = new SudokuField();
        assertEquals(0, field.getValue());
    }

    @Test
    public void testSetAndGetFieldValue() {
        SudokuField field = new SudokuField();
        field.setValue(7);
        assertEquals(7, field.getValue());
    }

    @Test
    public void testFieldConstructorWithValue() {
        SudokuField field = new SudokuField(5);
        assertEquals(5, field.getValue());
    }
}
