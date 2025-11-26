 class inst {
    public String name;
    Date date;
   public  inst(){
    Date now=new Date();
    this.date=now;
        this.name=("this is Java");
    }
    public static void main(String[] args) {
        inst db= new inst();
        System.out.println("this is intance ="+db.name);
        System.out.println(db.date);
    }
}
