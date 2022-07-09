package ca.ciccc.wmad.assignment5.question3;

public class Test {

    public void test(){
        Book book= new Book("Romeo and Juliet", "SHAKESPEARE");
        String content1 = "Most books about the history of humanity pursue either a historical or " +
                "a biological approach, but Dr. Yuval Noah Harari breaks the mold with this highly original book " +
                "that begins about 70,000 years ago with the appearance of modern cognition. " +
                "From examining the role evolving humans ago  have played in the global ecosystem " +
                "to charting the rise of empires, Sapiens integrates history and science " +
                "to reconsider accepted narratives, connect  past developments with contemporary concerns, " +
                "and examine specific events within the context of of larger ideas.";

        Page page1= new Page(1, content1);
        String content2 = "Dr. Harari also compels us to look ahead, " +
                "because over the last few decades humans have begun to bend laws of natural selection " +
                "that have governed life for the past four billion years. We are acquiring the ability " +
                "to design not only the world around us, but also ourselves. Where is this leading us, " +
                "and what do we want to become?";

        Page page2=new Page(2,content2);

        book.addPage(page1);
        book.addPage(page2);

        System.out.println("...All Words...");
        book.printAllWordOccurrences();
        //System.out.println("...All Words...");

        System.out.println(".....Specific Word......");
        book.printParticularWordOccurrences("of");
        //System.out.println(".....Specific Word......");

    }
}
