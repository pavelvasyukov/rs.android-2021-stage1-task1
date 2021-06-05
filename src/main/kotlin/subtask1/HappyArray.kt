package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var bufferSadArray = sadArray
        var happyArray = IntArray (0);

            happyArray += bufferSadArray[0]
            for( i in 0.rangeTo(bufferSadArray.size - 3)){
                if( bufferSadArray[i] + bufferSadArray[i+2] > bufferSadArray[i+1]){
                    happyArray += bufferSadArray[i+1]
                }
            }
        happyArray += bufferSadArray[bufferSadArray.size-1]

    return happyArray
    }
}
