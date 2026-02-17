public class StreamingService extends Service
        implements PremiumFeature {

    // TODO: declare premium field
    boolean premium=false;
    // TODO: constructor
    public StreamingService(  String name, int id){
        super( name, id);
    }

    @Override
    public void performService() {

        // TODO:
        // check if service is active
        // print different message for premium and normal
        if(this.isActive=true){
            System.out.println("you are welcome premimum man");
        }else{
            System.out.println("bratha please upgrade to premimuim and enjoy");
        }
    }


    public void upgradeToPremium() {

        // TODO:
        // set premium = true
        // print message
        this.premium=true;
        System.out.println("you are upgrated to premium man");
    }
}