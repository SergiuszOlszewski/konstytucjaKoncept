package konstytucja;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class OptionParser {
    private String path;
    private char printType;
    private List<Integer> articlesToPrint = new ArrayList<>();

    public String getPath(){
        return this.path;
    }

    public char getPrintType(){
        return this.printType;
    }

    public List<Integer> getArticlesToPrint(){
        return this.articlesToPrint;
    }

    public OptionParser getUserOptions(String[] args){
        return new OptionParser().parse(args);
    }

    private OptionParser parse(String[] args){
        if(args.length <3 || args.length > 4)
            throw new IllegalArgumentException(" Podano zle argumenty " + args.length + " (wymagane 3 lub 4)" );

        OptionParser options = new OptionParser();
        int i=0;
        do{
            if(!(options.findOption(args[i], i)))
                throw new IllegalArgumentException(" Nie mozna odnalezc pliku " + args[i]);
            i++;
        } while(i==args.length);

        return options;
    }

    private boolean findOption(String arg, int i) throws PatternSyntaxException{
        if(i==0){
            Pattern pattern = Pattern.compile("[a-z [A-Z]]");
            if(pattern.matcher(arg).find()) {
                this.path = arg;
                return true;
            }

            return false;
        }

        if(i==1){
            Pattern pattern = Pattern.compile("-[ra]]");
            if(pattern.matcher(arg).find()) {
                this.printType = arg.charAt(i);
                return true;
            }

            return false;
        }

        if(i==2 || i==3){
            Pattern pattern = Pattern.compile("[0-9]");
            if(pattern.matcher(arg).find()) {
                this.articlesToPrint.add(0, Integer.valueOf(arg));
                return true;
            }

            return false;
        }

        return false;
    }

}
