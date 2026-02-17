import java.util.Scanner;

public class IPAddressInfo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP Address: ");
        String ip = sc.nextLine();

        String[] octets = ip.split("\\.");
        int firstOctet = Integer.parseInt(octets[0]);

        String ipClass = "";
        String subnetMask = "";
        int networkBits = 0;
        int hostBits = 0;

        if (firstOctet >= 1 && firstOctet <= 126) {
            ipClass = "Class A";
            subnetMask = "255.0.0.0";
            networkBits = 8;
            hostBits = 24;

        } else if (firstOctet >= 128 && firstOctet <= 191) {
            ipClass = "Class B";
            subnetMask = "255.255.0.0";
            networkBits = 16;
            hostBits = 16;

        } else if (firstOctet >= 192 && firstOctet <= 223) {
            ipClass = "Class C";
            subnetMask = "255.255.255.0";
            networkBits = 24;
            hostBits = 8;

        } else {
            System.out.println("Invalid IP Address");
            sc.close();
            return;
        }

        int totalNetworks = (int) Math.pow(2, networkBits);
        int hostsPerBlock = (int) Math.pow(2, hostBits) - 2;

        System.out.println("\nIP Address Information");
        System.out.println("-----------------------");
        System.out.println("IP Address      : " + ip);
        System.out.println("Class           : " + ipClass);
        System.out.println("Default Mask    : " + subnetMask);
        System.out.println("Network Blocks  : " + totalNetworks);
        System.out.println("Hosts per Block : " + hostsPerBlock);

        sc.close();
    }
}
