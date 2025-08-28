package observer;

public interface Observer {
//    public void update(float temp, float humidity, float pressure); // 주제가 변경되었을 때, 옵저버에게 알릴 값들
    
    // 옵저버가 필요한 데이터만 골라서 pull 하도록 수정
    public void update();
}
