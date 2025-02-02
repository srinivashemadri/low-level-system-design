package ProxyDesignPattern;

public class ProxyResource implements SensitiveResource {
    UserType userType;
    AccessType accessType;

    public ProxyResource(UserType userType, AccessType accessType) {
        this.userType = userType;
        this.accessType = accessType;
    }

    @Override
    public void access() {
        if(accessType == AccessType.ADMINROOM ){
            if(userType == UserType.MANAGER)
                System.out.println(userType.toString()+" Accessing admin room");
            else{
                System.out.println(userType.toString() + " Not allowed to access " + accessType.toString());
            }
        }
        else if(accessType == AccessType.CASHROOM ){
            if(userType == UserType.MANAGER || userType == UserType.CASHIER)
                System.out.println("Accessing cash room");
            else{
                System.out.println(userType.toString() + " Not allowed to access " + accessType.toString());
            }
        }
        else if(accessType == AccessType.RECORDSROOM ){
            System.out.println(userType.toString() + " allowed to access " + accessType.toString());
        }
    }
}
