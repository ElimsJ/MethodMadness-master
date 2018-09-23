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

        if(num3 == input)
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
        int length = word.length();
        if (length < 2)
        {
            return true;
        }
        else {
            if (word.charAt(0) != word.charAt(length - 1)) {
                System.out.println(false);
            }
            if (word.charAt(0) == word.charAt(length - 1)) {
                System.out.println(true);
                return true;
            }
        }
    return false;
    }
    public static int primeNumber(int num)
    {
        int x = 0;
        int i = 0;

        String primeNum ="";
        for(x =1; x<= num;x++)
        {
            int primeCounter = 0;
            for( i = x; i>=1;i--)
            {
                if(i%num==0)
                {
                    primeCounter = primeCounter + 1;
                }
                if(primeCounter==2)
                {
                    primeNum = primeNum + i +"";
                }
            }
        }


    }
}