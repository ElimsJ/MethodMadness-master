package SJiang;

public class SJiangLib
{
    public static String cutOut(String mainString, String subString) {
        String testWord = mainString.substring(0, mainString.indexOf(subString));
        testWord = testWord + mainString.substring(mainString.indexOf(subString) + subString.length());
        System.out.println(testWord);
        return testWord;
    }
}
