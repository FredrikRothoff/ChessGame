import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GameLogic {
    Logic logic = new Logic();
    Board board = new Board();

    public void playerInput() {
        board.PrintBoard();
        Scanner scanner = new Scanner(System.in);
        System.out.println("White starts");

        while (true) {
            System.out.println("What piece would you like to move?");
            String chosenPieces = scanner.next();
            String xAxel = String.valueOf(chosenPieces.charAt(0));
            char yAxel = chosenPieces.charAt(1);

            int xAxelToInt = Integer.parseInt(String.valueOf(numberToLetters().get(xAxel)));
            int yAxelToInt = Integer.parseInt(String.valueOf(yAxel));
            String chosen = logic.selectedPiece(yAxelToInt, xAxelToInt);
            System.out.println("You chose" + chosen + " where would u like to move it?");

            String chosenStep = scanner.next();
            String xStep = String.valueOf(chosenStep.charAt(0));
            char yStep = chosenStep.charAt(1);

            int xStepToInt = numberToLetters().get(xStep);
            int yStepToInt = Integer.parseInt(String.valueOf(yStep));

            switch (chosen) {
                case ChessPieces.blackPawn -> logic.selectedPawn(yAxelToInt, xAxelToInt, yStepToInt, xStepToInt);
                default ->  System.out.println(yStepToInt + " " + xStepToInt);
                case ChessPieces.whitePawn -> logic.selectedPawn(yAxelToInt, xAxelToInt, yStepToInt, xStepToInt);
                case ChessPieces.blackRook -> logic.selectedRook(yAxelToInt, xAxelToInt, yStepToInt, xStepToInt);
                case ChessPieces.whiteRook -> logic.selectedRook(yAxelToInt, xAxelToInt, yStepToInt, xStepToInt);
                case ChessPieces.blackKnight -> logic.selectedKnight(yAxelToInt, xAxelToInt, yStepToInt, xStepToInt);
                case ChessPieces.whiteKnight -> logic.selectedKnight(yAxelToInt, xAxelToInt, yStepToInt, xStepToInt);
                case ChessPieces.blackBishop -> logic.selectedBishop(yAxelToInt, xAxelToInt, yStepToInt, xStepToInt);
                case ChessPieces.whiteBishop -> logic.selectedBishop(yAxelToInt, xAxelToInt, yStepToInt, xStepToInt);
                case ChessPieces.blackQueen -> logic.selectedQueen(yAxelToInt, xAxelToInt, yStepToInt, xStepToInt);
                case ChessPieces.whiteQueen -> logic.selectedQueen(yAxelToInt, xAxelToInt, yStepToInt, xStepToInt);
                case ChessPieces.blackKing -> logic.selectedKing(yAxelToInt, xAxelToInt, yStepToInt, xStepToInt);
                case ChessPieces.whiteKing -> logic.selectedKing(yAxelToInt, xAxelToInt, yStepToInt, xStepToInt);
            }
        }
    }

    public boolean winCondition(){
        boolean condition = true;


        return condition;
    }

    public HashMap<String, Integer> numberToLetters() {
        HashMap<String, Integer> xAxelist = new HashMap<String, Integer>();
        xAxelist.put("A", 1);
        xAxelist.put("B", 2);
        xAxelist.put("C", 3);
        xAxelist.put("D", 4);
        xAxelist.put("E", 5);
        xAxelist.put("F", 6);
        xAxelist.put("G", 7);
        xAxelist.put("H", 8);

        return xAxelist;
    }



}
