package chap07

class Payment {

    def employees = ["A", "B", "C"]
    def basePays = [400, 300, 250]

    def puts(result) {
        println result
    }

    def describeResult(name, pay) {
        "이름: ${name}, 급여: ${pay}"
    }

    int calculatePayFor(name, int taxRate) {
        def index = employees.indexOf(name)
        int basePay = basePays.get(index)
        basePay - (basePay * taxRate / 100)
    }

    int getTaxRate() {
        Scanner scanner = new Scanner(System.in)
        println "세율을 입력하세요."
        scanner.nextInt()
    }
}
