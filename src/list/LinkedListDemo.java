package list;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList<String> carBrand = new LinkedList<String>();
		carBrand.add("Lamborghini");
		carBrand.add("Ford");
		carBrand.add("Suzuki");
		carBrand.add("Tata");
		carBrand.add("Mahindra");
		System.out.println(carBrand);
		carBrand.addFirst("Ferrari");
		System.out.println("Add First : "+carBrand);
		carBrand.addLast("Jeep");
		System.out.println("Add Last: "+carBrand);
		System.out.println("Get First: "+carBrand.getFirst());
		System.out.println("Get Last: "+carBrand.getLast());
		System.out.println("Element : "+carBrand.element());
		System.out.println("Offer : "+carBrand.offer("BMW"));
		System.out.println(carBrand);
		System.out.println("OfferFirst : "+carBrand.offerFirst("Audi"));
		System.out.println(carBrand);
		System.out.println("Poll: "+carBrand.poll());
		System.out.println(carBrand);
		System.out.println("Poll Last: "+carBrand.pollLast());
		System.out.println(carBrand);
		System.out.println("Pop: "+carBrand.pop());
		carBrand.push("Kia");
		System.out.println("Push (Kia):"+carBrand);
		carBrand.push("Renault");
		System.out.println("Push (Renault ):"+carBrand);

		
		LinkedList<Integer> num = new LinkedList<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(10);
		num.add(40);
		num.add(50);
		num.add(20);
		
		num.removeFirstOccurrence(10);
		System.out.println("removeFirstOccurrence: "+num);
		num.removeFirstOccurrence(10);
		System.out.println("removeFirstOccurrence: "+num);
		num.removeLast();
		System.out.println("Remove Last : "+num);
		

	}

}
