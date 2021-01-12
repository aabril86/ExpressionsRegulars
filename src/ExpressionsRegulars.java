import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionsRegulars {

    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("E:\\santako.txt");
        Scanner scanner = new Scanner(file);

        Pattern PareNoel = Pattern.compile("\\*<]:-DOo");
        Pattern Ren = Pattern.compile(">:o\\)");
        Pattern Follet = Pattern.compile("[^\\*]<]:-D");

        String linea;
        int p=0, r=0, f=0;
        while (scanner.hasNextLine()){
            linea = scanner.nextLine();

            //System.out.println(linea);

            Matcher mpn = PareNoel.matcher(linea);
            Matcher mr = Ren.matcher(linea);
            Matcher mf = Follet.matcher(linea);


            while(mpn.find()) {p++;}
            while(mr.find()){r++;}
            while(mf.find()){f++;}


            if(p>0) System.out.print("Pare Noel (" + p + ") ");
            if(r>0) System.out.print("Ren (" + r + ") ");
            if(f>0) System.out.print("Follet (" + f + ") ");
            System.out.println();

            if(p==0 && r==0 && f==0) System.out.println();

            p=0;
            r=0;
            f=0;
        }

    }
}
