# static final
필드에 final + 필드 초기화 => static을 붙여서 사용

```aiignore
FieldInit을 인스턴스를 3개 생성 시, value라는 고정값을 가진 필드를 인스턴스 개수(3개)만큼 생성
-> 메모리 낭비
```

## final 참조
```aiignore
final Data data = new Data();
 data = new Data(); //-> 컴파일 오류
한번 할당하면 더 이상 할당 불가
-> 참조를 더이상 못하는 것이지, 참조값을 바꾸지 못하는 건 x
data.value = 10;
data.value = 20; // 이건 가능

```