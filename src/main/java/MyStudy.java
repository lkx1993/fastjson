import com.alibaba.fastjson.JSON;

/**
 * Created by liukx on 2018-11-09.
 */
public class MyStudy {

    public static void main(String[] args) {
        String jsonStr = "{\"name\":\"zhangsan\",\"age\":23,\"email\":\"chentging@aliyun.com\"}";
        Object obj = JSON.parse(jsonStr);
        System.out.println(obj);


    }


}
