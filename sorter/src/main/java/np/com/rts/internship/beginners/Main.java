package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  String[] strings = new String[] {
          "hello",
          "mello",
          "mell",
          "1mell",
          "hmmm",
          "h2mmm",
          "zxcvb",
          "asdf",
          "%$compli"
  };

  public Main() {
    // Write your code here
    for(int j=0; j<strings.length;j++)
    {
      for (int i=j+1 ; i<strings.length; i++)
      {
        if(strings[i].compareTo(strings[j])<0)
        {
          String temp= strings[j];
          strings[j]= strings[i];
          strings[i]=temp;


        }
      }
      System.out.print(strings[j]);
    }
    int n= strings.length;
      System.out.println("the last element of the array is " + strings[n-1]);
    String max = strings[n-1];
    for (int i=0; i<n-1; i++){
      if(strings[i].compareTo(max)>0){
        System.out.println("the last element is not the largest");
      }

    }


  }

  public static void main(String[] args) {
    new Main();
  }
}
