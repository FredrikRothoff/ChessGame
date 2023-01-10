public class Logic {
    Board bd = new Board();
    ChessPieces cp = new ChessPieces();
    boolean condition;

    public String selectedPiece(int y, int x){
        String selectedPiece = bd.Board[y][x];
        String piece = "";
            if (cp.chessPieceList().contains(selectedPiece)){
                piece = selectedPiece;
            } else {
                System.out.println("Invalid piece selected");
            }
            return piece;
    }
    public void selectedKing(int y1, int x1, int y2, int x2){
        String chosenMove = bd.Board[y2][x2];
        condition = (y1 + 1 == y2) && (x1 == x2) || (y1 == y2) && (x1 + 1 == x2) || (y1 == y2) && (x1 - 1 == x2) ||
                (y1 + 1 == y2) && (x1 - 1 == x2) || (y1 + 1 == y2) && (x1 + 1 == x2) || (y1 - 1 == y2) && (x1 + 1 == x2) ||
                (y1 - 1 == y2) && (x1 - 1 == x2) || (y1 - 1 == y2) && (x1 == x2) || y2 > 8 || y2 < 1 || x2 > 8 || x2 < 1;

        if (selectedPiece(y1,x1).equals(ChessPieces.blackKing)){
            if (condition && !cp.blackChessPieceList().contains(chosenMove)){
                MovePiece(y1, x1, y2, x2);
            } else {
                System.out.println("Invalid move");
                bd.PrintBoard();
            }
        }
        if (selectedPiece(y1,x2).equals(ChessPieces.whiteKing)){
            if (condition && !cp.whiteChessPieceList().contains(chosenMove)){
                MovePiece(y1, x1, y2, x2);
            } else {
                System.out.println("Invalid move");
                bd.PrintBoard();
            }
        }

    }

    public void selectedQueen(int y1, int x1, int y2, int x2){
        String chosenMove = bd.Board[y2][x2];
        for (int i = 0; i < 8; i++) {
            condition =  (y1 + i == y2) && (x1 + i == x2) || (y1 - i == y2) && (x1 - i == x2) ||
                    (y1 - i == y2) && (x1 + i == x2) || (y1 + i == y2) && (x1 - i == x2) ||
                    (y1 == y2) && (x1 + i == x2) || (y1 == y2) && (x1 - i == x2) ||
                    (x1 == x2) && (y1 + i == y2) || (x1 == x2) && (y1 - i == y2);
            if (condition) {
                break;
            }
        }

        if (selectedPiece(y1,x1).equals(ChessPieces.blackQueen)){
            if (condition && !cp.blackChessPieceList().contains(chosenMove)){
                MovePiece(y1, x1, y2, x2);
            } else {
                System.out.println("Invalid move");
                bd.PrintBoard();
            }
        }
        if (selectedPiece(y1,x1).equals(ChessPieces.whiteQueen)){
            if (condition && !cp.whiteChessPieceList().contains(chosenMove)){
                MovePiece(y1, x1, y2, x2);
            } else {
                System.out.println("Invalid move");
                bd.PrintBoard();
            }
        }

    }

    public void selectedBishop(int y1, int x1, int y2, int x2){
        String chosenMove = bd.Board[y2][x2];
        for (int i = 0; i < 8; i++) {
            condition =  (y1 + i == y2) && (x1 + i == x2) || (y1 - i == y2) && (x1 - i == x2) ||
                    (y1 - i == y2) && (x1 + i == x2) || (y1 + i == y2) && (x1 - i == x2);
            if (condition) {
                break;
            }
        }

        if (selectedPiece(y1,x1).equals(ChessPieces.blackBishop)){
            if (condition && !cp.blackChessPieceList().contains(chosenMove)){
                MovePiece(y1, x1, y2, x2);
            } else {
                System.out.println("Invalid move");
                bd.PrintBoard();
            }
        }
        if (selectedPiece(y1,x1).equals(ChessPieces.whiteBishop)){
            if (condition && !cp.whiteChessPieceList().contains(chosenMove)){
                MovePiece(y1, x1, y2, x2);
            } else {
                System.out.println("Invalid move");
                bd.PrintBoard();
            }
        }

    }

    public void selectedKnight(int y1, int x1, int y2, int x2){
        int ys = y1 - y2;
        int xs = x1 - x2;
        String chosenMove = bd.Board[y2][x2];
         condition = (ys == 1 && xs == 2) || (ys == 2 && xs == 1) || (ys == -1 && xs == -2) || (ys == -2 && xs == -1) ||
                (ys == -1 && xs == 2) || (ys == -2 && xs == 1) || (ys == 1 && xs == -2) || (ys == 2 && xs == -1);
        if (selectedPiece(y1, x1).equals(ChessPieces.blackKnight)) {

            if (condition && !cp.blackChessPieceList().contains(chosenMove)) {
                MovePiece(y1, x1, y2, x2);
            } else {
                System.out.println("Invalid move");
                bd.PrintBoard();
            }
        }
        if (selectedPiece(y1, x1).equals(ChessPieces.whiteKnight)) {
            if (condition && !cp.whiteChessPieceList().contains(chosenMove)) {
                MovePiece(y1, x1, y2, x2);
            } else {
                System.out.println("Invalid move");
                bd.PrintBoard();
            }
        }

    }

    public void selectedRook(int y1,int x1, int y2, int x2) {
        String chosenMove = bd.Board[y2][x2];
        for (int i = 0; i < 8; i++) {
            condition = (y1 == y2) && (x1 + i == x2) || (y1 == y2) && (x1 - i == x2) ||
                    (x1 == x2) && (y1 + i == y2) || (x1 == x2) && (y1 - i == y2);
            if (condition) {
                break;
            }
        }

        if (selectedPiece(y1, x1).equals(ChessPieces.blackRook)) {
            if (condition && !cp.blackChessPieceList().contains(chosenMove))  {
                MovePiece(y1, x1, y2, x2);
            } else {
                System.out.println("Invalid move");
                bd.PrintBoard();
            }
        }
        if (selectedPiece(y1, x1).equals(ChessPieces.whiteRook)) {
            if (condition && !cp.whiteChessPieceList().contains(chosenMove)) {
                MovePiece(y1, x1, y2, x2);
            } else {
                System.out.println("Invalid move");
                bd.PrintBoard();
            }
        }
    }
    public void selectedPawn(int y1,int x1, int y2, int x2){
        String chosenMove = bd.Board[y2][x2];
        boolean blackPawnToBlackQueen = y2 == 8;
        boolean whitePawnToWhiteQueen = y2 == 1;
        boolean blackCondition = (x1 == x2 && (y1 + 1) == y2 && !cp.whiteChessPieceList().contains(chosenMove)) || ((y1 + 1 == y2) && (x1 + 1 == x2) && cp.whiteChessPieceList().contains(chosenMove))
                || ((y1 + 1 == y2) && (x1 - 1 == x2) && cp.whiteChessPieceList().contains(chosenMove))&& !cp.blackChessPieceList().contains(chosenMove);
        boolean blackConditionFirstMove = (x1 == x2 && (y1 == 2) && y2 == 4) && !cp.blackChessPieceList().contains(chosenMove);
        boolean whiteCondition = (x1 == x2 && (y1 - 1) == y2 && !cp.blackChessPieceList().contains(chosenMove)) || ((y1 - 1 == y2) && (x1 + 1 == x2) && cp.blackChessPieceList().contains(chosenMove))
                || ((y1 - 1 == y2) && (x1 - 1 == x2) && cp.blackChessPieceList().contains(chosenMove))&& !cp.whiteChessPieceList().contains(chosenMove);
        boolean whiteConditionFirstMove = (x1 == x2 && (y1 == 7) && y2 == 5) && !cp.whiteChessPieceList().contains(chosenMove);
        if (selectedPiece(y1,x1).equals(ChessPieces.blackPawn)) {
            if (blackConditionFirstMove){
                MovePiece(y1, x1, y2, x2);
            } else if (blackPawnToBlackQueen && blackCondition) {
                bd.Board[y1][x1] = ChessPieces.blackQueen;
                MovePiece(y1, x1, y2, x2);
            } else if (blackCondition) {
                MovePiece(y1, x1, y2, x2);
            } else {
                System.out.println("Invalid move");
                bd.PrintBoard();
            }
        } else if (selectedPiece(y1,x1).equals(ChessPieces.whitePawn)) {
            if (whiteConditionFirstMove){
                MovePiece(y1, x1, y2, x2);
            } else if (whitePawnToWhiteQueen && whiteCondition) {
                bd.Board[y1][x1] = ChessPieces.whiteQueen;
                MovePiece(y1, x1, y2, x2);
            } else if (whiteCondition && !cp.whiteChessPieceList().contains(chosenMove)) {
                MovePiece(y1, x1, y2, x2);
            } else {
                System.out.println("Invalid move");
                bd.PrintBoard();
            }
        }

    }

    public void MovePiece(int y1, int x1, int y2, int x2) {

        bd.Board[y2][x2] = bd.Board[y1][x1];
        bd.Board[y1][x1] = "    ";

        bd.PrintBoard();
    }

}
