package kr.co.dodream.main;

import kr.co.dodream.beans.totalHello;

public class mainClass {

  public static void main(String[] args) {
    /*
     * 문제> 안녕하세요 라는 메세지를 영문 버전과 한글 버전으로 처리하여 출력하세요.
     * hint>
     *  영문> Hello~~ hyun
     *  한글> 안녕하세요~ 현대빈 쌤
     * 
     *  1.고객의 요구사항 발생 => 요구사항 파악(분석)
     *  2.요구사항 설계:
     *  -mainClass:
     *  -영문처리: ClassName => HelloMessage
     *           methodName => HelloSay()
     *           message => "Hello~~ hyun"
     *  
     *  -한글처리: ClassName => HangulMessage
     *           methodName => HangulSay()
     *           message => "안녕하세요~ 현대빈 쌤"
     *           
     *  3.요구사항 처리: Algorithm(.........)
     *    - 방법론: interface, abstract class, ....
     *           => totalHello class
     *             상속(extends, implements, ....)
     *  
     *  4.요구사항 테스트: 
     *  5.요구사항 베포
     *  6.요구사항 유지보수
     *  
     */
    
     totalHello tHello = new totalHello();
     
     tHello.HelloSay();
     tHello.HangulSay();
     
     
  }

}
