package observer;

/**
 * 주제 인터페이스
 * 객체에서 옵저버로 등록하거나 옵저버 목록에서 탈퇴하고 싶을 때는
 * 이 인터페이스에 있는 메소드를 사용한다
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
