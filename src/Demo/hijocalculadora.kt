import java.util.Scanner
fun main(){
    val scanner=Scanner(System.`in`)
    while(scanner.hasNextLine()){
        val input=scanner.nextLine().split(" ")
        if(input.size!=3){
            println("Error: Formato inválido.")
            continue
        }
        val operator=input[0]
        val num1=input[1].toDoubleOrNull()
        val num2=input[2].toDoubleOrNull()
        if(num1==null||num2==null){
            println("Error: Números inválidos.")
            continue
        }
        val result=when(operator){
            "+"->num1+num2
            "-"->num1-num2
            "*"->num1*num2
            "/"->if(num2!=0.0)num1/num2 else "Error: División por cero"
            else->"Error: Operador inválido"
        }
        println("Resultado: $result")
    }
}
