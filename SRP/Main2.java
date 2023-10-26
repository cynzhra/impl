class Main2 {
    public static void main(String[] args) {
        StandardCinema standardCinema = new StandardCinema(100.0);
        Double adminFee = standardCinema.calculateAdminFee();
        System.out.println(adminFee);
    }
}
