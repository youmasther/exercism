object Bob {
    fun hey(input: String): String {
        val phrase = input.trim()
        val isYelling = phrase.any { it.isLetter() } && phrase == phrase.uppercase()
        if(phrase.isBlank()){
            return "Fine. Be that way!"
        }
        else if(phrase.endsWith('?') && isYelling){
            return "Calm down, I know what I'm doing!"
        }
        else if(phrase.endsWith('?') && !isYelling){
            return "Sure."
        }
        else if (isYelling){
            return "Whoa, chill out!"
        }
        return "Whatever."
    }
}
