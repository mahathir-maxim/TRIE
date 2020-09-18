

/**
 *
 * @author maxim 2020
 */
import java.io.*;
import java.util.List;

public class Main {

	public static void main (String[] args) throws IOException
	{
		//System.out.println("Hello world");
		
		
		Trie t=new Trie();
                /*
		t.insert("word");
		t.insert("wordy");
		t.insert("able");
		t.insert("ball");
		t.insert("bally");
		t.insert("balled");
		t.insert("balls");
		t.insert("ballet");
		t.insert("baller");
		t.insert("back");
		t.insert("baby");
		t.insert("barn");
		t.find("word");
		t.find("wordy");
		t.find("able");
		t.find("ball");
		t.find("bally");
		t.find("balled");
		t.find("balls");
		t.find("ballet");
		t.find("baller");
		t.find("back");
		t.find("baby");
		t.find("barn");
                t.find("wor");
                t.find("abl");
                t.find("bar");
                t.find("bal");
                t.find("bac");
                t.find("bab");
                t.insert("ball");
                t.insert("ball");
                t.insert("ball");
                t.find("bal");
                List<String> a=t.predict("bal");
                
                for(int i=0; i<a.size();i++)
                {
                    System.out.println("Here<-------------->");
                    System.out.println("["+a.get(i)+"]");
                }
		//System.out.println(t.predict2("ba", 2));
		//System.out.println(t.predict("ba", 2));
		//System.out.println(t.predict("word", 2));
            
                t.add("word");
		t.add("wordy");
		t.add("able");
		t.add("ball");
		t.add("bally");
		t.add("balled");
		t.add("balls");
		t.add("ballet");
		t.add("baller");
		t.add("back");
		t.add("baby");
		t.add("barn");
                t.add("ball");
                t.add("ball");
                t.add("baller");
                t.add("baller");
                t.add("baller");
                t.add("baller");
                t.add("baller");
                t.add("bally");
                
                
                
                System.out.println("word: "+t.search("word"));
                System.out.println("wordy: "+t.search("wordy"));
                System.out.println("able: "+t.search("able"));
                System.out.println("ball: "+t.search("ball"));
                System.out.println("bally: "+t.search("bally"));
                System.out.println("balled: "+t.search("balled"));
                System.out.println("balls: "+t.search("balls"));
                System.out.println("ballet: "+t.search("ballet"));
                System.out.println("baller: "+t.search("baller"));
                System.out.println("back: "+t.search("back"));
                System.out.println("baby: "+t.search("baby"));
                System.out.println("barn: "+t.search("barn"));
                System.out.println("wor: "+t.search("wor"));
                System.out.println("abl: "+t.search("abl"));
                System.out.println("bar: "+t.search("bar"));
                System.out.println("bal: "+t.search("bal"));
                System.out.println("bac: "+t.search("bac"));
                System.out.println("bab: "+t.search("bab"));
                
                
                
                
                
                
                
                List<String> a=t.predict("bal",3);
                
                for(int i=0; i<a.size();i++)
                {
                    //System.out.println("Here<-------------->");
                    System.out.println(a.get(i));
                }*/
                
                t.insert("test");
                t.insert("apple");
                t.insert("tester");
                t.insert("ten");
                t.insert("testing");
                t.insert("tennant");
                t.insert("tenure");
                t.insert("tenacity");
                t.insert("tentacle");
                t.insert("tenantry");
                t.insert("tendency");
                t.insert("tent");
                t.insert("tenor");
                t.insert("tend");
                t.insert("tenders");
                t.insert("tend");
                t.insert("tending");
                t.insert("tender");
                t.insert("test");
                t.insert("test");
                t.insert("test");
                t.insert("quarintine");
                t.insert("quaffle");
                t.insert("quarrel");
                t.insert("quirrell");
                t.insert("quirrell");
                t.insert("quirrell");
                t.insert("quirrell");
                t.insert("quaffle");
                t.insert("quaffle");
                t.insert("quaffle");
                t.insert("quaffle");
                t.insert("quarintine");
                
                t.find("bal");
                t.find("qua");
                t.find("quaffle");
                
                List<String> a=t.predict("te",2);
                
                System.out.println("te: 2");
                for(int i=0; i<a.size();i++)
                {
                    
                    System.out.println(a.get(i));
                }
                
               
                System.out.println("==================================");
                
                List<String> b=t.predict("qu",3);
                
                System.out.println("qu: 3");
                for(int i=0; i<b.size();i++)
                {
                    
                    System.out.println(b.get(i));
                }
               
                System.out.println("==================================");
                
                List<String> c=t.predict("ap",3);
                
                System.out.println("ap: 3");
                
                for(int i=0; i<c.size();i++)
                {
                    
                    System.out.println(c.get(i));
                }
                
                 System.out.println("==================================");
                 
                List<String> d=t.predict("ma",3);
                
                System.out.println("ma: 3");
                
                for(int i=0; i<d.size();i++)
                {
                    
                    System.out.println(d.get(i));
                }
	}
	
	
}