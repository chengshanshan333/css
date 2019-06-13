package homeworkday02;
import java.io.*;
import java.util.*;


/**
 * 作业11: I/O + 集合 + 对象 练习题
 *
 * 文件: 位置随意,数据格式: id, name, gender, score, address
 *
 * 读取出数据之后,放到对象中User
 *
 * 在将User放入集合中
 *
 * 集合中的User,按照address,gender,分组,且每个组内的分数还要排序
 *
 * - 如: 北京,男 ; 上海,女
 *
 * @author haoc
 */
public class Topic11 {
    //读取文件函数
    public static List<User> readTxtFile(String filePath){
        try {
            List<User> list=new ArrayList<>();
            String encoding="utf-8";
            //新建文件对象，输入文件路径
            File file=new File(filePath);
            //判断如果是文件并且存在，则读取文件
            if(file.isFile() && file.exists()){
                //新建reader对象并设置编码格式为utf-8，避免中文乱码
                InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);
                BufferedReader bufferedReader = new BufferedReader(read);
                //定义字符串变量存放读取的每行的内容
                String lineTxt = null;
                //循环读取，不为空就一直读
                while((lineTxt = bufferedReader.readLine()) != null){
//                    System.out.println(lineTxt);
                    //将lineTxt转换为list
                    List list1=Arrays.asList(lineTxt.split(","));
                    //根据list中元素的内容新建对象并初始化，添加到list集合中
                    list.add(new User(list1));
                }
                read.close();
                return list;
            }else{//如果文件不存在，则提示找不到
                System.out.println("找不到指定的文件");
                return null;
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
            return null;
        }

    }
    public static void main(String[] args)  {
        String filePath = "/Users/chengss/IdeaProjects/css-project/css/src/main/java/homeworkday02/topic11_readData.txt";
        List<User> s = readTxtFile(filePath);
        for (int i = 0; i < s.size(); i++) {
            s.get(i).printMsg();
        }
    }

}
