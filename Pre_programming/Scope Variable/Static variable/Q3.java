class Q3 {
    static int userCount = 0;

    public static void main(String[] args) {
        Q3 user1 = new Q3();
        Q3 user2 = new Q3();
        Q3.userCount += 2;

        System.out.println("Number of users: " + Q3.userCount);
    }
}

