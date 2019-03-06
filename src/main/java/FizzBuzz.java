import java.io.StringWriter;

public class FizzBuzz {
    private int startIndex;
    private int endIndex;
    private final int FIZZ_VALUE = 3;
    private final int BUZZ_VALUE = 5;


    public FizzBuzz(int start, int end){
        startIndex = start;
        endIndex = end;
    }

    public void generate(StringWriter out){
        for(int index = startIndex; index < endIndex+1; index++){
            out.write(generatedLine(index));
        }
    }

    public String indexIsFizzText(int indexToEvaluate){
        String returnedString = (indexToEvaluate%FIZZ_VALUE == 0)? "Fizz":"";
        return returnedString;
    }

    public String indexIsBuzzText(int indexToEvaluate){
        String returnedString = (indexToEvaluate% BUZZ_VALUE == 0)? "Buzz":"";
        return returnedString;
    }

    public String generatedLine(int index){
        return index + ": " + indexIsFizzText(index) + indexIsBuzzText(index) + "\n";
    }
}

