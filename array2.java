class Main
{
     public static void main(String s[]) 
     {
         int arr[]={1,2,3,4,5};
         int max=arr[0];
         for(int i=1;i<arr.length;i++)
         {
             if (arr[i]>max)
         max=arr[i]-1;
         }
         {
             System.out.println(max);
         }
            
         
     }
    }
   
    
       
