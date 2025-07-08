
    
    // Non static IC
    
    package inner_class;

    public class NSouter {
          int outerVar = 10;
         // Non static IC
         class Inner {
            void display() {
                System.out.println("Outer variable: " + outerVar);
            }
        }
        // using IC outside OC
        void createInner() {  
            Inner in = new Inner();  //IC object Inside OC
            in.display();
        }
    

        public static void main(String[] args) {
        	NSouter outer = new NSouter();
            outer.createInner();  

//            NSouter.Inner inner = new NSouter.Inner();   //for  static  // declare static keyword  //IC used from Outside
        	NSouter.Inner inner = outer.new Inner(); // for non static
            inner.display();
        } 
    }