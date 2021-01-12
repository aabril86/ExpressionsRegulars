import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExpressionsNoRegulars {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("E:\\santako.txt");
        Scanner scanner = new Scanner(file);
        String linea;

        int p=0, r=0, f=0;
        int index=0;
        String linea2;

        while(scanner.hasNextLine()){
            linea = scanner.nextLine();
            //pare noel
            if(linea.contains("*<]:-DOo")){
                p++;
                index = linea.indexOf("*<]:-DOo");
                linea2 = linea.substring(index);
                while(index != -1){
                    linea2 = linea2.substring(index);
                    if(linea2.contains("*<]:-DOo")){
                        p++;
                        index = linea2.indexOf("*<]:-DOo") + 1;
                    }
                    else{
                        break;
                    }
                }

            }

            index = 0;

            //ren
            if(linea.contains(">:o)")){
                r++;
                index = linea.indexOf(">:o)");
                linea2 = linea.substring(index);
                while(index != -1){
                    linea2 = linea2.substring(index);
                    if(linea2.contains(">:o)")){
                        r++;
                        index = linea2.indexOf(">:o)") + 1;
                    }
                    else{
                        break;
                    }
                }
            }

            index = 0;


            //follet
            if(linea.contains("<]:-D")){
                f++;
                index = linea.indexOf("<]:-D");
                linea2 = linea.substring(index);
                while(index != -1){
                    linea2 = linea2.substring(index);
                    if(linea2.contains("<]:-D")){
                        f++;
                        index = linea2.indexOf("<]:-D") + 1;
                    }
                    else{
                        break;
                    }
                }
            }

            index= 0;
            f=f-p;
            if(p>0) System.out.print("Pare Noel (" + p + ") ");
            if(r>0) System.out.print("Ren (" + r + ") ");
            if(f>0) System.out.print("Follet (" + f + ") ");
            System.out.println();

            if(p==0 && r ==0 && f==0) System.out.println();

            p=0;
            r=0;
            f=0;

        }
    }
}
