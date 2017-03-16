//imports

public class HexColor {
  
  private String hex;
  private int r, g, b;
  
  public HexColor(String hex) {
    this.hex = hex;
    r = redFromHex(hex);
    g = greenFromHex(hex);
    b = blueFromHex(hex);
  }
  
  public HexColor(int r, int g, int b) {
    this.r = Math.abs(Math.min(r, 255));
    this.g = Math.abs(Math.min(g, 255));
    this.b = Math.abs(Math.min(b, 255));
    hex = hexFromRGB(r, g, b);
  }
  
  /* will always have the # in front */
  public static String hexFromRGB(int r, int g, int b) {
    StringBuilder newHex = new StringBuilder("#");
    byte[] bytes = {(byte)r, (byte)g, (byte)b};
    for (byte bite : bytes) {
      String s = bite.toString();
      String first = s.subString(0, 4);
      String last = s.subString(4, 8);
      
      newHex.append(value(first));
      newHex.append(value(last));
    }
    return newHex.toString();
  }
  
  public static int redFromHex(String hex) {
    if (hex.length() > 7) {
      return 0;
    } else if (hex.length() == 7) {
      hex = hex.subString(1, hex.length());
    } else if (hex.length < 6) {
      return 0;
    }
    
    String red = hex.subString(0, 2);
    
  
  private static String value(boolean atob, String value) {
    if (atob) {
      if (value == "0000") {
        return "0";
      } else if (value == "0001") {
        return "1";
      } else if (value == "0010") {
        return "2";
      } else if (value == "0011") {
        return "3";
      } else if (value == "0100") {
        return "4";
      } else if (value == "0101") {
        return "5";
      } else if (value == "0110") {
        return "6";
      } else if (value == "0111") {
        return "7";
      } else if (value == "1000") {
        return "8";
      } else if (value == "1001") {
        return "9";
      } else if (value == "1010") {
        return "a";
      } else if (value == "1011") {
        return "b";
      } else if (value == "1100") {
        return "c";
      } else if (value == "1101") {
        return "d";
      } else if (value == "1110") {
        return "e";
      } else if (value == "1111") {
        return "f";
      }
    } else {
      if (value = "0") {
        return "0000";
      } else if (value = "1") {
        return "0001";
        
  }
