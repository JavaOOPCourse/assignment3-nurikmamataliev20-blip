public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    // TODO: declare premium field
    boolean premium=false;

    // TODO: constructor
    public CloudStorageService(String name, int id){
        super(name, id);
    }

    @Override
    public void performService() {

        // TODO:
        // check if active
        // print cloud access message
        if(this.isActive=true){
            System.out.println("cloud access message");
        }
    }


    public void upgradeToPremium() {

        // TODO:
        // enable premium
        // print message

        if(this.premium=false){
            this.premium=true;
            System.out.println("you are upgraded cloud man");
        }else{
            System.out.println("you are alredy upgrated");
        }
    }


    public void generateBill() {

        // TODO:
        // print billing message
        System.out.println("billing message cloud");
    }
}