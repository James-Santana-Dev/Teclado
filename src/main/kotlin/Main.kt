fun main(args: Array<String>) {
    var num = 0
    var soma = 0
    var cont = 0
    var media = 0.0
    var menor = 0
    var maior = 0

    do{

        print("Digite um número diferente de 0: ")
        num = readLine()!!.toInt()

        if(num != 0){

            soma += num

            if(num > maior){
                maior = num
            }else if (num < menor){
                menor = num
            }

            if(menor == 0){
                menor = num
            }

            if(maior == 0){
                maior = num
            }
            /*
            if(cont == 0){
                maior = num
                menor = num
            }else{
                if(num > maior){
                    maior = num
                }

                if(num < menor){
                    menor = num
                }
            }
             */



            cont++
        }

    }while(num != 0)



    media = soma/cont.toDouble()

    println("A soma de todos os números é $soma")
    println("A média dos números é $media")
    println( "O menor número é $menor")
    println( "O maior número é $maior")
    
}