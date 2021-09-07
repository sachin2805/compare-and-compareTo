//------------- Multi Object -------------

// Program 1 --- Using 2 Generic Argument / Object -> Line Number ->11
// Program 2 ---- Using 3 Generic Argument / Object -> Line Number ->113
package compareTo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// Program 1 :
/*class Data<K,V>
{
	private K key;
	private V value;
	public Data(K key, V value) {
		
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "key=" + key + ", value=" + value ;
	}
	
	
	
}
public class Multi_object {
public static void main(String args[])
{
	
	Comparator<Data<Integer , String>> ck=new Comparator<Data<Integer , String>>(){

		@Override
		public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
			
			// For decending order of key
			if(o1.getKey()<o2.getKey())
				return 1;
			if(o1.getKey()>o2.getKey())
				return -1;
			return 0;
		
			    // // For Accending order of key
//						if(o1.getKey()>o2.getKey())
//							return 1;
//						if(o1.getKey()<o2.getKey())
//							return -1;
//						return 0;
						
			
	}
	};
	
	Comparator<Data<Integer , String>> cv=new Comparator<Data<Integer , String>>(){
	public int compare(Data<Integer, String> obj1, Data<Integer, String> obj2) {
		
		//System.out.println("In compare of Length");
		if (obj1.getValue().length() < obj2.getValue().length()) {
			return -1;
		} else if (obj1.getValue().length() > obj2.getValue().length()) {
			return 1;
		} else
			return 0;
	}
};
	
	Set<Data<Integer, String>> ts = new TreeSet<>(ck);
	
	ts.add(new Data<Integer , String>(1,"SachinPowar"));
	ts.add(new Data<Integer , String>(8,"Akash"));
	ts.add(new Data<Integer , String>(9,"SurajNerwane"));
	ts.add(new Data<Integer , String>(4,"Dev"));
	ts.add(new Data<Integer , String>(2,"SagarPol"));
	
	for(Data<Integer , String> x : ts)
	{
		System.out.println(x);
	}
	
}
}*/

/*OUTPU :
// if --> Set<Data<Integer, String>> ts = new TreeSet<>(ck);
   o/p :
   
key=9, value=SurajNerwane
key=8, value=Akash
key=4, value=Dev
key=2, value=SagarPol
key=1, value=SachinPowar

// if --> Set<Data<Integer, String>> ts = new TreeSet<>(cv);
  o/p :
  
key=4, value=Dev
key=8, value=Akash
key=2, value=SagarPol
key=1, value=SachinPowar
key=9, value=SurajNerwane
 */



//Program 2 :

class Data<K,V,T>
{
private K key;
private V value;
private T type;
public Data(K key, V value,T type) {
	
	this.key = key;
	this.value = value;
	this.type = type;
}
public K getKey() {
	return key;
}
public V getValue() {
	return value;
}
public T getType()
{
	return type;
}
@Override
public String toString() {
	return "key=" + key + ", value=" + value +", type="+type;
}



}
public class Multi_object {
public static void main(String args[])
{
	
	Comparator<Data<Integer , String, Integer>> ck=new Comparator<Data<Integer , String , Integer>>(){

		@Override
		public int compare(Data<Integer, String, Integer> o1, Data<Integer, String, Integer> o2) {
			
			// For decending order of key
			if(o1.getKey()<o2.getKey())
				return 1;
			if(o1.getKey()>o2.getKey())
				return -1;
			return 0;
						
			
		}
	};
	
	Comparator<Data<Integer , String, Integer>> cv=new Comparator<Data<Integer , String, Integer>>(){
	public int compare(Data<Integer, String, Integer> obj1, Data<Integer, String, Integer> obj2) {
		
		//System.out.println("In compare of Length");
		if (obj1.getValue().length() < obj2.getValue().length()) {
			return -1;
		} else if (obj1.getValue().length() > obj2.getValue().length()) {
			return 1;
		} else
			return 0;
	}
	};
	
	Comparator<Data<Integer , String, Integer>> ct=new Comparator<Data<Integer , String , Integer>>(){

		@Override
		public int compare(Data<Integer, String, Integer> o1, Data<Integer, String, Integer> o2) {
			
			// For decending order of key
			if(o1.getType()<o2.getType())
				return -1;
			if(o1.getType()>o2.getType())
				return 1;
			return 0;
		}
	};


Set<Data<Integer,String,Integer>> ts = new TreeSet<>(ct);

ts.add(new Data<Integer,String,Integer>(1,"SachinPowar",123));
ts.add(new Data<Integer,String,Integer>(8,"Akash",423));
ts.add(new Data<Integer,String,Integer>(9,"SurajNerwane",568));
ts.add(new Data<Integer,String,Integer>(4,"Dev",805));
ts.add(new Data<Integer,String,Integer>(2,"SagarPol",489));

for(Data<Integer,String,Integer> x : ts)
{
	System.out.println(x);
}
}
}


/*OUTPUT :
 if Set<Data<Integer,String,Integer>> ts = new TreeSet<>(ck);
 
 o/p :
 key=9, value=SurajNerwane, type=568
key=8, value=Akash, type=423
key=4, value=Dev, type=805
key=2, value=SagarPol, type=489
key=1, value=SachinPowar, type=123

if Set<Data<Integer,String,Integer>> ts = new TreeSet<>(cv);
 
 o/p :
key=4, value=Dev, type=805
key=8, value=Akash, type=423
key=2, value=SagarPol, type=489
key=1, value=SachinPowar, type=123
key=9, value=SurajNerwane, type=568

if Set<Data<Integer,String,Integer>> ts = new TreeSet<>(ct);
 
 o/p :
key=1, value=SachinPowar, type=123
key=8, value=Akash, type=423
key=2, value=SagarPol, type=489
key=9, value=SurajNerwane, type=568
key=4, value=Dev, type=805


 */

