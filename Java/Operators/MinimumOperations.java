package demo;

import java.util.*;  
public class MinimumOperations{
	public static int minoperations(int N) {
		if (N==1) {
			return 1;
		}
		
		Queue<int []> queue = new LinkedList<>();
		Set<Integer> visited =new HashSet<>();
		queue.add(new int[] {1,0});
		visited.add(1);
		while(!queue.isEmpty()) {
			int[] current =queue.poll();
			int number =current[0];
			int operations =current[1];
			  
			int multiply = number * 3;
			int add = number +1;
			
			if(multiply ==N || add == N) {
				return operations +1;
			}
			
			if(!visited.contains(multiply) && multiply<=N) {
				queue.add(new int [] {multiply,operations+1});
				visited.add(multiply);
				
				}
			if(!visited.contains(add) && add<=N) {
				queue.add(new int [] {add,operations+1});
				visited.add(add);
				
				}
			
			}
		return 0;
		}
		public static void main(String[] args) {
		int N =0;
		System.out.println("Minimum operations " + minoperations(N));
		}
	}
