
import java.util.ArrayList;



/**
 *
 * @author maxim 2020
 */
import java.util.ArrayList;
import java.util.List;

public class Node 
{

        public char value;
        public boolean isEnd;
        public int count; 
        public ArrayList<Node> children;
        
        //////////////
        public Node parent;
        //////////////
	////Node [] children; 
	
	public Node () //default constructor
	{
                value = '0';
                isEnd=false;
                count=0;
                children= new ArrayList<Node>();
		////children = new Node [26];

	}
        
        
	
	/*
	public Node (char v, boolean end, int c, Node n) //overloaded constructor
	{
		value = v;
		isEnd=end;
		count=c;
		Arrays.fill(children, n);
	}
	*/
	
	public void setValue(char v) 
        {
            this.value=v;
        }
        
	public void setIsEnd(boolean end) 
        {
            this.isEnd=end;
        }
        
	public void setCount(int c) 
        {
            this.count=c;
            ////this.count+=c;
        }
	
	public char getValue () 
        {
            return this.value;
        }
        
	public boolean getIsEnd () 
        {
            return this.isEnd;
        }
        
	public int getCount () 
        {
            return this.count;
        }
        
	public ArrayList<Node> getChildren() 
        {
            return this.children;
        }
	
	public void setChildren()
	{
		
		for(int i=0; i<26; i++)
		{
                    Node e=new Node();
                    this.children.add(i,e);
			//this.children[i]= new Node();
		}
	}
	
	public Node addChild(char c, boolean endVal) 
        {
		int i=0;
		//this.children.
		//if(this.children.get(0)==null)
                if(this.children.isEmpty())
		{
                    setChildren();
		}
		
		
		while(this.children.get(i).value!='0')
		{
			if(this.children.get(i).value==c)
			{
                           if(endVal==true) //// ******************************
                            {
                                this.children.get(i).count++;
				
                            }
                            if(/*!children[i].getIsEnd()*/this.children.get(i).isEnd!=true) 
                            {
				this.children.get(i).isEnd=endVal; 
                            }
                            ////////////
                            System.out.println("Insert: " + this.children.get(i).value + "\t|| count: " + this.children.get(i).count + "\t|| endStatus: " + children.get(i).isEnd);
                            ////////////
                            return this.children.get(i);
			}
			
                    i++;
		}
		
		this.children.get(i).value=c; 
		
		this.children.get(i).isEnd=endVal; 
		if(endVal==true)
                {
                    this.children.get(i).count++;
                    
                }
		System.out.println("Insert: " + this.children.get(i).value + "\t|| count: " + this.children.get(i).count + "\t|| endStatus: " + children.get(i).isEnd);
		return this.children.get(i);
	}
        
        
        
        
        
        /**********************************/
        
        public Node(char c)
        {
            this.value=c;
            this.children=new ArrayList<Node>();
            count=0;
            this.isEnd=false;
        }
        
        public Node getChild(char c)
        {
            if (!this.children.isEmpty())
            {
                for (Node eachChild: this.children)
                {
                    if(eachChild.value==c)
                    {
                        //System.out.println("166: "+c);
                        return eachChild;
                    }
                }
            }
            return null;
        }
	
        public List<String> getWords()
        {
            List<String> list= new ArrayList<String>();
            //System.out.println("177: "+this.count);
            if(this.isEnd==true)
            {
                
                //System.out.println("179: "+this.toString());
                String s=this.count+toString();
                //System.out.println("182: "+s);
                list.add(s);
                //list.add(toString());
            }
            if (!this.children.isEmpty())
            {
                for(int i=0; i<this.children.size();i++)
                {
                    if (children.get(i)!=null)
                    {
                        list.addAll(children.get(i).getWords());
                    }
                }
            }
            return list;
        }
        
        public String toString()
        {
            
            if(parent==null)
            { 
               // System.out.println("199<-------------->");
                return "";
            }
            
            {
                return parent.toString()+new String(new char[]{value});
            }
        }
}



