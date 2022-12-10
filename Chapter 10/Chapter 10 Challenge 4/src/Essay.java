public class Essay extends GradedActivity {
    private int grammar;
    private int spelling;
    private int length;
    private int content;

    public Essay(int grammar, int spelling, int length, int content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
    }

    public int calcGrade() {
        return this.grammar + this.spelling + this.length + this.content;
    }

    public int getGrammar() {
        return grammar;
    }

    public int getSpelling() {
        return spelling;
    }

    public int getLength() {
        return length;
    }

    public int getContent() {
        return content;
    }

    public void setGrammar(int grammar) {
        this.grammar = grammar;
    }

    public void setSpelling(int spelling) {
        this.spelling = spelling;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setContent(int content) {
        this.content = content;
    }
}
