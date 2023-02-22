import java.util.*;
class collection
  {
    public static void main(String args[])
    {
      ArrayList<String> alist=new ArrayList<String>();
 
      alist.add("Ajay");
      alist.add("Suhel");
      alist.add("Jyothi");
      alist.add("Sourav");
      alist.add("Swammy");
      alist.add(3,"Nagendra");
      System.out.println(alist);        
   
    Iterator itr=alist.iterator();  
      while(itr.hasNext()){  
       System.out.println(itr.next());  
      }         
    }
  }
