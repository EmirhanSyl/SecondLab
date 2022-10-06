package com.blackflower.secondlab;


public class SecondLab {

    public static void main(String[] args) {
        
        //---------------Find The Reverse Version Of An 2 Digit Int(With Mod Operator and Without Mod Operator)---------------
        int number = 34;
        System.out.println("The reversed version of " + number + " is "+ ReverseNumber(number));       
        System.out.println("The reversed version of " + number + " is "+ ReverseNumberWithoutMod(number));  
        
        //---------------------- ------Check The Number is Even Or Odd---------------------------
        System.out.println(number + " is "+ EvenOrOdd(number));   
        
        //----------------------Find The Max Number----------------------
        int[] numbers = {5, 8, 6};
        System.out.println("The biggest number between given numbers is "+ FindTheBiggerNumber(numbers[0], numbers[1], numbers[2])); 
        System.out.println("The biggest number in given array is "+ FindTheBiggerNumberInArray(numbers)); 
        
        //--------------------------------------------------------------
        System.out.println("Is given number equals to vowel letter: "+ IsThereAnyVowelCharacter(65)); 
        
        //----------------------------Find How Many Characters Between 2 Letters -----------------------------------
        char firstLetter = 'G';
        char secLetter = 'A';        
        System.out.println("There is "+ FindHowManyCharactersBetweenGivenOnes(firstLetter, secLetter) + " characters between " + firstLetter + " and " + secLetter); 
    
        //---------------------------Display Following Characters Of Given Int-----------------------------
        for (int i = 0; i < DisplayFollowingChars(75).length; i++) {
            System.out.println(DisplayFollowingChars(75)[i]);
        }
    }
    
    public static int ReverseNumber(int number){
        int lastDigit = number % 10;        
        int firstDigit = (number - lastDigit) / 10;        
        int reverseNum = (lastDigit * 10) + firstDigit;
        
        return reverseNum;
    }
    
    public static int ReverseNumberWithoutMod(int number){
        int lastDigit = (number / 10) * 10;
        lastDigit = number - lastDigit;
        
        int firstDigit = (number - lastDigit) / 10;        
        int reverseNum = (lastDigit * 10) + firstDigit;
        
        return reverseNum;
    }
    
    public static String EvenOrOdd(int number){
        
        int digitState = number % 2;
        
        return (digitState == 1) ? "odd" : "even";
    }
    
    public static int FindTheBiggerNumber(int firstNum, int secNum, int thirdNum){
        int firstResult = (firstNum > secNum) ? firstNum : secNum;
        
        return (firstResult > thirdNum) ? firstResult : thirdNum;
    }
    
    public static int FindTheBiggerNumberInArray(int[] numbers){
        int maxVal = 0;
        for (int i = 0; i < numbers.length; i++) {
            maxVal = (maxVal > numbers[i]) ? maxVal : numbers[i];
        }
        
        return maxVal;
    }
    
    public static boolean IsThereAnyVowelCharacter(int num){
        char[] vowels = {'A', 'E', 'U', 'O', 'I'};        
        char givenChar = (char)num;
        
        boolean isIncluded = false;
        for (int i = 0; i < vowels.length; i++) {
            isIncluded = (vowels[i] == givenChar);
            
            if (isIncluded) 
                break;            
        }
        
        return isIncluded;
    }
    
    public static int FindHowManyCharactersBetweenGivenOnes(char firstChar, char secChar){
        int first = (int)firstChar;
        int sec = (int)secChar;
        
        int result = sec - first;
        if (result < 0) {
            result *= -1;
        }
        result -= 1;
        
        return result;
    }
    
    public static char[] DisplayFollowingChars(int number){
        char[] output = new char[5];
        for (int i = 0; i < 5; i++) {
            number++;
            output[i] = (char)number;
        }
        return output;
    }
}
