public abstract class User {

    // TODO: declare fields
    // name
    // id
    protected String userName;
    protected  int userId;

    // TODO: constructor
        public User(String userName, int userId){
            this.userName=userName;
            this.userId=userId;
        }

    // TODO: abstract method manageService(Service s)
        public void manageService(Service s){}

    // TODO: abstract method useService(Service s)
        public void useService(Service s){}
}