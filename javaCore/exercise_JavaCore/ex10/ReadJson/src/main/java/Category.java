public enum Category {
   Romance ("Romance"),
    tiAdventuretle ("Adventure"),
    Comedy ("Comedy"),
    Drama ("Drama"),
    Thriller ("Thriller"),
    Animation ("Animation"),
    Mystery ("Mystery");



    private String value;

    Category(String value) {
        this.value = value;
    }



    public String getValue() {
        return value;
    }
}