import java.util.ArrayList;

public class ChessPieces {

    public static final String blackKing = "  \u2654 ";
    public static final String blackQueen = "  \u2655 ";
    public static final String blackRook = "  \u2656 ";
    public static final String blackBishop = "  \u2657 ";
    public static final String blackKnight = "  \u2658 ";
    public static final String blackPawn = "  \u2659 ";
    public static final String whiteKing = "  \u265A ";
    public static final String whiteQueen = "  \u265B ";
    public static final String whiteRook = "  \u265C ";
    public static final String whiteBishop = "  \u265D ";
    public static final String whiteKnight = "  \u265E ";
    public static final String whitePawn = "  \u265F ";


    public ArrayList<String> chessPieceList(){
        ArrayList<String> list = new ArrayList<String>();
        list.add(whitePawn);
        list.add(blackPawn);
        list.add(whiteRook);
        list.add(blackRook);
        list.add(whiteKnight);
        list.add(blackKnight);
        list.add(whiteBishop);
        list.add(blackBishop);
        list.add(whiteQueen);
        list.add(blackQueen);
        list.add(whiteKing);
        list.add(blackKing);

        return list;
    }
    public ArrayList<String> blackChessPieceList(){
        ArrayList<String> blackList = new ArrayList<String>();
        blackList.add(blackPawn);
        blackList.add(blackRook);
        blackList.add(blackKnight);
        blackList.add(blackBishop);
        blackList.add(blackQueen);
        blackList.add(blackKing);

        return blackList;
    }
    public ArrayList<String> whiteChessPieceList(){
        ArrayList<String> whiteList = new ArrayList<String>();
        whiteList.add(whiteBishop);
        whiteList.add(whiteQueen);
        whiteList.add(whiteKing);
        whiteList.add(whitePawn);
        whiteList.add(whiteRook);
        whiteList.add(whiteKnight);

        return whiteList;
    }


}
