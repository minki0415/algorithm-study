# [백준] 2557번 Hello World

## 1. 출처

[2557번: Hello World](https://www.acmicpc.net/problem/2557)

## 2. 문제

Hello World!를 출력하시오.

## 3. 입력

없음

## 4. 출력

Hello World!를 출력하시오.

## 5. 예제

| 입력 | 출력 |
| --- | --- |
|  | Hello World! |

## 6. 문제풀이

```java
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

}
```

- **`public class Main`**
    - **`public`** : 다른 패키지에서도 사용할수 있는 접근 지정자
    - **`class`** : 클래스라는 것을 알려주는 자바 키워드, 클래스 내부에는 필드/메서드/생성자/이너클래스가 올수 있다.
    - **`Main`** : 클래스명 , 첫글자는 대문자로 시작
- **`public static void main(String[] args)`** : main 메서드
    - **`static`** : 정적 메서드. **객체 생성없이 ‘클래스명.멤버명’**만으로 바로 사용할수 있다.
    - **`void`** : 리턴 타입을 지정하는 위치로 void는 리턴하는 것이 없다.
    - **`main`** : 메서드명 , main 메서드는 실행이후 가장 먼저 실행되는 메서드
    - **`(String[] args)`**: String(문자열)배열 타입의 args 입력값, 매개변수
- **`System.out.println("Hello World!")`** : 줄바꾸면서 출력
    - **`System.out.println( )`** : 해당 메소드는 JDK내부에 제공되는(라이브러리,API) 출력메소드
        - **`println`**=**`printlinenew`** 출력하고 다음라인으로
    - 문자열 출력시 “ “ 사용