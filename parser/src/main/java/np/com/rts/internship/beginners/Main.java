package np.com.rts.internship.beginners;

import java.util.*;


public class Main {

  private String parseThis = "20160519150000-STX,6-3.0-CONF4";

  // Parsed value must be inserted into this variable
  double value;

  public Main() {
    // Write your code here
      String[] s = parseThis.split("-");
      value = Double.parseDouble(s[2]);

      System.out.println(value);
  }

  public static void main(String[] args) {
    new Main();
  }
}
