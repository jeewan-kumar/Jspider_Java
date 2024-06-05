class Drive {
    public static void main(String[] args) {
        Ola o = new Auto();
        if(o instanceof Auto) {
            Auto a = (Auto)o;
            System.out.println(a.pl);
            System.out.println(a.dl);
            System.out.println(a.aprice);
        } else if(o instanceof Bike) {
            Bike b = (Bike)o;
            System.out.println(b.pl);
            System.out.println(b.dl);
            System.out.println(b.bprice);
        }

    }
}
