package homeworkday02;


import java.util.*;

/**
 * 作业10: 集合作业(需要提前学习下 List,Map等基本用法)
 *
 * - 定义一个对象,User,属性有 name,age,score,gender
 *
 * - 使用集合ArrayList,来装一批User, 数据可以随意
 *
 * - 要求1: 遍历集合,打印所有内部数据
 *
 * - 要求2: 按照年纪(age)进行分组,比如23岁,有3个人, 24岁有5个人,
 *
 * - 要求3: 按照分数(score)范围分组, 比如 60-70, 有一组人, 70-80有一组人
 *
 * - 要求4: 基于分数排序, 由高到低
 *
 * - 要求5: 基于性别分组,求男同学的平均分,求女同学的平均分
 *
 * @author haoc
 */
public class Topic10 {
    public static void groupByScore(List<User> list){
        //新建userMap用来存放按key分组后的结果，key：分组依据的属性，value：Userlist
        Map<String,List<User>> userMap = new HashMap<>();
        for(User user : list){
            String key = "";
            if(1<=user.getScore() && user.getScore()<=10){
                key = "1-10";
            }else if(10<user.getScore() && user.getScore()<=20){
                key = "10-20";
            }else if(20<user.getScore() && user.getScore()<=30){
                key = "20-30";
            }else if(30<user.getScore() && user.getScore()<=40){
                key = "30-40";
            }else if(40<user.getScore() && user.getScore()<=50){
                key = "40-50";
            }else if(50<user.getScore() && user.getScore()<=60){
                key = "50-60";
            }else if(60<user.getScore() && user.getScore()<=70){
                key = "60-70";
            }else if(70<user.getScore() && user.getScore()<=80){
                key = "70-80";
            }else if(80<user.getScore() && user.getScore()<=90){
                key = "80-90";
            }else {
                key = "90-100";
            }
            List<User> mapUserList = userMap.get(key);
            if(mapUserList ==null){
                List<User> temp=new ArrayList<>();
                temp.add(user);
                userMap.put(key, temp);
            }else {
                mapUserList.add(user);
            }

        }
        System.out.println("共分为"+userMap.size()+"组");
        for(String keyValue : userMap.keySet()){
            System.out.println(keyValue+":"+userMap.get(keyValue).size()+"个");
            for(User user:userMap.get(keyValue)){
                user.printMsg();
            }
        }

    }
    public static Map<Object,List<User>> groupByAgeOrScoreOrGender(String key, List<User> list){
        //新建userMap用来存放按key分组后的结果，key：分组依据的属性，value：Userlist
        Map<Object,List<User>> userMap = new TreeMap<>();
        List<User> mapUserList;
        //遍历被分组的UserList
        for(User user : list){
            if(key == "age"){
                mapUserList = userMap.get(user.getAge());
            }else if(key == "score"){
                mapUserList = userMap.get(user.getScore());
            }else if(key == "gender"){
                mapUserList = userMap.get(user.getGender());
            } else {
                System.out.println("您输入的分组属性："+key+"不支持，目前只支持按照age和score分组！");
                break;
            }
            if(mapUserList == null){
                List<User> temp=new ArrayList<>();
                temp.add(user);
                if(key == "age"){
                    userMap.put(user.getAge(), temp);
                }else if(key == "score"){
                    userMap.put(user.getScore(), temp);
                }else {
                    userMap.put(user.getGender(), temp);
                }

            }else {
                mapUserList.add(user);
            }
        }
        System.out.println("共分为"+userMap.size()+"组");
        for(Object keyValue : userMap.keySet()){
            System.out.println(keyValue+":"+userMap.get(keyValue).size()+"个");
            for(User user:userMap.get(keyValue)){
                user.printMsg();
            }
        }
        return userMap;
    }
    public static void mapSortDesc(TreeMap<Integer,User> map){

    }
    public static void main(String[] args){
        List<User> list=new ArrayList<>();
        list.add(new User(1,"北京1","gril",100,"北京市",23));
        list.add(new User(2,"北京2","gril",90,"北京市",22));
        list.add(new User(3,"北京3","boy",8,"北京市",23));
        list.add(new User(4,"上海1","boy",60,"上海市",24));
        list.add(new User(5,"上海2","gril",70,"上海市",25));
        list.add(new User(6,"上海3","gril",80,"上海市",25));
        list.add(new User(7,"深圳1","gril",70,"北京市",25));
        list.add(new User(8,"深圳2","boy",100,"北京市",24));
        list.add(new User(9,"深圳3","gril",90,"北京市",20));
        list.add(new User(10,"北京4","gril",60,"北京市",30));
        list.add(new User(11,"北京5","boy",50,"北京市",22));
        list.add(new User(12,"北京6","gril",100,"北京市",22));
        System.out.println("要求1: 遍历集合,打印所有内部数据");
        for(User u:list){
            u.printMsg();
        }
        System.out.println("****************************");
        System.out.println("要求2: 按照年纪(age)进行分组");
        groupByAgeOrScoreOrGender("age",list);
        System.out.println("****************************");
        System.out.println("要求3: 按照分数(score)范围分组");
        groupByScore(list);
        System.out.println("****************************");
        System.out.println("要求5: 基于性别分组,求男同学的平均分,求女同学的平均分");
        Map<Object, List<User>> result = groupByAgeOrScoreOrGender("gender",list);
        float boyAvgScore = 0;
        float grilAvgScore = 0;
        int sumBoyScore = 0;
        int sumGrilScore = 0;
        for(Object ss : result.keySet()){
            if(ss == "boy"){
                for(User user : result.get(ss)){
                    sumBoyScore = sumBoyScore + user.getScore();
                }
                boyAvgScore = sumBoyScore / result.get(ss).size();
            }else if(ss == "gril"){
                for(User user : result.get(ss)){
                    sumGrilScore = sumGrilScore + user.getScore();
                }
                grilAvgScore = sumBoyScore / result.get(ss).size();
            }

        }
        System.out.println("boy的平均成绩是："+sumBoyScore+"/"+(result.get("boy").size())+"="+boyAvgScore);
        System.out.println("gril的平均成绩是："+sumGrilScore+"/"+(result.get("gril").size())+"="+grilAvgScore);
    }

}
