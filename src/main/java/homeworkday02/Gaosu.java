package homeworkday02;

public class Gaosu extends Load{
    public Gaosu(String name){
        super(name);
    }
    @Override
    public void PaoChe(Car car){
        System.out.println("目前正在"+this.getName()+"路上跑"+car.getName()+"车");
    }
}
