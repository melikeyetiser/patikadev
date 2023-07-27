import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    private int rowNumber;
    private int colNumber;

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
    }

    public void run() {
        Scanner input = new Scanner(System.in);
        int mineCount = rowNumber * colNumber / 4;
        int[][] mineMap = new int[rowNumber][colNumber];
        int[][] playersMap = new int[rowNumber][colNumber];
        for (int[] row : playersMap) {
            Arrays.fill(row, -1);
        }
        mineMap = initializeMineMap(mineMap, mineCount);
        boolean gameEnded = false, gameWon = false;
        int col, row;

        System.out.println("Mine map: ");
        printMap(mineMap);
        System.out.println("======================================");
        printPlayersMap(playersMap);
        System.out.println("Welcome to minesweeper game!");

        int roundCount = 0;
        while (!gameEnded && !gameWon) {
            System.out.print("Enter row no: ");
            row = input.nextInt();

            while (!checkMatrixBounds(row, rowNumber)) {
                System.out.print("Invalid entry! Enter row no again: ");
                row = input.nextInt();
            }

            System.out.print("Enter column no: ");
            col = input.nextInt();

            while (!checkMatrixBounds(col, colNumber)) {
                System.out.print("Invalid entry! Enter column no again: ");
                col = input.nextInt();
            }

            if (mineMap[row][col] == 1) {
                System.out.println("GAME OVER!");
                gameEnded = true;
                break;
            } else {
                // count the number of neighbours of the chosen point
                // that contain a mine
                playersMap[row][col] = checkNeighbourPoints(row, col, mineMap);

            }
            roundCount++;
            if (roundCount == (rowNumber * colNumber) - mineCount) {
                System.out.println("You won the game!");
                break;
            }
            System.out.println("======================================");
            printPlayersMap(playersMap);
        }

    }

    public int[][] initializeMineMap(int[][] mineMap, int mineCount) {
        Random rand = new Random();

        int count = 0, choice = 0, x, y;
        int rowNumber = mineMap.length;
        int colNumber = mineMap[0].length;
        for (int i = 0; i < mineCount; i++) {
            x = rand.nextInt(rowNumber);
            y = rand.nextInt(colNumber);

            if (mineMap[x][y] == 1) {
                while (mineMap[x][y] == 1) {
                    x = rand.nextInt(rowNumber);
                    y = rand.nextInt(colNumber);
                }
                mineMap[x][y] = 1;
            } else {
                mineMap[x][y] = 1;
            }
        }
        /*
        for (int i = 0; i < mineMap.length; i++) {
            for (int j = 0; j < mineMap[0].length; j++) {
                choice = (int) Math.round(Math.random());

                if (count == mineCount) {
                    break;
                }
                if (choice == 1) {
                    mineMap[i][j] = 1;
                    count++;
                }
            }
            System.out.println();
        }

         */
        return mineMap;
    }

    public void printMap(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print("* ");
                }
                //System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printPlayersMap(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == -1) {
                    System.out.print("- ");
                } else {
                    System.out.print(map[i][j] + " ");
                }
                //System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean checkMatrixBounds(int choice, int bound) {
        return (choice >= 0 && bound > choice);
    }

    public int checkNeighbourPoints(int row, int col, int[][] mineMap) {
        // check neighbours of the chosen point
        int count = 0;

        int bottomMargin = rowNumber - row - 1;
        int leftMargin = col;
        int rightMargin = colNumber - col - 1;
        int topMargin = row;

        if (rightMargin > 0) {
            count += mineMap[row][col + 1];
        }
        if (leftMargin > 0) {
            count += mineMap[row][col - 1];
        }
        if (topMargin > 0) {
            count += mineMap[row - 1][col];
        }
        if (bottomMargin > 0) {
            count += mineMap[row + 1][col];
        }

        // check diagonal entries
        if (rightMargin > 0 && bottomMargin > 0) {
            count += mineMap[row + 1][col + 1];
        }
        if (rightMargin > 0 && topMargin > 0) {
            count += mineMap[row - 1][col + 1];
        }
        if (leftMargin > 0 && bottomMargin > 0) {
            count += mineMap[row + 1][col - 1];
        }
        if (leftMargin > 0 && topMargin > 0) {
            count += mineMap[row - 1][col - 1];
        }

        return count;
    }
}
