
package javacore;

/**
 *class này nói về các kiểu dữ kiệu trong java
 * @author HS
 */
public class DataTypeExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        //kiểu dữ liệu nguyên thủy
        byte byteValue = 10;
        short shortValue = 15;
        int intValue = 20;
        long longValue = 25;
        float floatValue = 25f;
        double doubleValue = 30;
        char charValue = 'a';
        
        /*kiểu dữ liệu tham chiếu
          biến stringValue tham chiếu đến object String
          String trong java được coi là 1 đối tượng (object)*/
        String stringValue = new String("Hello");
        
        //in giá trị
        System.out.println("byteValue: "+byteValue);
        System.out.println("shortValue: "+shortValue);
        System.out.println("intValue: "+intValue);
        System.out.println("longValue: "+longValue);
        System.out.println("floatValue: "+floatValue);
        System.out.println("doubleValue: "+doubleValue);
        System.out.println("charValue: "+charValue);
        System.out.println("stringValue: "+stringValue);
    }
}
