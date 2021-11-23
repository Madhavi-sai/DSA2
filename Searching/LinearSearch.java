    class LinearSearch{    
      int linear(int[] arr, int key){    
          for(int i=0;i<arr.length;i++){    
              if(arr[i] == key){    
                  return i;    
                }    
            }    
            return -1;    
        }   


        public static void main(String args[]){ 
            LinearSearch object = new LinearSearch();   
            int[] array= {10,20,30,50,70,90};    
            int key = 50;
            int result = object.linear(array, key);
            if (result == -1)
              System.out.println("Not found");
            else
              System.out.println("Element found at index " + result); 
        }    
    }    
