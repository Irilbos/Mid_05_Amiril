public class Mid_05_Amiril {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Motorbike Rental ");
        System.out.println("Rental fee: IDR 7,000 per hours");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your identity: ");
        scanner.nextLine();
        String address = scanner.nextLine();

        System.out.print("Enter rental period (in hours): ");
        int rentalPeriod = scanner.nextInt();

        double rentalFee = 7000.0;

        if (rentalPeriod > 3) {
            double discount = rentalFee * 0.002 * (rentalPeriod - 3);
            rentalFee -= discount;
        }

        System.out.println("Here are your rental details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("identity: " + identity);
        System.out.println("Rental period: " + rentalPeriod + " hours");
        System.out.println("Rental fee: IDR " + rentalFee);

    }
}