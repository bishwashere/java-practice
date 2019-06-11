public class test {
    public static void main(String[] args){

      // INPUT
      //int[] my_input = {3,2,1,4,6};
      //int result = a1(my_input);

      //int[] my_input = {1, 1};
      //int result = f(my_input);

      // char[] my_input = {'a', 'b', 'c'};
      // int start = 0;
      // int len = 2;

      //int n = 45789;

      // int[] first = {1,8,3,2};
      // int[] second = {4,2,6,1};

      // OUTPUT
      //f5(first, second);
      int n = 6;
      // System.out.println(n);
      System.out.println(isPerfectSquare(n));
    }

    // LOGIC

    static int isPerfectSquare(int n){
      if (n<0) return 0;

      n++;
      int half;
      while(true){
        if ((n%2) == 0){
          half = n/2;
          // System.out.println("Half is:" + half);
          //System.out.println((half*half));
          if ((half*half)==input_n) return half;
        }
        System.out.println(n);
        n++;
      }
    }

    static int[] f5(int[] first, int[] second){
      //if (first==null || second==null) return null;

      int[] min_array, max_array;
      int min_array_length, counter=0;

      min_array = first;
      min_array_length = first.length;
      max_array = second;

      if (second.length < min_array_length) {
        min_array = second;
        max_array = first;
        min_array_length = second.length;
      }
      int[] result = new int[min_array_length];

      for(int i=0; i<min_array.length; i++){
        for(int j=0; j<max_array.length; j++){
          if (min_array[i]==max_array[j]){
            result[counter]=min_array[i];
            counter++;
          }
        }
      }
      System.out.println(result[0]);
      System.out.println(result[1]);

      int[] retArray = new int[counter];
      for (int t = 0; t < retArray.length; t++){
        retArray[t] = result[t];
      }
      // System.out.println(retArray);
      return retArray;
    }

    static int f(int n){
      int sign = 1;
      if (n<0) sign=-1;

      int result = 0;
      while(n!=0){
        System.out.println((n % 10));
        result = (result * 10) + (n % 10);
        System.out.println("Result" + result);
        n = n/10;
      }
      return sign*result;
    }

    static char[] f(char[] a, int start, int len){
      if (len < 0 || a==null || (start+len)>a.length ) return null;
      
      char[] result = new char[len];
      for (int i=start, j=0; j<len; i++, j++){
        result[j] = a[i];
      }
      return result;
    }

    static int a1(int[] a) {
        if (a==null || a.length%2==0) return 0;

        int midIndex = a.length/2;
        int midItem = a[midIndex];
        for(int i=0; i<a.length; i++){
          if (i!=midIndex && a[i]<=midItem){
            return 0;
          }
        }
        return 1;
    }

      static int f(int[] a){
        int sumEven = 0;
        int sumOdd = 0;

        if (a==null) return 0;

        for (int i=0; i<a.length; i++){
          if (a[i]%2==0){
            sumEven+=a[i];
          }
          else{
            sumOdd+=a[i];
          }
        }
        System.out.println("Sum of Odd: " + sumOdd);
        System.out.println("Sum of Even: " + sumEven);
        return sumOdd - sumEven;
      }

  }
