package other;

import java.util.*;

public class BigData {

    /**
     * @param  dataSize  数据量的大小
     * @param randomNumRange  产生随机数的范围
     * @param topN   找出重复次数前N的。
     * @return void
     * @Description 在大数据量的数字中查找重复次数前N个的数字
     */

    public static  void repeatTopN(int dataSize,int randomNumRange,int topN){
        long start = System.currentTimeMillis();

        int maxValue = randomNumRange;

        Map<Integer,Integer> map1 = new HashMap<Integer,Integer>();//存放key:数字 value:出现次数
        Map<Integer, List<Integer>> map2 = new HashMap<Integer, List<Integer>>();//存放 key:出现次数  value:数字

        Random r = new Random();
        for(int i = 0 ; i < dataSize ; i++){
            int  number = r.nextInt(maxValue);
            int count = 1;

            if(map1.containsKey(number)){
                count = map1.get(number)+1;
                map1.put(number,count);
            }else{
                map1.put(number,1);
            }

            if(map2.containsKey(count)){//这里需要优化。出现次数最多的数字会在之前出现次数的List集合都存在。
                map2.get(count).add(number);
            }else{
                List list =  new ArrayList<Integer>();
                list.add(number);
                map2.put(count,list);
            }
        }

        BitSet bs = new BitSet(); //使用BitSet的位向量 原理。对应下标位置如果设置则为true，否则为false

        //设置出现次数为bs对应下标的设置，这样最大下标所对应的值为true。
        for(Map.Entry<Integer,Integer> entry : map1.entrySet()){
            bs.set(entry.getValue());
        }

        //注意：这里使用TreeSet 是为了解决上面最多出现次数的数字会在之前的list都出现一遍，为了去重和按照顺序插入到result中
        Set <Integer> result = new TreeSet<Integer>();

        //倒序循环bs。只要值为true的。说明是出现过的最大次数。然后倒序输出，使用出现次数从map2中查找对应的数字列表, 查找topN个数字。

        a:for(int j = bs.size();j>=0;j--){ //这里bs的size是2的n次幂。
            if(bs.get(j)){
                b:for(Integer num : map2.get(j)){
                    if(result.size() > topN){ //result的大小 大于用户需要取出的topN。退出循环
                        break a;
                    }
                    //取出重复次数前topN的数字
                    boolean flag = result.add(num);
                    if(flag){//如果是不重复并且增加进去的则输出数字出现的次数。
                        System.out.println("["+num +"]出现过:"+j+"次");
                    }
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(result);
        System.out.println("共耗时："+((end-start)/1000) +"秒");

    }


    public static void main(String[] args) {
        repeatTopN(100000000,1000,5);
    }
}
