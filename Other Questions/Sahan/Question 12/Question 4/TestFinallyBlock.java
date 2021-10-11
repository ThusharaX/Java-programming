class TestFinallyBlock{ // Test Finally Class
    public static void main(String args[]){ // Method

        try{ // Try  Catch block

        int data=25/0;

            System.out.println(data);
        
        } catch(ArithmeticException e){ // Exception 

            System.out.println(e); // Print Excpetion
    
        } finally{ // Final block 

            System.out.println("finally block is always executed"); // display finally block execution
        
        }
            
            System.out.println("rest of the code..."); 
    }

}

