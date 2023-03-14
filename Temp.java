import java.util.ArrayList;
import java.util.List;

class Temp {
    public static void main(String[] args) {
        // Stream
        List<String> list = List.of("jaybon", "sunny", "duck");
        // 리스트에 u가 포함됨 문자열만 추출해서 리스트로 변환
        List<String> result1 = new ArrayList<>();
        for (String str : list) {
            if (str.contains("u")) {
                result1.add(str);
            }
        }
        // 리스트 문자열에 @temp.com 을 붙여서 리스트로 반환
        List<String> result2 = new ArrayList<>();
        for (String str : result1) {
            result2.add(str + "@temp.com");
        }
    }
}