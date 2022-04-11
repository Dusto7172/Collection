package list;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<String> name = new ArrayList<String>();
		name.add("Raj");
		name.add("Ram");
		name.add("Bobby");
		name.add("Dev");
		name.add("Raj");
		System.out.println("Array: " + name);
		System.out.println("Size: " + name.size());
		System.out.println("Hashcode: " + name.hashCode());
		System.out.println("Is Empty: " + name.isEmpty());
		System.out.println("Contains: " + name.contains("Raj"));
		System.out.println("Contains: " + name.contains("Shaam"));
		System.out.println("Object Array : " + name.toArray());
//	System.out.println("Reomve All: "+name.removeAll(name));
//	System.out.println("Array: "+name);
//	System.out.println("Size: "+name.size());
//	System.out.println("Contains: "+name.contains("Raj"));

		ArrayList<String> name1 = new ArrayList<String>();
		name1.add("Ram");
		name1.add("Dev");
		System.out.println("ContainsAll: " + name.containsAll(name1));
		name1.add("Nanacy");
		name1.add("Dom");
		System.out.println("Array: " + name1);
		System.out.println(
				"Index of Name(Dev): " + name.indexOf("Dev") + " Index of Name1(Dev):  " + name1.indexOf("Dev"));
		System.out.println("Get(Name): " + name.get(2));
		System.out.println("Last IndexOF: " + name.lastIndexOf("Raj"));
		System.out.println("Set(Name1):" + name1.set(2, "Tom"));
		System.out.println("Array: " + name1);

		ArrayList<String> name2 = new ArrayList<String>();
		name2.add("Oliver");
		name2.add("William");
		name2.add("Isabella");
		name2.add("Sophia");
		name2.add("Lucas");
		name2.add("Emma");
		name2.add("Alexander");
		name2.add("Ava");
		name2.add("Stella");
		name2.add("Gio");
		name2.add("Dell");
		System.out.println("Array: " + name2);
		System.out.println("Name2 Size: " + name2.size());
		
	}
}
