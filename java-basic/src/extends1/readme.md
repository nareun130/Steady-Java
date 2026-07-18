# 상속과 메모리 구조
```aiignore
ElectricCar electricCar = new ElectricCar();
```

## 이건 무조건 기억하자 
위와 같이 ElectricCar 생성 시, 상속 관계에 있는 Car까지 포함해서 인스턴스를 생성
- 상속의 경우 부모의 필드와 메서드만 물려받는게 아닌, 부모 클래스도 함께 포함해서 생성
- 객체 호출 시, 대상 타입을 정해야 하는데 호출자의 타입을 통해 대상을 찾음
- 현재 타입에서 기능을 못 찾으면 상위 부모 타입으로 기능을 찾아서 실행 -> 못 찾으면 컴파일 오류

## final
- final class는 상속 불가
- final method는 오버라이드 불가!