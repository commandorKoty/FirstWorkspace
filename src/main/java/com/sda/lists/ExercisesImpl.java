package com.sda.lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExercisesImpl {

	public static List<String> fill(String string, int size) {
		List<String> myList = new ArrayList<String>();
		int i = 0;
		for (; i < size;) {
			myList.add(string);
			i++;
		}
		return myList;
	}

    public static <T> List<T> fillGeneric(T value, int size) {
    	List<T>filled = new ArrayList<T>();
    	for(int i = 0; i < size; i++){
    	filled.add(value);
    }
        return filled;
    }

    public static void swap(List<String> listOne, int i, int j) {
    	String a = listOne.get(i);
    	String b = listOne.get(j);
    	
    	listOne.remove(i);
    	listOne.add(i, b);
    	listOne.remove(j);
    	listOne.add(j, a);
    }

    public static <T> void swapGeneric(List<T> listOne, int i, int j) {
    	T valueAtI = listOne.get(i);
    	T valueAtJ = listOne.get(j);
    	
    	listOne.remove(i);
    	listOne.add(i,  valueAtJ);
    	listOne.remove(j);
    	listOne.add(j, valueAtI);
    }

    public static void reverse(List<String> list) {
    	
    	List<String> reversedList = new ArrayList<String>();
    	for(int i = list.size()-1; i >= 0; i--) {
    		reversedList.add(list.get(i));
    	} 
    	list.clear();
    	list.addAll(reversedList);
    }

    public static <T> void reverseGeneric(List<T> list) {
    }

    public static void rotate(List<Integer> numbers, int i) {
    }

    public static void bubbleSort(ArrayList<Integer> list) {
    }

}
