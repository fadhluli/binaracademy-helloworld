class NumberTriangle {

    fun createNumberTriangle(maxNumber: Int){
        for(i in 1..maxNumber){
            for(j in 1..i){
                print(j)
            }
            println()
        }
    }
}