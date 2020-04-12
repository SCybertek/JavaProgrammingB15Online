package selfStudy;

public class InnerClassStaticBlock {
    static {
        System.out.println("this is static block");

    }
    
    private static class ThisIsInnerClass {
        
        public ThisIsInnerClass(){
            System.out.println("inner class constructor");
        }
        
        
    }


    public static void main(String[] args) {
        //System.out.println(x);
        ThisIsInnerClass y = new ThisIsInnerClass();
        System.out.println("y = " + y);
        //outcome :
        // this is static block
        //inner class constructor
        //y = selfStudy.InnerClassStaticBlock$ThisIsInnerClass@816f27d
    }
}
