package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var outputString = emptyArray<String>()
        var buff = toString()
        for(char in inputString) {
            when (char){
                '(' -> {
                    buff = inputString.dropWhile { it == '(' }
                    buff =  buff.dropLastWhile { it == ')' }
                    outputString += buff
                }
                '[' -> {buff = inputString.dropWhile { it == '[' }
                    buff =  buff.dropLastWhile { it == ']' }
                    outputString += buff }
                '<' -> {buff = inputString.dropWhile { it == '<' }
                    buff =  buff.dropLastWhile { it == '>' }
                    outputString += buff }
            }
        }
        return outputString
    }
}
