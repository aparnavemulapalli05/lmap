package com.advance.linkedhashmap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapApp {

	public static void main(String[] args) {
		Map<String, Double>productPricesHashMap=new HashMap<>();
		productPricesHashMap.put("chocobar", 1.5);
		productPricesHashMap.put("Apple", 1.6);
		productPricesHashMap.put("orange", 1.8);
		productPricesHashMap.put("kaju", 3.8);
		
		System.out.println("HashMap:");
		
		for(String product:productPricesHashMap.keySet()) {
			System.out.println(product+ "$"+productPricesHashMap.get(product));
		}
		
		
		Map<String, Double>productPricesLinkedHashMap=new LinkedHashMap<>();
		productPricesLinkedHashMap.put("chocobar", 1.5);
		productPricesLinkedHashMap.put("Apple", 1.6);
		productPricesLinkedHashMap.put("orange", 1.8);
		productPricesLinkedHashMap.put("kaju", 3.8);
		
		System.out.println("LinkedHashMap:");
		
		for(String product:productPricesLinkedHashMap.keySet()) {
			System.out.println(product+ "$"+productPricesLinkedHashMap.get(product));
		}

		Map<String, Double>productPriceTreeMap=new TreeMap<>();
		productPriceTreeMap.put("chocobar", 1.5);
		productPriceTreeMap.put("Apple", 1.6);
		productPriceTreeMap.put("orange", 1.8);
		productPriceTreeMap.put("kaju", 3.8);
		
		System.out.println("TreeMap:");
		
		for(String product:productPriceTreeMap.keySet()) {
			System.out.println(product+ "$"+productPriceTreeMap.get(product));
		}
		
		

	}

}
