package br.com.rafael.exercises.ex27;

public class SubstringVerifier {
    private int startPos, endPos;

    {
        startPos = endPos = -1;
    }

    public boolean verify(String srcStr, String otherStr) {
        startPos = endPos = -1;
        int lenSrcStr = srcStr.length(), lenOtherStr = otherStr.length();
        if (lenOtherStr > lenSrcStr)
            return false;
        int maxIterations = lenSrcStr - lenOtherStr;
        boolean foundSubstring = false;
        searchBlock:
            for (int i = 0, n, j, k; i <= maxIterations; i++) {
                n = otherStr.length();
                j = i;
                k = 0;
                while (n-- != 0)
                    if (srcStr.charAt(j++) != otherStr.charAt(k++))
                        continue searchBlock;
                foundSubstring = true; //If we reach here we've found the substring inside the other string.
                startPos = i;
                endPos = --j;
                break;
            }
        return foundSubstring;
    }

    public int getStartPos() {
        return startPos;
    }

    public int getEndPos() {
        return endPos;
    }
}
