class ReverseString {

    String reverse(String inputString) {
        char[] resultCharArray = new char[inputString.length()];
        char[] inputStringToChars = inputString.toCharArray();
        String resultString = "";

        for (int i = inputString.length()-1, j = 0; i >= 0 ; i--, j++){
            resultCharArray[j] = inputStringToChars[i];
        }

        for (char character : resultCharArray) {
            resultString += character;
        }

        return resultString;
    }
  
}