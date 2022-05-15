class SqueakyClean {
    static String clean(String identifier) {
        identifier = convertKebabCaseToCamelCase(identifier);
        identifier = removeEmojis(identifier);
        identifier = removeNumbers(identifier);
        identifier = replaceAnySpacesWithUnderscores(identifier);
        identifier = replaceControlCharactersWith(identifier,"CTRL");
        identifier = omitGreekLowerCaseLetters(identifier);
        return identifier;
    }

    static String replaceAnySpacesWithUnderscores(String text){
        return  text.replace(" ", "_");
    }

    static String replaceControlCharactersWith(String text, String replacement){
        return text.replaceAll("[\\x00-\\x1F\\x7F]", replacement);
    }

    static String removeEmojis(String text){
        return text.replaceAll("[\uD83C-\uDBFF\uDC00-\uDFFF]", "");
    }

    static String removeNumbers(String text){
        return text.replaceAll("[0-9]", "");
    }

    static String convertKebabCaseToCamelCase(String text){
        String finalString = "";
        String[] texts = text.split("-");
        finalString += texts[0];

        for (int i = 1; i < texts.length; i++) {
            char[] word = texts[i].toCharArray();
            System.out.println(word);
            finalString+= String.valueOf(word[0]).toUpperCase();
            for (int j = 1; j < word.length; j++) {
                finalString+= word[j];
            }
        }
        return finalString;
    }

    static String omitGreekLowerCaseLetters(String text){
        return text.replaceAll("[α-ωίϊΐόάέύϋΰήώ]", "");
    }

}
