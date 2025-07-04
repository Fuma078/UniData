
import java.io.*;
import java.util.*;

class Data {
            private String rank1;
            private String rank2;
            private String uniName;

            public Data(String rank1, String rank2, String uniName){
                this.rank1 = rank1.strip();
                this.rank2 = rank2.strip();
                this.uniName = uniName.strip();
            }    

            public String getRank1(){
                return rank1;
            }
                
            public String getRank2(){
                return rank2;
            }
            
            public String getuniName(){
                return uniName;
            }

            @Override
            public String toString(){
                return rank1 + " " + rank2 + " " + uniName;
            }
                        
        }

public class UniData {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        /*  Part 1) Data Set Information and Attribute Information: 
            1) What are the meta data for the given data? please list all

            2) List all the data type of each attribute.

            */

            // Chiang Mai University

        // Part 2 

        // String inputFile = "2024 QS World University Rankings 1.1 (For qs.com).csv";
        // String outputFile = "QS_World University Ranking 2024.csv";
        // UniData processor = new UniData();

        Scanner file = new Scanner(new File("2024 QS World University Rankings 1.1 (For qs.com).csv"));
        Scanner input = new Scanner(System.in);
        Vector<Data> vec = new Vector<>();

        for(int i = 0; i < 2; i++){
            if(file.hasNextLine()){
                file.nextLine();
            }
        }

        while(file.hasNextLine()){
            String line = file.nextLine();
            StringTokenizer token = new StringTokenizer(line,",");
            token.nextToken();
            vec.addElement(new Data(token.nextToken(), token.nextToken(), token.nextToken()));
        }

        file.close();

        input.close();

    }

}