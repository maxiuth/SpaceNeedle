// Uyen Tran
// 10/14/2020
// CSE 142 AU20
// TA: Rinav Kasthuri
// Take-home Assessment 2: SpaceNeedle

// This program will print out a text image of the Seattle's Space Needle

public class SpaceNeedle {
	public static final int SIZE = 4;
    public static void main(String[] args) {
        drawSpike();
        drawTopPart();
        drawBottomPart();
        drawSpike();
        drawBody();
        drawTopPart();
    }

// Draw the spikes on top of the Space Needle
    public static void drawSpike() {
        for (int line = 1; line <= SIZE; line++) {
            for (int space = 1; space <= SIZE * 3; space++) {
                System.out.print(" ");
            }
            
            System.out.println("||");
        }
    }

// Draw the top pattern 
    public static void drawTop() {
        for (int line = 1; line <= SIZE; line++) {
            for (int space = 1; space <= -3 * line + SIZE * 3; space++) {
                System.out.print(" ");
            }

            System.out.print("__/");

            for (int colon = 1; colon <= 3 * line - 3; colon++) {
                System.out.print(":");
            }

            System.out.print("||");

            for (int colon = 1; colon <= 3 * line - 3; colon++) {
                System.out.print(":");
            }  

            System.out.println("\\__");
        }
    }

// Draw the border text pattern of the Space Needle
    public static void drawBorder() {    
        System.out.print("|");
        for (int quotation = 1; quotation <= SIZE * 3; quotation++) {
            System.out.print("\"\"");
        }

        System.out.println("|");
    }

// Draw the Top Half Pattern of the Space Needle
    public static void drawTopPart() {
        drawTop();
        drawBorder();
    }

// Draw the Bottom Half Pattern of the Space Needle
    public static void drawBottomPart() {
        for (int line = 1; line <= SIZE; line++) {
            for (int space = 1; space <= 2 * line - 2; space++) {
                System.out.print(" ");
            }

            System.out.print("\\_/");

            for (int hands = 1; hands <= -2 * line + SIZE * 3; hands++) {
                System.out.print("\\/");
            }

            System.out.println("\\_/");
        }
    }

// Draw the body of the Space Needle
    public static void drawBody() {
        for (int line = 1; line <= SIZE * SIZE; line++) {
            for (int space = 1; space <= 2 * SIZE + 1; space++) {
                System.out.print(" ");
            }

            System.out.print("|");

            for (int percent = 1; percent <= SIZE - 2; percent++) {
                System.out.print("%");
            }

            System.out.print("||");
            
            for (int percent = 1; percent <= SIZE - 2; percent++) {
                System.out.print("%");
            }

            System.out.println("|");
        }
    }
}
