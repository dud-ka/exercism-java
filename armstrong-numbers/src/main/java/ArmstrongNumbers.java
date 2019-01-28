class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

		String numberToString = String.valueOf(numberToCheck);
		char[] numberToCharArray = numberToString.toCharArray();
		int howManyDigits = numberToCharArray.length;
		int result = 0;

		for(char character : numberToCharArray) {
			String characterToString = String.valueOf(character);

			result += Math.pow(Double.parseDouble(characterToString), howManyDigits);
		}

		return result == numberToCheck;
	}

}
