package SJiang;

public class SJiangLib
{
    public static String cutOut(String mainStr, String subStr)
    {
        String testWord = mainStr.substring(0, mainStr.indexOf(subStr));//the first word until it sense the substring word
        testWord = testWord + mainStr.substring(mainStr.indexOf(subStr) + subStr.length());//skipping the substring and adding the word after substring to the word
        System.out.println(testWord);//display
        return testWord;
    }
    public static boolean isFibonnaci(int num)
    {
        int input = num;
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        //fibonnaci basics
        while (num3 < input)//until it reaches the number
        {
            num3 = num1 + num2;//num +
            num1 = num2;
            num2 = num3;
        }

        if(num3 == input)//if the input  is one of the fibonnaci numbers
        {
            System.out.println(true);
            return true;
        }
        else if (num3 != input)
        {
            System.out.println(false);
        }
        return false;
    }
    public static boolean isPalindrome(String word) {
        int length = word.length();//making it easier to use
        if (length < 2)//if the word is only by it self  it true
        {
            return true;
        }
        else {
            if (word.charAt(0) != word.charAt(length - 1)) {
                System.out.println(false);//if the beginning word does not equal the last word it false;
            }
            if (word.charAt(0) == word.charAt(length - 1)) {//if the beginning word does not equal the last word it true;
                System.out.println(true);
                return true;
            }
        }
    return false;
    }
    public static String dateStr(String date)//mm/dd-yyyy
    {
        String day = date.substring(3,5);//the place value of the string for day, making day into string
        String month = date.substring(0,2);//the place value of the string for month, making month into string
        String year = date.substring(6, date.length());//the place value of the string for year, making month into string
        System.out.println(day + "-" + month + "-" + year);
        return day + "-" + month + "-" + year;//return in the dd-mm-yyyy format
    }
    public static int sumUpTo(int numberToSum)
    {
        int sum = 0;
        int timesToAdd = 0;
        while(timesToAdd<= numberToSum)//when the num is less or equal the the input
        {
            sum = sum + timesToAdd;// the sum will be the previous sum + the next integer
            timesToAdd = timesToAdd +1;

        }
        System.out.println(sum);//display sum
        return sum;
    }
}