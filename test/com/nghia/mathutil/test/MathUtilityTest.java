/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nghia.mathutil.test;

import com.nghia.mathutil.core.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vinacenter
 */
public class MathUtilityTest {
    
    @Test // biến hàm này thành main(), Shift-F6 để chạy
    // gọi hàm getFactorial() như thường lệ, hay hơn là tự so sánh giùm
    // expected và actual coi có khớp nhau k? nếu có thì màu xanh
    // k khớp thì thấy màu ĐỎ, ta chỉ nhìn màu mà k cần mất công
    // so sánh nữa
    public void testFactorialRightArgumentRunsWell(){
        long expected = 120; // ktra 5! có = 120 k
        int n = 5;          // em đưa 5 đấy
        long actual = MathUtility.getFactorial(n); // tính thiệt
        // so sánh luon 
        assertEquals(expected, actual);
        //tui sẽ test các tình huống còn lại
        assertEquals(720, MathUtility.getFactorial(6));// 6! có phải 720?
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3)); 
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
//        kì vọng sai, tính đúng => 1 màu đỏ, k khớp nhau
//      kì vọng đúng, tính sai -> 1 màu đỏ
//      kì vọng 5!=120, máy tính ra mấy, hàm mày tính ra mấy?
//        tính huống: TEST CASE, nghề TESTER/QC là nghề nghĩ ra các test case
//        sau đó thử nghiệm
    }
    
    //ta test phần ngoại lệ - Exception
    // Exception là tình huống bất chấp xảy ra trong app, trong code, khi
//    app chạy nó có phải là 1 value để có thể so sánh
//    Lỗi SQL trùng key, sai khóa ngoại, null trên cột yêu cầu khac null
//    đều là lỗi liên quan SQL nhưng ko thể nói thằng nào bằng thằng nào?
//    đối với Exception, chỉ có thể đo nó = câu hỏi: MAỲ CÓ XUẤT HIỆN KO?
//    ko dùng assertEquals() so sánh coi có = nhau k
//     trong thiết kế của hàm getFactorial() thì nếu đưa vào n<0 hoặc n>21
//    thì hàm ném ra, sẽ new 1 ngoại lẹ
//    cứ đưa n vi phạm thì nhận lại ngoại lệ
//    vậy nếu có ngoại lệ xảy ra khi n đưa vào cà chớn <0>21
//    có nghĩa rằng hàm chạy đúng, thấy ngoài lệ ta lại ăn mừng, vì chạy
//    như thiết kế -> đúng có ngoại lệ ta cần nó xuất hiện -> màu xanh
//    sẽ có test case, tình huống TEST: XEM NGOẠI LỆ CÓ XH KO, CÓ->XANH
//                                                     K CÓ XH-> ĐỎ
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtility.getFactorial(-30);// phải xh Exception
        MathUtility.getFactorial(-10); // phải xh Exception
        MathUtility.getFactorial(21);// phải xh Exception
        MathUtility.getFactorial(40);// phải xh Exception
//        nếu xh Exception như kì vọng, thì phải XANH
//        vì màu xanh here hàm ý rằng hàm chạy như thiết kế,
//      ném ngoại lệ khi đưa n cà chớn!!

    }
}

    //QUY ƯỚC XANH: nếu tất cả các lời gọi hàm getFactorial()
    // đều trả ra giá trị đúng như kì vọng, nói cách khác thì
    // tất cả các hàm assertEquals() đều so sánh khớp expected vs. actual
    // thì có màu xanh
    // XANH: THÌ TẤT CẢ CÁC TÌNH HUỐNG TEST HÀM ĐỀU CHẠY ĐÚNG
    // ĐỎ: chỉ cần 1 trong đám này sai, coi như ĐỎ CHO TẤT CẢ
    // Lí do phía sau: ĐÃ TEST HÀM THÌ HÀM PHẢI ĐÚNG CHO CÁC TÌNH HUỐNG
    // TEST ĐƯỢC ĐƯA RA,
    // ĐÃ TEST THÌ PHẢI ĐÚNG CHO CÁC TRƯỜNG HỢP ĐƯỢC ĐƯA RA
    // KO chơi trò: hầu hết hàm đúng, lâu lâu mới sai...


