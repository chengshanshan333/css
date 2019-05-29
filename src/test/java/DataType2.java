import org.junit.Test;

/**
 * 数据类型练习
 *
 * @author haoc
 */
public class DataType2 {

  /**
   * 1.
   *
   * 业务中金额的表示,避免浮点型的计算而使用单位为分的long型表示
   */


  /**
   * 2.
   *
   * 浮点型计算的案例
   */
  @Test
  public void calcFloat() {
    // 案例1
    double a = 1;
    double b = 0.99;
    System.out.println(a - b -b-b );

    // 案例2
    float c = 1;
    float d = 0.99f;
    System.out.println(c - d);


    /**
     * 这种舍入误差的主要 原因是浮点数值采用二进制系统表示， 而在二进制系统中无法精确地表示分数 1/10
     *
     * 原因分析: @link https://blog.csdn.net/jianhong1990/article/details/44288251
     */
  }

  /**
   * 3.
   *
   * 解决方案一: 使用BigDecimal计算浮点型
   */


}
