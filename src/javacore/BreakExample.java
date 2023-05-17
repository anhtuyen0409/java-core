
package javacore;

/**
 * class này giới thiệu câu lệnh break trong java
 * câu lệnh break có tác dụng thoat khỏi vòng lặp
 * @author HS
 */
public class BreakExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        //in các số từ 1 đến 10
        for(int i=1; i<=10; i++){
            if(i == 5){
                break; //nếu i = 5 thì sẽ thoát khỏi vòng lặp
            }
            System.out.println(i+"\t"); //kết quả 1 2 3 4
        }
    }
}
