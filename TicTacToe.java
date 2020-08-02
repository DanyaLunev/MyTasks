
import io.hexlet.xo.model.*;
import io.hexlet.xo.view.*;
import io.hexlet.xo.controllers.*;

public class TicTacToe {

    public static void main(String... args) {
        final Point p = new Point();

        p.x = 1;
        p.y = 1;

        final Player player = new Player();
        player.name = "Slava";
        player.figure = "X";

        final Game game = new Game();
        game.player1 = new Player();
        game.player2 = new Player();
        game.name = "XO";
        game.field = new Field();


        game.field.f00 = "X";
        game.field.f01 = "X";
        game.field.f02 = "X";

        game.field.f10 = "X";
        game.field.f11 = "X";
        game.field.f12 = "X";

        game.field.f20 = "X";
        game.field.f21 = "X";
        game.field.f22 = "X";

        game.field.setFigure(p, "X");

        final ConsoleView cv = new ConsoleView();
        cv.show(game);
        cv.move(game);

        final CurrentMoveController cmc = new CurrentMoveController();
        final String currentFigure = cmc.currentMove(game.field);
        if (!"X".equals(currentFigure)) {
            throw new RuntimeException(String.format("CurrentMoveController returns %s, instead of X", currentFigure));
        }

        final MoveController mc = new MoveController();
        mc.applyFigure(game.field, p, "X");

        final WinnerController wc = new WinnerController();
        final String winner = wc.getWinner(game.field);
        if (!"X".equals(winner)) {
            throw new RuntimeException(String.format("WinnerController returns %s, instead of X", winner));
        }

        int size = game.field.getSize();
        if (size != 3) {
            throw new RuntimeException(String.format("Field.getSize() returns %d, instead of 3", size));
        }

        String figure = game.field.getFigure(p);
        if (figure != null) {
            throw new RuntimeException(String.format("Field.getFigure(p) returns %s, instead of null", figure));
        }
    }
}