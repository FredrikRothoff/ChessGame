import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    private ChessPieces cp = new ChessPieces();

    boolean condition = true;

    String[][] Board = {
            {" ", "   A ", "  B ", "  C ", "  D ", "  E ", "  F ", "  G ", "  H "},
            {"1 ", cp.blackRook, cp.blackKnight, cp.blackBishop, cp.blackQueen, cp.blackKing, cp.blackBishop, cp.blackKnight, cp.blackRook},
            {"2 ", cp.blackPawn, cp.blackPawn, cp.blackPawn, cp.blackPawn, cp.blackPawn, cp.blackPawn, cp.blackPawn, cp.blackPawn},
            {"3 ", "    ", "    ", "    ", "    ", "    ", "    ", "    ", "    "},
            {"4 ", "    ", "    ", "    ", "    ", "    ", "    ", "    ", "    "},
            {"5 ", "    ", "    ", "    ", "    ", "    ", "    ", "    ", "    "},
            {"6 ", "    ", "    ", "    ", "    ", "    ", "    ", "    ", "    "},
            {"7 ", cp.whitePawn, cp.whitePawn, cp.whitePawn, cp.whitePawn, cp.whitePawn, cp.whitePawn, cp.whitePawn, cp.whitePawn},
            {"8 ", cp.whiteRook, cp.whiteKnight, cp.whiteBishop, cp.whiteKing, cp.whiteQueen, cp.whiteBishop, cp.whiteKnight, cp.whiteRook}};



    public void PrintBoard() {

        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                System.out.print(Board[j][i]);
            }
            System.out.println(" ");
        }
        if (!Arrays.deepToString(Board).contains(ChessPieces.whiteKing)){
            System.out.println("Black is the winner!!");
            System.exit(0);
        } else if (!Arrays.deepToString(Board).contains(ChessPieces.blackKing)){
            System.out.println("White is the winner!!");
            System.exit(0);
        }
    }
}


