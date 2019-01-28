import java.util.StringTokenizer;

class Acronym {

    public  String phrase;
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String getAcronym() {
        StringTokenizer tokens = new StringTokenizer(phrase,"-., ");
        String acronym = "";
        String tmp;

        while (tokens.hasMoreTokens()) {
            tmp = tokens.nextToken();
            char[] tmpArr = tmp.toCharArray();
            char firstChar = tmpArr[0];
            acronym += String.valueOf(firstChar).toUpperCase();
        }
        return acronym;
    }

}

