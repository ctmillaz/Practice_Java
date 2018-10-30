package com.Practice.Java;

public class Main {

    public static void main(String[] args) {


        //## If keyword and code block
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //scope is information inside of a code block.
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

/*
        if(score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if(score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }
*/


       /* int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;

        if(gameOver) {
           int FinalScore = secondScore + (secondLevelCompleted * secondBonus);
           System.out.println("Your FinalScore was " + FinalScore);
        }*/

      score = 10000;
      levelCompleted = 8;
      bonus = 200;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }



        /*//##Statements, Whitespace, and Indenting

        //The full line is a statement.  The expression and keyword is the statement.  Sometimes a statement
        // does not have keyword.  Sometimes a statement is on more than one line.
        //Java ignores the whitespace
        int             myVarialbe =
                50
                ;


        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");

        System.out.println("This is" +
                " another" +
                " still more");

        int anotherVariable = 50; myVariable--; System.out.println("This is another one");*/



       /* //## Keywords and Expressions
        //https://en.wikipedia.org/wiki/List_of_Java_keywords

        //blue highlighted words are keywords;
        //everything that is not a keyword is part of the expression.  With the exception of () and {} and ;
        //the word after a keyword is the variable.
        //Numbers are literals
        //String, char, double, float, byte,short, int, long, boolean are all primitives.
        //The operators are  +, -, *, /, =, >=, <=, ++, -- and more.
        //Operands are literals on either side of an operator like 10 + 20; 10 and 20 are operands.

        double kilometeres = (100 * 1.609344);
        int highScore = 50;

        if(highScore == 50){
            System.out.println("This is an expression");
        }


*/

   /*     //##Operators

        int result = 1 + 2;
        System.out.println("1 + 2= " + result);

        int previousResult = result;
        result = result -1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result +=2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if(isAlien == false)
            System.out.println("It is not an alien!");

        int topScore = 80;
        if(topScore >= 100)
            System.out.println("You got the high score!");

        int secondTopScore = 81;
        if((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than top score and less then 100");

        if((topScore > 90) || (secondTopScore <=90))
            System.out.println("One of these tests is true");


        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true: false;
        if(wasCar)
            System.out.println("wasCar is true");

        double firstValue = 20d;
        double secondValue = 80d;
        double sumVariable = (firstValue + secondValue) * 25;
        System.out.println(sumVariable);
        double remainderVariable = sumVariable % 40d;
        System.out.println(remainderVariable);
        if(remainderVariable <= 20)
            System.out.println("Total was over the limit");
        //http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html*/


        //##Strings

        /*String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9 2015";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);*/



      /*  //##Char and Boolean

        // width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("Unicode output was: " + myChar) ;
        //unicode-table.com/en/#control-character

        boolean myBoolean = true;
        boolean isMale = true;

        char registeredSymbol = '\u00AE';
        System.out.println("Registered symbol: "+ registeredSymbol);*/



        /*//##Float and Double

        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3 ;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        double numPounds = 200d;

        double convertedKilograms =  numPounds * 0.45359237d;

        System.out.println("Kilogram = " + convertedKilograms);
        //90.7185
        double pi = 3.1415927d;*/


        //##Primitive Data Types

        /*byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);*/

        /*// Int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte)(myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        //short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        // long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;*/


        //##Hello World

        /*System.out.println("Hello, Me!");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int myChallenge = 1000 - myTotal;

        System.out.println(myChallenge);*/
    }
}
