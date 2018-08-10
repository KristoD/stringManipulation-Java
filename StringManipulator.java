public class StringManipulator {
    public String trimAndConcat(String first, String last) {
        String result1 = first.trim();
        String result2 = last.trim();
        String finalResult = result1.concat(result2);
        return finalResult;
    }

    public Integer getIndexOrNull(String word, char letter) {
        int result = word.indexOf(letter);
        if(result == -1) {
            return null;
        } else {
            return result;
        }
    }

    public Integer getIndexOrNull(String word, String subString) {
        int result = word.indexOf(subString);
        if(result == -1) {
            return null;
        } else {
            return result;
        }
    }

    public String concatSubstring(String first, int idx1, int idx2, String last) {
        String result1 = first.substring(idx1, idx2);
        String finalResult = result1.concat(last);
        return finalResult;
    }
}