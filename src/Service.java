public abstract class Service {
    protected String serviceName;
    protected int serviceId;
    protected boolean isActive;

    // TODO: declare private fields
    // serviceName
    // serviceId
    // isActive


    // TODO: constructor

    public Service(String serviceName, int serviceId){
        this.serviceId=serviceId;
        this.serviceName=serviceName;
        this.isActive=false;
    }
    // TODO: activateService()
    // should set isActive = true
    // print activation message
        public void ActivateService(){
            if(this.isActive==false){
                this.isActive=true;
                System.out.println("sucsesfully activited");
            }
            else{
                System.out.println("already acrivited");
            }
        }


    // TODO: deactivateService()
    // should set isActive = false
    // print deactivation message
        public void deactivateService(){
        if(this.isActive==true){
            this.isActive=false;
            System.out.println("sucsesfully deactivited");
        }
        else{
            System.out.println("already deactive");
        }
        }

    // TODO: getter for serviceName
    public String getServiceName(){
        return this.serviceName;
    }

    // TODO: getter for isActive

    public boolean getIsActive() {
        return isActive;
    }

    // TODO: abstract method performService()
    abstract  void performService();
}