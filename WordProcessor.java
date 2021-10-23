//Daniel Li
//All 10/10 cases passed

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WordProcessor {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("word.in"));
        //Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        String[] words = new String[N];
        for(int i = 0; i < N; i++){
            words[i] = in.next();
        }
        in.close();
        PrintWriter out = new PrintWriter(new File("word.out"));
        int currentLine = 0;
        for(int i = 0; i < N; i++){
            if (currentLine + words[i].length() <= K){
                currentLine = (words[i].length()) + currentLine;
                if(i < N - 1 && currentLine + words[i + 1].length() > K){
                    out.print(words[i]);
                }else if(i != N - 1){
                    out.print(words[i] + " ");
                }else{
                    out.println(words[i]);
                }
            }else{
                out.print("\n");
                currentLine = (words[i].length());
                if(i < N - 1 && currentLine + words[i + 1].length() > K){
                    out.print(words[i]);
                }else if(i != N - 1){
                    out.print(words[i] + " ");
                }else{
                    out.println(words[i]);
                }
            }
        }
        out.close();
    }
}
