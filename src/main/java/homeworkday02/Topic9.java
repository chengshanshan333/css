package homeworkday02;

/**
 * 作业9: 请用面向对象的思路设计: 马路上跑汽车
 *
 * - 马路: 可能是告诉, 也可能是辅路,还可能是乡村公路
 *
 * - 汽车: 可能是宝马, 可能是奔驰, 还可能是奥拓
 *
 * - 请用多态来进行设计
 *
 * @author haoc
 */
public class Topic9 {
    public  static void main(String[] args){
        Load load1 = new Gaosu("京广高速");
        Car car1 = new Car("宝马");
        load1.PaoChe(car1);
        Load load2 = new Fulu("北京三环辅路");
        Car car2 = new Car("奥拓");
        load2.PaoChe(car2);
        Load load3 = new Load("调用父类");
        load3.PaoChe(car1);
    }

}
