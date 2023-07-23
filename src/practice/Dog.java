package practice;

class Dog extends Animal {

    private String 무늬;

    public Dog(String 무늬) {
        this.무늬 = 무늬;
    }

    @Override
    public void eat() { System.out.println("주인이 주는대로 먹는다"); }
    @Override
    public void sound() { System.out.println("멍"); }

    @Override
    public void noise() {
        super.noise();
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog("얼룩무늬"); // Dog라는 객체로 생성한 dog1이라는 인스턴스, 얼룩무늬가 특징이다
        Dog dog2 = new Dog("점박이"); // Dog라는 객체로 생성한 dog2이라는 인스턴스, 점박이무늬가 특징이다

    }

}