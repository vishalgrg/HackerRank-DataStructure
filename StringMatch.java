/*
	 * There is a collection of input strings and a collection of query strings. For
	 * each query string, determine how many times it occurs in the list of input
	 * strings. Return an array of the results.
   
   
	 */
   
    static int[] matchingStrings(String[] strings, String[] queries) {
       int arr[] = new int[queries.length];
       int count = 0;
       int i = 0;
       for(String qStr: queries ){
           for(String str: strings){
              if(qStr.equals(str)){
                  count ++;
              } 
           }
           
           arr[i] = count;
           i++;
           count =0;
       }
       return arr;
    
    }
