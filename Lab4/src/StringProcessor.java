public class StringProcessor {
    private String original;
    private String result;
    private String s;
    private String t;

    public StringProcessor(String original, String s, String t) {
        this.original = original;
        this.s = s;
        this.t = t;
        this.result = processString();
    }

    public String processString() {
        String[] words = original.split("\\s+");
        StringBuilder r = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].endsWith(s)) {
                r.append(words[i]).append(" ").append(t);
            } else {
                r.append(words[i]);
            }
            if (i < words.length - 1) {
                r.append(" ");
            }
        }
        return r.toString();
    }

    public String getOriginal() {
        return original;
    }
}
