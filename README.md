# 👉 계산기 구현 과제 소개

	* 프로젝트 명 : 우리 팀을 소개해요.
	* 배운 내용을 바탕으로 계산기를 구현하는 과제입니다.
	* 지원하는 연산은 덧셈(+), 뺄셈(-), 곱셈(*), 나눗셈(/), 나머지(%), 제곱 및 제곱근(^) 입니다.
	* CUI로 동작합니다.
* 개발 기간 : 2024.12.31 ~ 2025.1.9 (약 10일)

* github : https://github.com/queenriwon/Calculator

* 개발 환경
	* environment : IntelliJ IDEA, git, github
	* development : JAVA JDK 17


# 



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



과제 레벨	계산기 기능	Calculator	Calculator2	Calculator3
Lv.1(필수)	양의 정수 입력	⭕️(double)	⭕️(double)	⭕️(Number)

사칙연산 기호를 입력받기	⭕️	⭕️	⭕️(%,^까지 확장)

If, switch 이용한 결과출력	⭕️	⭕️	enum으로 mapping
(switch 불필요)

반복과 반복 종료	⭕️	⭕️	⭕️
Lv.2(필수)	클래스와 메서드 구현	-	⭕️	⭕️

컬렉션 필드를 가지는 클래스	-	⭕️	⭕️

캡슐화 구현	-	⭕️(Calculator 클래스에서
구현)	⭕️

컬렉션 데이터 삭제	-	⭕️	-(삭제 필요 없음)
Lv.3(선택)	enum타입 활용	-	-	⭕️

제네릭 사용하여 피연산자 확장	-	-	⭕️

연산 결과 조회	-	-	⭕️
-	예외처리	print()를 사용한 예외 회피	nan출력시 조건문을 사용한 예외 회피	throw와 try-catch사용








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

![Calculator Lv.2 ClassDiagram](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FdDDfne%2FbtsLIMBRQnY%2FEsdePunVAsiwIygoXMCzIK%2Fimg.png)


![Calculator Lv.2 FlowChart](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcGB7hT%2FbtsLJEwc8z4%2FBbkdXiv7Xg8X0Ddh10b021%2Fimg.png)


* Calculator Lv.3









# 👉구현결과

* Lv.1 과제 결과




* Lv.2 과제 결과







* Lv.3 구현 결과








# 👉 기능소개

Java 기반 계산기 - 구현 코드 및 설명

https://queenriwon3.tistory.com/78





# 👉 트러블슈팅


250108 - Java 계산기 Lv.2 및 Lv.3 구현 트러블슈팅: NaN 처리, 간접 접근, Switch 개선, 입력 문제 해결

https://queenriwon3.tistory.com/75


250109 - Java 계산기 Lv.3 구현과 트러블슈팅: 제네릭, 람다와 스트림, 조회 기능 클래스화, Enum 연산

https://queenriwon3.tistory.com/76

