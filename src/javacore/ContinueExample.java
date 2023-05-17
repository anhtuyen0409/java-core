
package javacore;

/**
 * class này giới thiệu câu lệnh continue trong java
 * tác dụng: trong vòng lặp, khi gặp lệnh continue thì sẽ bỏ qua và thực thi câu lệnh tiếp theo
 * @author HS
 */
public class ContinueExample {
    /**
     * method main
     */
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if(i == 5){
                continue; //bỏ qua i = 5 và tiếp tục vòng lặp
            }
            System.out.println(i+"\t"); //kết quả 1 2 3 4 6 7 8 9 10
        }
    }
}
