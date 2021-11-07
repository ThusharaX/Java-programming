class Student{  
    String name; 
    int sub1; 
    int sub2; 
    int sub3;
    int Avg; 
    void get(String n, int a, int b, int c) { 
        name = n; 
        sub1 = a; 
        sub2 = b; 
        sub3 = c; 
} 

void disp() { 
    Avg = (sub1 + sub2+sub3 )/2; 
    System.out.println("Name=" + name);  
    System.out.println("Average=" + Avg); 
    } 
}