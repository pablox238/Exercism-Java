class ReverseString {

    String reverse(String inputString) {
        String reversedString = "";
        for (int j = inputString.length()-1; j >= 0 ; j--) {
            reversedString+=inputString.charAt(j);
        }
        return reversedString;
    }
  
}
