package Methods;

import java.util.Scanner;

public class CharactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstSymbol = scanner.nextLine().charAt(0); //"a".charAt(0) -> 'a'
        char secondSymbol = scanner.nextLine().charAt(0);

        printSymbolsInRange(firstSymbol, secondSymbol);
    }

    //Write a method that receives two characters and prints all the characters in between them on a single line according to ASCII.


    public static void printSymbolsInRange (char firstSymbol, char secondSymbol) {
        //start from the symbol which is lower on the ASCII table
        //check which is the lower symbol

        if (firstSymbol < secondSymbol) {
            //starting from firstSymbol -> symbols in [firstSymbol; secondSymbol]
            for (char symbol = (char) (firstSymbol + 1); symbol < secondSymbol; symbol++) {
                System.out.print(symbol + " ");
            }
        } else { //firstSymbol >= secondSymbol
            //start from secondSymbol -> print all symbols in range [secondSymbol; firstSymbol]
            for (char symbol = (char) (secondSymbol + 1); symbol < firstSymbol; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }

}
