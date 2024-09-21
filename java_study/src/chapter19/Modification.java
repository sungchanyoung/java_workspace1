package chapter19;
// 람다 
/*
 * 1람다 하나의 추상 메서드 정의하고 인터페이스 사용 
 * 2 매개변수 타입 생략 가능 
 * 3 매개변수가 하나면 ()괄호 생략 가능 
 * 4 다른명령 구현 없이 바로 리턴시 {} 괄호 생략가능 & return 키워드 생략 가능 
 */
@FunctionalInterface
//: 해당 인터페이스가 함수형 인터페이스 임을  명시적으로 작성 
// 함수형 인터페이스 
//: 하나의 추상 메서드만 가지는 인터페이스 
public interface Modification<T> {
	T modify(T oldData, T newData);
//	T: 반환 타입 
	// modify 메서드 명 
	// (T oldData,T newData) 반환 타입T를 가지는 매개변수들
	
	//void.example(); : @FunctionInterface 어노테이션 사용으로 
	//해당 인터페이스  내부에는 반드시 단한개의 추상 메서드만 포함해야함!
	
}
