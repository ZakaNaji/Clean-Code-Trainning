import java.io.StringWriter;

public class FizzBuzz {
    private int startIndex;
    private int endIndex;


    public FizzBuzz(int start, int end){
        startIndex = start;
        endIndex = end;
    }

    public void generate(StringWriter out){
        for(int index = startIndex; index < endIndex+1; index++){
            out.write(index + ": " + indexIsFizz(index) + indexIsBuzz(index) + "\n");
        }
    }

    public String indexIsFizz(int indexToEvaluate){
        String returnedString = (indexToEvaluate%3 == 0)? "Fizz":"";
        return returnedString;
    }

    public String indexIsBuzz(int indexToEvaluate){
        String returnedString = (indexToEvaluate%5 == 0)? "Buzz":"";
        return returnedString;
    }
}

