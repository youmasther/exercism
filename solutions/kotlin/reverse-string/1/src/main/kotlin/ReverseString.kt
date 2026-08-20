fun reverse(input: String): String {
    var another = ""
    for(i in  input.length - 1 downTo 0){
        another += input[i]
    }

    return another
}
