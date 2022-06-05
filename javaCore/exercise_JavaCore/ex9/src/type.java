enum type {
    HOUSEWARE ("Đồ gia dụng"),
    FOOD ("Thực phẩm"),
    FASHION ("THời trang");

    private String value;

    type(String value) {
        this.value = value;
    }



    public String getValue() {
        return value;
    }
}