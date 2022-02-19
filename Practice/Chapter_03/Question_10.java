import java.util.HashMap;

public class Question_10 {
        enum CoffeeType {
            Americano,
            Iceamericano,
            Cafelatte
        };

        public static void CoffeePrice(CoffeeType type) {
            HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
            priceMap.put(CoffeeType.Americano, 3000);  // 1: 아메리카노
            priceMap.put(CoffeeType.Iceamericano, 4000);  // 2: 아이스 아메리카노
            priceMap.put(CoffeeType.Cafelatte, 5000);  // 3: 카페라떼
            int price = priceMap.get(type);
            System.out.println(String.format("가격은 %d원 입니다.", price));
        }

        public static void main(String[] args) {
            CoffeePrice(CoffeeType.Americano);  // "가격은 3000원 입니다." 출력
        }
    }
