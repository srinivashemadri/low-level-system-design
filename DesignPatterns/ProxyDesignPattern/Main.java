package ProxyDesignPattern;

/** you want to restrict access based on user roles
 * user role - admin, customer
 * **/

public class Main {
    public static void main(String[] args) {
        ProxyResource managerProxy = new ProxyResource(UserType.MANAGER, AccessType.ADMINROOM);
        ProxyResource clerkProxy = new ProxyResource(UserType.CLERK, AccessType.RECORDSROOM);
        ProxyResource cashierProxy = new ProxyResource(UserType.CASHIER, AccessType.CASHROOM);

        ProxyResource clerkProxy2 = new ProxyResource(UserType.CLERK, AccessType.ADMINROOM);
        ProxyResource cashierProxy2 = new ProxyResource(UserType.CASHIER, AccessType.ADMINROOM);

        managerProxy.access();
        clerkProxy.access();
        cashierProxy.access();
        clerkProxy2.access();
        cashierProxy2.access();

    }
}
