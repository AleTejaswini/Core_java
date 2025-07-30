package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
//import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import comparable.Movie;

public class Streamdemo {

	public static void main(String[] args) {
		// using arrays
//		int[] arr = {1,2,3,4,5};
//		 Arrays.stream(arr).forEach(System.out::println);
		 

		//using collection
		List<Movies> movie= Arrays.asList(new Movies("a",30),
				new Movies("b",30),
				new Movies("a" ,20),
				new Movies("c",40),
				new Movies("d",60),
				new Movies("e",50));	
		// creating stream=>from collections;from arrays;from an arbitary no.of objects,Infinite /finite streams
//	   movie.stream().forEach(m->System.out.println( m.getTitle() + "," +m.getLikes()));
	   
	   //filter
//	   movie.stream().filter(mov-> mov.getLikes()>10).forEach(mov-> System.out.println(mov.getTitle()+","+mov.getLikes()));
	   
	   //mapping=>map(),flatmap()
//	   movie.stream().filter(mov-> mov.getLikes()>10).map(mov->mov.getLikes()).forEach(System.out::println);
		//using flat map
//	   movie.stream().filter(mov-> mov.getLikes()>10).flatMap((Movies mov) -> Stream.<String>of(mov.getTitle(), String.valueOf(mov.getLikes()))).forEach(System.out::println);
	   
	   //slicing=>skip() ;limit()
//	   movie.stream().filter(mov->mov.getLikes()>10).limit(3).forEach(mov->System.out.println(mov.getTitle()));
	  // skip // takewhile() //dropwhile()
//	   movie.stream().filter(mov->mov.getLikes()>10).skip(3).forEach(mov->System.out.println(mov.getTitle()));
	   
	   
	   //sorting
//	   movie.stream().sorted(Comparator.comparing(Movies::getLikes)).forEach(mov->System.out.println(mov.getTitle() + ","+ mov.getLikes()));
	   
	   // unique =>distinct()
//	   movie.stream().map(Movies::getLikes).distinct().forEach(System.out::println);
	   
	   //peeking elements =>peek()
//	   movie.stream().filter(mov ->mov.getLikes()>10).peek(mov -> System.out.println("Filtered: " + mov.getTitle())).map(Movies::getTitle).peek(t -> System.out.println("Mapped: " + t)).forEach(System.out::println);
	   
	   //Reducer
	   //count()
//	   long count = movie.stream().count();
//	   System.out.println(count);
	   
	   //anyMatch() //allMatch() // noneMatch() 
//	   boolean result= movie.stream().anyMatch(mov->mov.getLikes()>70);
//	   boolean result = movie.stream().allMatch(mov->mov.getLikes()>10);
//	   boolean result = movie.stream().noneMatch(mov->mov.getLikes()>70);
//	   System.out.println(result);
	   
	   //findFirst // findany
//	   Movies r = movie.stream().findFirst().get();
//	   Movies r = movie.stream().findAny().get();
//	   
//	   System.out.println(r.getTitle()+ ","+r.getLikes());
	   
	  //min() max() 
//	  Movies r = movie.stream().max(Comparator.comparing(Movies::getLikes)).get();
//	  Movies r = movie.stream().min(Comparator.comparing(Movies::getLikes)).get();
//	   System.out.println(r.getTitle()+ ","+r.getLikes());
	   
//	   reduce()
//	  Optional<String> result1 = movie.stream().map(Movies::getTitle).reduce((a,b) ->a+b);
//	  Optional<Integer> result1 = movie.stream().map(Movies::getLikes).reduce((a,b) ->a+b);
//	  System.out.println(result1);
	  
	  
	  //collect()
//	 List<Movies> res=  movie.stream().filter(mov-> mov.getLikes()>20).collect(Collectors.toList());
//	 res.forEach(results-> System.out.println(results.getTitle()+ ","+results.getLikes()));
	  
	  //using map
//	  Map<Object, Object>  res=  movie.stream().filter(mov-> mov.getLikes()>20).collect(Collectors.toMap(m->m.getTitle(), m->m.getLikes()));
//	  System.out.println(res);
	  
	 // using summarizing => gives sum, avg, min ,max,count
		
		
		
		
//	  IntSummaryStatistics res=  movie.stream().filter(mov-> mov.getLikes()>20).collect(Collectors.summarizingInt(Movies::getLikes)); 
//	  System.out.println(res);
	  
	//using  summingInt /summingDouble/summingLong
//	  Integer res=  movie.stream().filter(mov-> mov.getLikes()>20).collect(Collectors.summingInt(Movies::getLikes)); 
//	  System.out.println(res);
	  
	  // primitive types streams // DoubleStream //LongStream
	  IntStream range = IntStream.range(1, 10);
	  range.forEach(System.out::println);
	  
	  
	  
	}

}
