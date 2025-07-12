package demo;

enum Direction {
    NORTH, SOUTH, EAST, WEST
}

public class Enum1 {
    public static void main(String[] args) {
        Direction d = Direction.WEST;
        System.out.println(d); 
    }
}


//enum season{
//	SUMMER("hot") ,WINTER("cold"), SPRING("pleasant") ,AUTUM("cool");
//	String description;
//	
//	private season(String desc) {
//		this.description =desc;
//	}
//	public String getdesc() {
//		return description;
//	}
//}
//
//public class Enum1{
//	public static void main(String[] args) {
//		for(season s : season.values())
//		System.out.println(s+ "->" +s.getdesc());
//	}
//}


//methods
//enum Level { LOW, MEDIUM, HIGH }
//
//public class Enum1 {
//    public static void main(String[] args) {
//        Level l = Level.HIGH;
//
//        System.out.println(l.name());      
//        System.out.println(l.ordinal());   
//        System.out.println(Level.valueOf("LOW"));  
//
//        for (Level level : Level.values()) {
//            System.out.println(level);
//        }
//    }
//}



// enum can implement interfaces
//interface Printable {
//    void print();
//}
//
//enum Color implements Printable {
//    RED, BLUE, GREEN;
//
//    @Override
//    public void print() {
//        System.out.println("Selected color is: " + this.name());
//    }
//}
//
//public class Enum1 {
//    public static void main(String[] args) {
//        Color c = Color.RED;
//        c.print(); 
//    }
//}