package rabin_karp;

public class RabinKarpExtended {
    public final static int d = 256;

    public static int search(String query, String text) {
        int q = 101;
        int position = -1;
        int queryInt = query.length();
        int textInt = text.length();
        int i, j;
        int queryHash = 0;
        int textHash = 0;
        int h = 1;
        for (i = 0; i < queryInt - 1; i++)
            h = (h * d) % q;
        for (i = 0; i < queryInt; i++) {
            queryHash = (d * queryHash + query.charAt(i)) % q;
            textHash = (d * textHash + text.charAt(i)) % q;
        }
        for (i = 0; i <= textInt - queryInt; i++) {
            if (queryHash == textHash) {
                for (j = 0; j < queryInt; j++) {
                    if (text.charAt(i + j) != query.charAt(j))
                        break;
                }
                if (j == queryInt)
                    position = i;
                    System.out.println("Pattern found at index " + i);
            }
            if (i < textInt - queryInt) {
                textHash = (d * (textHash - text.charAt(i) * h) + text.charAt(i + queryInt)) % q;
                if (textHash < 0)
                    textHash = textHash + q;
            }
        }
                return position;
    }

}

