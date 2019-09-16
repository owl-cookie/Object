package chap07

class Main {

    /*
    main. 급여를 계산한다.
        1. 소득 세율을 입력받는다.
            - 세율을 입력하세요 라는 문장을 노출
            - 입력 받는다ㅣ.
        2. 직원의 급여를 계산한다.
            - 전역 변수에 저장돤 직원의 기본급 정보를 얻는다.
            - 급여를 계산한다.
        3. 양식에 맞게 결과를 출력한다.
            - 이름 {직원명}, 급여 : {계산된 금액} 에따라 문자열을 생성한다.

     */


    static void main(String[] args) {

        def payment = new Payment()

        def name = "A"

        int taxRate = payment.getTaxRate()
        def pay = payment.calculatePayFor(name, taxRate)
        payment.puts(payment.describeResult(name, pay))
    }
}
