package com.example.demo;
import java.util.ArrayList;
/**
 * 多例模式
 *
 * @author
 *
 */
public class multipleton {
  // 多例数量
  private static final int N = 10;
  // 存放N个实例对象的容器
  private static ArrayList<multipleton> list = new ArrayList<multipleton>(N);
  // 每个对象的序号 标识
  private int no;
  // 私有构造方法 防止外界应用程序实例化
  private multipleton(int no) {
    this.no = no;
    System.out.println("-- Create Multipleton Object[" + no + "]!");
  }
  // 实例化N个对象实例
  static {
    // 添加Multipleton对象实例
    for (int i = 0; i < N; i++) {
      list.add(new multipleton(i));
    }
  }
  /**
   * 随机获得 实例对象
   */
  public static multipleton getRandomInstance() {
    // 获得随机数字
    int num = (int) (Math.random() * N);
    // 获得list中的对象实例
    return list.get(num);
  }
  public int getNo() {
    return no;
  }
  public void setNo(int no) {
    this.no = no;
  }
}
