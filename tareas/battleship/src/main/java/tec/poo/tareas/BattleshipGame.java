package tec.poo.tareas;

import static tec.poo.tareas.Config.*;

public class BattleshipGame {

    private Battleship[] battleshipBoard;
    private int numberOfHits;

    public BattleshipGame() {
        this.battleshipBoard = new Battleship[BOARD_SIZE];
        this.numberOfHits = 0;
    }

    public void gameSetup() {
        // Inicializacion "greedy"
        var poniez = new Battleship();
        poniez.setName("Poniez");
        poniez.setSize(3);
        this.battleshipBoard[2] = poniez;
        this.battleshipBoard[3] = poniez;
        this.battleshipBoard[4] = poniez;
    }

    public String verifyBattleshipStatus(Battleship battleship) {
        var status = "";
        if (battleship != null) {
            status = "Hit!";
            battleship.hit();
            if (battleship.isDeath()) {
                status = "Kill!";
            }
        } else {
            status = "Miss";
        }
        this.increaseNumberOfHits();
        return status;
    }

    public Battleship getBattleshipFromGuess(int guess) {
        // validacion.
        return this.battleshipBoard[guess - 1];
    }

    public void increaseNumberOfHits() {
        this.numberOfHits++;
    }

    public int getNumberOfHits() {
        return this.numberOfHits;
    }

    public boolean areAllShipsAlive() {
        return true;
    }

    public int getBoardSize() {
        return this.battleshipBoard.length;
    }
}
