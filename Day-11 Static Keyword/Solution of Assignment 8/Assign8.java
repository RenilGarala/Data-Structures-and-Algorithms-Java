class Assign8{

    //program 1 
    public static void p1(){
        Account a1 = new Account();
        a1.setAccountNumber(1);
        a1.setCustomerName("Renil-Garala");
        a1.setBalance(10000);
        Account.setRateOfInterest(12.5f);
        a1.calculateSimpleInterest(24);
        a1.getAccountNUmber();
        a1.getBalance();
        a1.getCustomerName();
    }

    //program 2
    public static void p2(){
        SuperCar car1 = new SuperCar();
        car1.setOwnerName("John");
        car1.setPrice(200000);
        car1.setColor("white");
        car1.getCarDetails();
    }

    //program 3
    public static void p3(){
        Video v1 = new Video();
        v1.setVideoId(45);
        v1.setTitle("What is static keyword in java");
        v1.setViews(200);
        v1.setLikes(10);
        Video.setTotalVideos(20);

        v1.getVideoId();
        v1.getTitle();
        v1.getViews();
        v1.getLikes();
        Video.getTotalVideos();
    }

    //program 4
    public static void p4(){
        Batch b1 = new Batch();
        b1.setBatchCode(1234);
        b1.setCourseName("mca");
        b1.setStartDate(2025);
        b1.setStudentCount(260);
        b1.setTime(9);
        b1.setDays(3);
        Batch.setTotalNumberOfBatches(4);

        b1.getBatchCode();
        b1.getCourseName();
        b1.getStartDate();
        b1.getStudentCount();
        b1.getTime();
        b1.getDays();
        Batch.getTotalNumberOfBatches();
    }

    //program 5
    public static void p5(){
        Box b1 = new Box();
        b1.setlenght(5);
        b1.setbreadth(5);
        b1.setheight(5);
        Box.setboxcount(3);

        b1.getlength();
        b1.getbreadth();
        b1.getheight();
        Box.getboxcount();

    }

}

//program 1 class
class Account{
    private int Accountnumber;
    private String customerName;
    private int balance;
    private static float rateofinterest;

    public void setAccountNumber(int aNumber){
        Accountnumber = aNumber;
    }
    public void setCustomerName(String cName){
        customerName = cName;
    }
    public void setBalance(int sBalance){
        balance = sBalance;
    }
    public static void setRateOfInterest(float rInterest){
        rateofinterest = rInterest;
    }
    public void calculateSimpleInterest(int time){
        float interest= (balance * rateofinterest * time)/100;
        System.out.println("Your simple interest is " + interest);
    }
    public void getAccountNUmber(){
        System.out.println("Account number is "+ Accountnumber);
    }
    public void getBalance(){
        System.out.println("Balance is "+ balance);
    }
    public void getCustomerName(){
        System.out.println("Customer name is "+ customerName);
    }
}

//program 2 class
class SuperCar{
    String ownername;
    int price;
    String color;
    private static int objectCount;

    // constructor
    public static SuperCar getInstance(){
        if(objectCount == 0){
            objectCount =1;
            return new SuperCar();
        }
        else{

            return null;
        }
    }
    public void setOwnerName(String ownername){
        this.ownername=ownername;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void getCarDetails(){
        System.out.println("owner name is = "+ ownername);
        System.out.println("price is = "+ price);
        System.out.println("color is = "+ color);
    }
}

//program 3 class
class Video{
    int videoid;
    String title;
    int views;
    int likes;
    static int totalvideos;

    //setter methods
    public void setVideoId(int videoid) {
        this.videoid=videoid;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setViews(int views){
        this.views=views;
    }
    public void setLikes(int likes){
        this.likes=likes;
    }
    public static void setTotalVideos(int tView){
        totalvideos=tView;
    }
    //getter methods
    public void getVideoId(){
        System.out.println("Your video id is " + videoid);
    }
    public void getTitle(){
        System.out.println("Your video title is " + title);
    }
    public void getViews(){
        System.out.println("This video total views is " + views);
    }
    public void getLikes(){
        System.out.println("This video total like is "+ likes);
    }
    public static void getTotalVideos(){
        System.out.println("your chennal total video is " + totalvideos);
    }

}

//program 4 class
class Batch{
    int batchcode;
    String coursename;
    int startdate;
    int studentcount;
    int time;
    int days;
    static int totalnumberofbatches;

    public void setBatchCode(int batchcode){
        this.batchcode = batchcode;
    }
    public void setCourseName(String coursename){
        this.coursename = coursename;
    }
    public void setStartDate(int startdate){
        this.startdate= startdate;
    }
    public void setStudentCount(int studentcount){
        this.studentcount=studentcount;
    }
    public void setTime(int time){
        this.time=time;
    }
    public void setDays(int days){
        this.days=days;
    }
    public static void setTotalNumberOfBatches(int totalBatches){
        Batch.totalnumberofbatches = totalBatches;
    }

    //getter mathods
    public void getBatchCode(){
        System.out.println("batch code is = "+ batchcode);
    }
    public void getCourseName(){
        System.out.println("course name is = "+ coursename);
    }
    public void getStartDate(){
        System.out.println("start date is = "+ startdate);
    }
    public void getStudentCount(){
        System.out.println("total student is = "+ studentcount);
    }
    public void getTime(){
        System.out.println("batch start time is = "+ time);
    }
    public void getDays(){
        System.out.println("batch start from days = "+ days);
    }
    public static void getTotalNumberOfBatches(){
        System.out.println("total number of batches is = "+ totalnumberofbatches);
    }
}

//program 5 class 
class Box {
    float length;
    float breadth;
    float height;
    static int boxcount;

    public void setlenght(int lenght) {
        this.length = lenght;
    }
    public void setbreadth(int breadth) {
        this.breadth = breadth;
    }
    public void setheight(int height) {
        this.height = height;
    }
    public static void setboxcount(int bCount) {
        boxcount=bCount;
    }
    
    public void getlength(){
        System.out.println("length is " + length);
    }
    public void getbreadth(){
        System.out.println("breadth is " + breadth);
    }
    public void getheight(){
        System.out.println("height is " + height);
    }
    public static void getboxcount(){
        System.out.println("boxcount is " + boxcount);
    }
}