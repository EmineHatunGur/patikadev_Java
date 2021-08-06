public class Main {                                                                            
    static boolean isFind(int[] arry, int value) {                                             
        for (int i : arry                                                                      
        ) {                                                                                    
            if (i == value) {                                                                  
                return true;                                                                   
            }                                                                                  
                                                                                               
        }                                                                                      
        return false;                                                                          
    }                                                                                          
                                                                                               
    public static void main(String[] args) {                                                   
        int[] arr = {2, 3, 4, 8, 9, 10, 2, 2, 6, 2, 4, 2};                                     
        int[] list = new int[arr.length];                                                      
        int sayac = 0;                                                                         
        for (int i = 0; i < arr.length; i++) {                                                 
            for (int j = 0; j < arr.length; j++) {                                             
                if ((i != j) && (arr[i] == arr[j])) {                                          
                    if (!isFind(list, arr[i])) {                                               
                        list[sayac++] = arr[i];                                                
                    }                                                                          
                    break;                                                                     
                                                                                               
                }                                                                              
                                                                                               
            }                                                                                  
        }                                                                                      
                                                                                               
        for (int value : list) {                                                               
            if (value != 0) {                                                                  
                System.out.println(value);                                                     
            }                                                                                  
                                                                                               
                                                                                               
        }                                                                                      
                                                                                               
    }}                                                                                         
