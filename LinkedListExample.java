package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		List<String> v = new LinkedList<>();
//
//		v.add("ROBO");
//		v.add("GENTLMEN");
//		v.add("OKEOKKADU");
//		v.add("BHARATEEYUDU");
//		v.add("I");
//
//		System.out.println("THE LIST OF FILMS THAT ARE DIRECED BY SHANKAR :: ");
//
//		for (String films : v) {
//			System.out.println(films);
//		}
//		System.out.println("THE LIST OF FILMS THAT ARE DIRECED BY SHANKAR BY ADDING THE FILM :: ");
//
//		try (Scanner sc = new Scanner(System.in)) {
//			String film = sc.next();
//
//			Set<String> s = new HashSet<String>();
//
//			s.add(film);
//
//			System.out.println("THE FILM NEED TO BE ADDED AS THE NUMBER film in SHANKAR FILMOGRAPHY :: ");
//
//			int number = sc.nextInt();
//			v.addAll(number, s);
//			System.out.println("THE LIST OF FILMS THAT ARE DIRECED BY SHANKAR AFTER ADDING " + s + "IN " + number
//					+ "POSITION  ::: S");
//		}
//
//		for (String films : v) {
//			System.out.println(films);
//		}
//		
		List<Integer> virtual = new ArrayList<>();
		
	

		virtual.add(22);
		virtual.add(33);
		virtual.add(44);
		virtual.add(55);
		virtual.add(67);
	

		int kiran = 0;
		
		for(int i =0;i<virtual.size();i++)
		{
			for(int j =1;j<virtual.size()-1;j++) {
				
				kiran= virtual.get(i);
				
 			
			}
		}
		System.out.println(virtual);
		
		
		
		
		

	}

}
