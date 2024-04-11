package com.myjava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Pair<String,String> pair=new Pair("s","mine");
		Pair<String,String> pair1=new Pair("s","myself");
		Set<Pair<String,String>> list=new HashSet<Pair<String,String>>();
		list.add(pair);
		list.add(pair1);
		for(Pair<String,String> pairs:list)
		{
			System.out.println(pairs.getKey()+pairs.getValue());
		}
	}

	public static Map<String, String> parse(String cookie) {
		Map<String, String> cookies = new HashMap<>();

		String[] cookieParts = cookie.split("=", 2);
		if (cookieParts.length == 2) {
			cookies.put(cookieParts[0], cookieParts[1]);
		}

		return cookies;
	}
//	public static void main(String[] args) {
//		System.out.println("Hello World!");
//		List<Employee> list = Arrays.asList(new Employee(1, 100), new Employee(2, 100), new Employee(3, 100));
//		Optional<List<Employee>> optionalResult = Optional.of(list.stream()
//                .filter(e -> e.managerId == 200)
//				.collect(Collectors.toList()));
//
//		optionalResult.ifPresentOrElse(result -> {
//			// Perform action with the filtered list
//			list.forEach(System.out::println);
//		}, () -> System.out.println("not found"));
//	}
//}
//
//class Employee {
//	Integer empId;
//	Integer managerId;
//
//	public Employee(Integer empId, Integer managerId) {
//		super();
//		this.empId = empId;
//		this.managerId = managerId;
//	}
//
//}
//
//interface myi {
//	private void j1() {
//
//	}
}
class Pair<K, V>
{
	 	private K key;
	    private V value;
	    
	    public Pair(){
	    }
	    
	    public Pair(K key,V value){
	        this.key=key;
	        this.value=value;
	    }

	    /**
	     * @return the key
	     */
	    public K getKey() {
	        return key;
	    }

	    /**
	     * @param key
	     *            the key to set
	     */
	    public void setKey(K key) {
	        this.key = key;
	    }

	    /**
	     * @return the value
	     */
	    public V getValue() {
	        return value;
	    }

	    /**
	     * @param value
	     *            the value to set
	     */
	    public void setValue(V value) {
	        this.value = value;
	    }
	    
	    public static <K,V> Pair<K,V> pair(K key,V value){
	        return new Pair<K, V>(key,value);
	    }

	    @Override
	    public boolean equals( Object o )
	    {
	        if ( this == o )
	            return true;
	        if ( !( o instanceof Pair ) )
	            return false;
	        Pair<?, ?> pair = (Pair<?, ?>) o;
	        return Objects.equals( key, pair.key );
	    }

	    @Override
	    public int hashCode()
	    {
	        return Objects.hash( key );
	    }
}