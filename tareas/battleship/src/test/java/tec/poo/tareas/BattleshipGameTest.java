package tec.poo.tareas;

import static org.assertj.core.api.Assertions.*;
import static tec.poo.tareas.Config.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class BattleshipGameTest
{
    private BattleshipGame game;

    @BeforeEach
    public void setup() {
        this.game = new BattleshipGame();
    }

    @Test
    public void givenNewGameInstance_WhenGameIsSetup_ThenBoardIsCreated() {
        // Arrange

        // Act
        this.game.gameSetup();

        // Assert
        assertThat(this.game.getBoardSize()).isEqualTo(BOARD_SIZE);
        assertThat(this.game.areAllShipsAlive()).isTrue();
    }
}
