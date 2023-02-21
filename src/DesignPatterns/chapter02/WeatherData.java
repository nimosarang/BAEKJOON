package DesignPatterns.chapter02;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers; //Observer 객체들을 저장하는 ArrayList 추가
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData(){
        observers = new ArrayList<Observer>();
    } //생성자가 그 객체를 생성 (Observer 객체들을 저장하는 ArrayList)

    //Subject 인터페이스를 구현하는 부분
    @Override
    public void registerObserver(Observer o) { //옵저버가 등록요청 시 목록 맨 뒤에 추가하기만 하면 됨

    }

    @Override
    public void removeObserver(Observer o) { //마찬가지로 옵저버가 탈퇴를 요청시 목록에서 빼기만 하면 됨

    }

    @Override
    public void notifyObservers() { //아주 중요, 모든 옵저버에게 상태 변화를 알려주는 부분. 모두 옵저버 인터페이스를 구현하는, 즉 업데이트 메소드가 있는 객체들이므로 손쉽게 상태 변화를 알려줄 수 있다
        for(Observer observer : observers){
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){ //가상 스테이션으로부터 갱신된 측정값을 받으면 옵저버들에게 알림
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    } // 디스플레이 항목 테스트

    //기타 메소드
}
