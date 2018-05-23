package MainForTest;

import controllers.BoardController;
import entityes.Board;

public class Main {
    public static void main(String[] args) {
        BoardController boardController = new BoardController();
        Board[] testboards = boardController.getAllBoards();
        if (testboards==null) System.out.println("fuck");
        for (Board x : testboards){
            System.out.println(x);
        }

    }
}
