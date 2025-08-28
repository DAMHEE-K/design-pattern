package observer;

public class ConcreteSubject implements Subject{
    @Override
    public void registerObserver(observer.Observer observer) {

    }

    @Override
    public void removeObserver(observer.Observer observer) {

    }

    // 상태가 바뀔때마다 모든 옵저버에게 연락하는 메소드
    @Override
    public void notifyObservers() {
    }
}
