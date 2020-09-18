

/**
 *
 * @author maxim 2020
 */
import java.util.ArrayList;

import java.util.List;

public class Trie 
{

	public Node root=new Node();
	
	
	public Trie () //default constructor
	{
		//root = new Node ('0', false, 0);
		this.root.value='3';//signifies its a root
		this.root.setChildren();
	}
		
	/*public Trie () //overloaded constructor
	{
		
	}*/
	

	
	public void insertCH(String str)
	{	
            str=str.toLowerCase();
            boolean endVal =false;
            Node pointer=new Node();
		
            for (int i=0; i<str.length(); i++)
            {
                if(i==0)
		{
                    pointer =root.addChild(str.charAt(i), endVal);
		}
                else if (i==str.length()-1)
                {
                    endVal=true;
                    pointer = pointer.addChild(str.charAt(i), endVal); 
                }			
                else  
		{	
                    
                    pointer = pointer.addChild(str.charAt(i), endVal); 	  
		}				
            }		
                System.out.println();
                System.out.println();
                System.out.println();
	}
	
	
	public boolean findCH (String str)
	{
            str=str.toLowerCase();
            Node checker= new Node();
            Node following = new Node();
            Boolean found=false;
		
            for(int i=0; i<26; i++)
            {
              	
                if(this.root.children.get(i).value==str.charAt(0))
                {
                    System.out.println("for char: "+ this.root.children.get(i).value);
                    following=this.root.children.get(i);
                    
                    checker=this.root.children.get(i);
                    
                    break;
                    
		}					
	    }
		
            for(int i=1; i< str.length(); i++)
            {		
		int y=0;
                found = false;
		while(checker.value!='0')
		{				
                    if(checker.value == str.charAt(i))
                    {
                        System.out.println("for char: "+ str.charAt(i));
                        found=true;
                        
                        following=checker;
                        
                        if (!checker.children.isEmpty())
                        {
                            checker=checker.children.get(0);
                        }
                        
                        break;
                    }
                    checker=following.children.get(y); 
                    y++;
		}
			
			
		if(!found) 
                {
                    break;
                }
            }
		
            if(found)
            {
		if(!following.isEnd)
                {
                    found =false; ; 
                }
		
            }
		
            System.out.println("Search for: "+str + "  ||\tResult: " + found);
            return found;
	}
        
        /******************************************************************/
        
        public List<String> predict(String prefix, int n)
        {
            Node last=root;
            for(int i=0; i<prefix.length();i++)
            {
               // System.out.println("Here 142<-------------->");
                last=last.getChild(prefix.charAt(i));
                if(last==null)
                {
                    
                    return new ArrayList<String>();
                }
            }
            //return last.getWords();
            List<String> wordList=last.getWords();
            List<String> outList=sort(wordList, n);
            return outList;
            
        }
        
        public List<String> sort(List<String> str, int num)
        {
            ArrayList <String> sortedL=new ArrayList<String>();
            ArrayList <String> modified=new ArrayList<String>();
            String temp;
            for (int j=0; j<str.size(); j++)
            {
                for (int i=j+1;i<str.size();i++)
                {
                    if(str.get(i).compareTo(str.get(j))>0)
                    {
                        temp=str.get(j);
                        str.set(j,str.get(i));
                        str.set(i, temp);
                    }
                }
                //System.out.println("SORT:(before change) "+str.get(j));
                String changed=str.get(j);
                int x=firstChar(changed);
                changed=changed.substring(x);
                //System.out.println("SORT:(after change) "+changed);
                sortedL.add(changed);                
            }
            if (sortedL.size()==0)
            {
                System.out.println("No prediction could be made for lack of data!!!");
                return sortedL;
            }
            if (sortedL.size()<num)
            {
                return sortedL;
            }
            
            for(int i=0;i<num;i++)
            {
                modified.add(sortedL.get(i));
            }
            return modified;
        }
        
        public int firstChar(String str)
        {
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)>=97 && str.charAt(i)<=122)
                {
                    return i;
                }
            }
            return -1;
        }
        
        public void insert(String str)
        {
            if(lookFor(str)==true)
            {
                return;
            }
            Node currentNode= root;
            Node pre;
            for(char c:str.toCharArray())
            {
                pre= currentNode;
                Node child=currentNode.getChild(c);
                if(child!=null)
                {
                    currentNode=child;
                    child.parent=pre;
                    
                }
                else
                {
                    currentNode.children.add(new Node(c));
                    currentNode=currentNode.getChild(c);
                    currentNode.parent=pre;
                }
                
            }
            currentNode.isEnd=true;
            currentNode.count++;
            System.out.println("Insert: " + str + "\t|| count: " + currentNode.count + "\t|| endStatus: " + currentNode.isEnd);
        }
        
        public boolean find(String str)
        {
            Node currentNode=root;
            for(char c: str.toCharArray())
            {
                if(currentNode.getChild(c)==null)
                {
                    System.out.println("str: "+str+" found status is false not even prefix");
                    return false;
                }
                else
                {
                    currentNode=currentNode.getChild(c);
                }
            }
            if(currentNode.isEnd==true)
            {
                System.out.println("str: "+str+" found status is true");
                return true;
            }
            System.out.println("str: "+str+" found status is false");
            return false;
        }
        
        public boolean lookFor(String str)
        {
            Node currentNode=root;
            for(char c: str.toCharArray())
            {
                if(currentNode.getChild(c)==null)
                {
                    return false;
                }
                else
                {
                    currentNode=currentNode.getChild(c);
                }
            }
            if(currentNode.isEnd==true)
            {
                currentNode.count++;
                System.out.println("Insert: " + str + "\t|| count: " + currentNode.count + "\t|| endStatus: " + currentNode.isEnd);
                return true;
            }
            return false;
        }
        
}