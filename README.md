# 👉 계산기 구현 과제 소개

* 프로젝트 명 : 우리 팀을 소개해요.
	* 배운 내용을 바탕으로 계산기를 구현하는 과제입니다.
	* 지원하는 연산은 덧셈(+), 뺄셈(-), 곱셈(*), 나눗셈(/), 나머지(%), 제곱 및 제곱근(^) 입니다.
	* CUI로 동작합니다.
* 개발 기간 : 2024.12.31 ~ 2025.1.9 (약 10일)

* github : <https://github.com/queenriwon/Calculator>
* blog : <https://queenriwon3.tistory.com/77>

* 개발 환경
	* environment : IntelliJ IDEA, git, github
	* development : JAVA JDK 17





# 👉 구현 내용

### 필수 구현사항

* Lv.1
	* 양의 정수를 2개 입력하여 계산 결과를 출력합니다.
	* 사칙연산 기호를 문자 자료형으로 입력받습니다.
	* 조건문을 이용해 연산 결과를 출력합니다.
	* exit을 입력할 때까지 연산을 반복해서 할 수 있도록 구현합니다.
* Lv.2
	* 클래스와 메서드를 이용하여 계산기를 구현합니다.
	* 컬렉션 필드를 가지는 클래스를 구현하여 결과값을 컬렉션에 저장합니다.
	* 캡슐화를 적용하여 간접접근으로 클래스의 필드를 사용합니다.
	* 가장 오래된 컬렉션 데이터를 삭제합니다.


### 선택 구현사항

* Lv.3
	* Enum 타입을 사용하여 연산자에 접근합니다. (구현)
	* 제네릭을 사용하여 피연산자 자료형을 확장시킵니다. (구현)
	* 람다와 스트림을 사용하여 연산결과를 조회합니다. (구현)

	* 추상클래스를 이용하여 연산클래스를 상속하여 사용합니다. (구현)
	* 함수형 인터페이스를 이용하여 조회기준에 따른 데이터를 조회합니다. (구현)
	* 각 예외상황에서 예외처리를 합니다. (구현)

	* 피연산자 1개를 사용하는 등 고급 연산 지원 (미구현)
	* 괄호 사용 지원 (미구현)
	* 연산을 저장하여 그 결과를 추가로 연산할 수 있는 기능 (미구현)


![Lv.123](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FQ4Cpb%2FbtsLJnhgThR%2FD6LobGK8MlSOk3sszLj5mK%2Fimg.png)








# 👉 구현 핵심
* 연산자 기능 확장성을 위해 enum 자료형 활용(switch 구문 불필요)
* 조회 기준 확장성을 위해 함수형 인터페이스를 활용




# 👉 부족하거나 아쉬운 점, 공부하고 싶은 내용
* 효과적으로 github사용하기(커밋 컨벤션)
* 내가 만든 프로젝트 또는 과제를 소개할 수 있는 다이어그램 작성하기
* 함수형 인터페이스 심화
* Throw, throws, try-catch의 심화(예외종류 다루기)
* 제네릭 심화
* 고급연산을 지원하기위해 전위표기법 사용
* 괄호 사용을 위해 트리순회 알고리즘에 대해 배우는 것도 좋을 것 같다.








# 👉 클래스 다이어그램/ 플로우차트

(Lv.1 다이어그램은 생략)

* Calculator Lv.2 

![Calculator Lv.2 Diagram](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FQ4Cpb%2FbtsLJnhgThR%2FD6LobGK8MlSOk3sszLj5mK%2Fimg.png)


* Calculator Lv.3

![Calculator Lv.3 Diagram1](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fospom%2FbtsLJDxjJ9Q%2FbKyIDFR1ZWkR2xA2AUR9N1%2Fimg.png)

![Calculator Lv.3 Diagram2](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FDv2W0%2FbtsLHNVJSn4%2FAJYj5tdocU4NyCCscCpNh1%2Fimg.png)







# 👉구현결과

* Lv.1 과제 결과

![Calculator Lv.1 result](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2F28xn6%2FbtsLIe6RLPM%2FdbXu0Xos2156SSjKWUGuZ1%2Fimg.png)



* Lv.2 과제 결과

![Calculator Lv.2 result1](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FdCDSUh%2FbtsLHRc1UAE%2FMRo1ZGuekDZlvD340vAJ3k%2Fimg.png)

![Calculator Lv.2 result2](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FvxHQF%2FbtsLJEiIXCX%2FwHPAFOpsYmOM5W0fPLKPT0%2Fimg.png)






* Lv.3 구현 결과

![Calculator Lv.3 result1](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2F0pCT9%2FbtsLIO0Lp9F%2FIdAUspmzUDQ0am1hqVoaVk%2Fimg.png)

![Calculator Lv.3 result2](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FbU4Pt9%2FbtsLIBAwQTH%2FmC0V7Y7PIT7NSxaYCg3dP1%2Fimg.png)

![Calculator Lv.3 result3](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2F327xb%2FbtsLHQkSeAR%2FhWjlfhT8Vk4xrRH53Cf6xk%2Fimg.png)






# 👉 기능소개

Java 기반 계산기 - 구현 코드 및 설명

<https://queenriwon3.tistory.com/78>





# 👉 트러블슈팅


250108 - Java 계산기 Lv.2 및 Lv.3 구현 트러블슈팅: NaN 처리, 간접 접근, Switch 개선, 입력 문제 해결

<https://queenriwon3.tistory.com/75>


250109 - Java 계산기 Lv.3 구현과 트러블슈팅: 제네릭, 람다와 스트림, 조회 기능 클래스화, Enum 연산

<https://queenriwon3.tistory.com/76>

