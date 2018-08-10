package pkgfor;
/**
 * @author: Veysel Dogan
 * Date: 10-Aug-2018 
 * Console Application: For
 * Main Class
 */
public class For {
/*
    for (initializition ; <condition>;  <statement>
        <Block of statements>;  
    */
   
    public static void main(String[] args) {
       for(int index=0; index<5; index++)
            System.out.println("Index :" +index);    
        System.out.println(" ");  //where I print from 0 to 5 but 5 not included because starting at index 0 in the arrays
        
        
       for(int index=10; index>5; index--){
            System.out.println("Index :" +index);
            index--;    //where I print from 1, to 5 but decreased by two 5 not included
   
       }
       }
    
}
