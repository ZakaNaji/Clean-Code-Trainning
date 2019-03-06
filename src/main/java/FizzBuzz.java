import java.io.StringWriter;

public class FizzBuzz {
    private int startIndex;
    private int endIndex;
    private final int fizzValue = 3;
    private final int buzzValue = 5;


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
        String returnedString = (indexToEvaluate%fizzValue == 0)? "Fizz":"";
        return returnedString;
    }

    public String indexIsBuzzText(int indexToEvaluate){
        String returnedString = (indexToEvaluate%buzzValue == 0)? "Buzz":"";
        return returnedString;
    }

    public String generatedLine(int index){
        return index + ": " + indexIsFizzText(index) + indexIsBuzzText(index) + "\n";
    }
}

