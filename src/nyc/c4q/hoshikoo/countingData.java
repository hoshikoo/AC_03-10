package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/10/15.
 */
public class countingData {

    public static void main(String[] args){
        String GraceHopperQuote = "We must include in any language with which we hope to describe complex data-processing situations the capability for describing data. We must also include a mechanism for determining the priorities to be applied to the data. These priorities are not fixed and are indicated in many cases by the data.  Thus we must have a language and a structure that will take care of the data descriptions and priorities, as well as the operations we wish to perform. If we think seriously about these problems, we find that we cannot work with procedures alone, since they are sequential. We need to define the problem instead of the procedures. The Language Structures Group of the Codasyl Committee has been studying the structure of languages that can be used to describe data-processing problems. The Group started out by trying to design a language for stating procedures, but soon discovered that what was really required was a description of the data and a statement of the relationships between the data sets. The Group has since begun writing an algebra of processes, the background for a theory of data processing.  Clearly, we must break away from the sequential and not limit the computers. We must state definitions and provide for priorities and descriptions of data. We must state relationships, not procedures.";
        String text = "data";
        char data0 = text.charAt(0);
        char data1 = text.charAt(1);
        char data2 = text.charAt(2);
        char data3 = text.charAt(3);
        int count=0;

        for (int i = 0; i < GraceHopperQuote.length(); i = i+1){
            if(GraceHopperQuote.charAt(i)==data0){
                if(GraceHopperQuote.charAt(i+1)==data1){
                    if(GraceHopperQuote.charAt(i+2)==data2){
                        if(GraceHopperQuote.charAt(i+3)==data3){
                            count= count+1;
                        }
                    }
                }
            }
        }
        System.out.print(count);
    }
}
