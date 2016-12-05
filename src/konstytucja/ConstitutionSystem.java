package konstytucja;

import java.io.IOException;
import java.util.regex.PatternSyntaxException;

public class ConstitutionSystem {
    public static void main(String[] args) {
    	Constitution result = new Constitution();
    	result.chapters = new FileParser().parse("konstytucja.txt");
    }
}
