import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person> {

	String name;
	
	public Person() {
		super();
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public String toString()
	{
		return name;
	}
	
	public boolean equals(Object obj)
	{
		Person x = (Person) obj;
		return this.name.equals(x.name);
	}
	
	@Override
	public int compareTo(Person p) {
		return Person.this.name.compareTo(p.name);
	}

	public static void main(String[] args) {
		
		/*
		ArrayList<String> list=new ArrayList<>();
		list.add("SE");
		list.add("EE");
		list.add("ME");
		list.add("SE");
		list.add("EE");
		list.remove("SE");
		System.out.println(list);
		*/
		
		List<Person> data = new ArrayList<>();
		
		data.add(new Person("Amy"));
		data.add(new Person("Paul"));
		data.add(new Person("Mike"));
		data.add(new Person("Jerry"));
		
		//data.remove(new Person("Bob"));
		//記憶體位置不同，如果沒有override equals，remove沒有意義
		
		System.out.println(data);
		
   	 	Comparator<Person> cmp=(x,y)-> y.name.compareTo(x.name);
   	 	
   	 	Comparator<Person> cmp2 =new  Comparator<Person>() {
   	 		@Override
   	 		public int compare(Person o1, Person o2) {
   	 			return o2.name.compareTo(o1.name);
			}
   		 };
   	
    	Collections.sort(data,cmp2);//等同於Collections.sort(data,cmp); 
   		System.out.println(data);
   		
   		Collections.sort(data);
   		System.out.println(data);
 		
	}

}
