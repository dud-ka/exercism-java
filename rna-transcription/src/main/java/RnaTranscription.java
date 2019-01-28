class RnaTranscription {


    String transcribe(String dnaStrand) {

        char[] dnaToArray = dnaStrand.toCharArray();
        char[] resultArray = new char[dnaStrand.length()];
        StringBuilder result = new StringBuilder();
        if (dnaStrand.isEmpty()) {
            return "";
        }

        for(int i = 0; i <= dnaToArray.length-1; i++)
            if (dnaToArray[i] == 'G') {
                resultArray[i] = 'C';
            } else if (dnaToArray[i] == 'C') {
                resultArray[i] = 'G';
            } else if (dnaToArray[i] == 'T') {
                resultArray[i] = 'A';
            } else if (dnaToArray[i] == 'A') {
                resultArray[i] = 'U';
            }

        for(char character : resultArray) {
            result.append(character);
        }
        return result.toString();
    }

}
