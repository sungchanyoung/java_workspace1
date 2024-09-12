package chapter11;
// 이벤트 관리 시스템 
// 참가 명단 관리 
// 사전 등록 +이벤트 당일에는 추가적인 참가자 등록 X
// ArrayList(목록추가, 삭제X, 참가자 조회 O)

import java.util.ArrayList;
import java.util.LinkedList;

//대기열 관리 \
//: 이벤트에는 한정된 좌석 좌석이 모두 차면  추가 도착 참가자들은 대기열에 등록 
//>> 위의 이벤트 참가자들이 퇴장하는 경우 입장 가능 
class EventMangement{
	ArrayList<String> participantList= new ArrayList<>();
	LinkedList<String> waitingQueue = new LinkedList<>();
	
	void addParaticipant(String name) {
		participantList.add(name);
	}
	void addToWaitingQueue(String name) {
		waitingQueue.add(name);
		
	}
	void leaveParticipant(String name) {
		// 대기열 요소의 수가 0보다 클래
		if(waitingQueue .size()>0) {
			String nextParticipant = waitingQueue.remove(0);
			addParaticipant(nextParticipant);
		}
	}
	boolean checkParticipant(String name) {
		return participantList.contains(name);
	}
}

public class C_Practice {
	public static void main(String[] args) {
		EventMangement event =new EventMangement();
		event.addParaticipant("이승아");
		event.addParaticipant("이승아");
		event.addParaticipant("이승아");
		event.addParaticipant("이승아");

		// 대기열에 참가자 추가 
		event.addToWaitingQueue("윤대휘");
		event.addToWaitingQueue("윤대휘");
		event.addToWaitingQueue("윤대휘");
		
		event.leaveParticipant("이승아");
		System.out.println(event.participantList);
		System.out.println(event.waitingQueue);
		event.leaveParticipant("이승아");
		System.out.println(event.participantList);
		event.leaveParticipant("이승아");
		System.out.println(event.participantList);
		System.out.println(event.checkParticipant("윤대휘"));
		System.out.println(event.checkParticipant("윤대휘"));
		System.out.println(event.checkParticipant("윤대휘"));
	}
}
