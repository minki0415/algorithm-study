# [백준] 10718번 We love kriii

## 1. 출처

[10718번: We love kriii](https://www.acmicpc.net/problem/10718)

## 2. 문제

ACM-ICPC 인터넷 예선, Regional, 그리고 World Finals까지 이미 2회씩 진출해버린 kriii는 미련을 버리지 못하고 왠지 모르게 올해에도 파주 World Finals 준비 캠프에 참여했다.

대회를 뜰 줄 모르는 지박령 kriii를 위해서 격려의 문구를 출력해주자.

## 3. 입력

본 문제는 입력이 없다.

## 4. 출력

두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.

## 5. 예제

1) 입력 

2) 출력

강한친구 대한육군

강한친구 대한육군

## 6. 문제풀이

```java
package week06;

public class Main {

	public static void main(String[] args) {
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");		
	}

}
```

- **`println`**=**`printlinenew`** : 출력하고 다음라인으로
- **`System.out.print()`** : 한줄로 출력하기
    - **`System.out.print("강한친구 대한육군\n강한친구 대한육군");`** 위의 코드와 같은 결과 값 출력
        - **`\n`** : 개행, 줄바꿈
- **`System.out.printf()`** : 형식대로 출력하기
    
    ```java
    package week06;
    
    public class Main {
    
    	public static void main(String[] args) {
    		System.out.printf("%d\n", 30); // 30(10진수)
    		System.out.printf("%o\n", 30); // 36(8진수)
    		System.out.printf("%x\n", 30); // 1e(16진수)
    		System.out.printf("%s\n", "출력"); // 출력
    		System.out.printf("%f\n", 5.8); // 5.800000
    		System.out.printf("%4.2f\n", 5.8); // 5.80
    	}
    
    }
    ```
    
    - **`%4.2f\n`** : ‘%전체 자릿수 + . + 소수점 자릿수 + f’ 로 정형화하는 방법