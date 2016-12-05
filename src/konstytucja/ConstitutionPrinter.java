package konstytucja;

import java.util.List;

public class ConstitutionPrinter {
    public void printWhatUserWants (String[] args){
        OptionParser oP = new OptionParser().getUserOptions(args);

        List<Integer> list = oP.getArticlesToPrint();
        char type = oP.getPrintType();
        String path = oP.getPath();

        System.out.println(list.get(0));
        System.out.println(type);
        System.out.println(path);
    }
}
