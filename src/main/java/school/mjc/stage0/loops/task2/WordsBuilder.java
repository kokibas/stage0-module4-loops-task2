package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {

        int i = 0 ;
        while (i <= chars.length ){
           char phrase  = chars[i];
           System.out.println(phrase);
           i++;
        }
    }
}
