package com.java.STREAM.TerminalOperations;

import java.util.Arrays;
import java.util.stream.Stream;

public class UseOfToArray {
	public static void main(String[] args) {
		
		 /*
         * Stream toArray() returns an array containing the elements of this stream. It
         * is a terminal operation i.e, it may traverse the stream to produce a result
         * or a side-effect. After the terminal operation is performed, the stream
         * pipeline is considered consumed, and can no longer be used.
         */
		
		Stream<Integer> stream= Stream.of(1,2,34,45,23,45,243,45);
		System.out.println(stream);
		System.out.println("The stream is " + stream.toString());
		// now converting this stream to array object 
		Object[] arr = stream.toArray();
		System.out.println(arr);// giving the hashcode of arr so we have to change it into toString to display 
		System.out.println(" The array object is " + Arrays.toString(arr));//
		
		
		
	}
}
