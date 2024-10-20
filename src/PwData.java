class PWData {
    private String password;

    public void setpw(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Password: " + password;
    }
}
