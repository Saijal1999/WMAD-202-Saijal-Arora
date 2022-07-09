package ca.ciccc.wmad.assignment5.question3;

import java.util.HashMap;

public class Page {
    private final int pagenumber;

    private final String content;

    public Page(int pagenumber, String content){
        this.pagenumber=pagenumber;
        this.content=content;
    }

    public int getPagenumber(){
        return this.pagenumber;
    }

    public String[] getWords(){
        String contentReplacedSymbolsWithBlank = this.content.replaceAll("[/,.?!—\\-]|\s{2,}", " ");
        return contentReplacedSymbolsWithBlank.split(" ");
    }

    public HashMap<String, Integer> getAllWordOccurrences(){
        HashMap<String , Integer> OccurencePerPage= new HashMap<>();
        for(String Word: this.getWords()){
            if(OccurencePerPage.containsKey(Word)){
                OccurencePerPage.put(Word,OccurencePerPage.get(Word)+1);
            }
            OccurencePerPage.put(Word,1);
        }
        return OccurencePerPage;
    }




        // for(String )
        //}

    }
