class P5{  
       
    public static void main(String ar[])  
    {  
    
        int nrows =9;  
   
        int rowCount = 1;  
   
        for (int i = nrows; i >= 1; i--)  
        {  
           
            for (int j = 1; j <= i*2; j++)  
            {  
                System.out.print(" ");  
            }  
   
           
            for (int j = i; j <= nrows; j++)            
            {  
                System.out.print(j+" ");  
            }  
     
            for (int j = nrows-1; j >= i; j--)  
            {                 
                System.out.print(j+" ");              
            }  
               
            System.out.println();  
   
            rowCount++;  
        }  
    }  
 
}