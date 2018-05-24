package MainForTest;

import controllers.BoardController;
import entityes.Board;
import entityes.Card;
import entityes.List;

public class Main {
    public static void main(String[] args) {
        BoardController boardController = new BoardController();
        Board[] testboards = boardController.getAllBoards();
        if (testboards==null) System.out.println("fuck");
        for (Board x : testboards){
            System.out.println(x);
            for ( List y : boardController.getListByBoard(x.getId())){
                System.out.println(y);
                if (y.getName().equalsIgnoreCase("doing")) {
                    for (Card z : boardController.getCardsByList(y.getId())) {
                        System.out.println(z);
                    }
                }
            }
        }

    }
}
