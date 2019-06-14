package homeworkday02;

public class Load {
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Load(String name){
        this.name = name;
    }
    public void PaoChe(Car car){
        System.out.println("路父类中的方法么有实际意义，需要在子类中重写定义！");
    }
}
