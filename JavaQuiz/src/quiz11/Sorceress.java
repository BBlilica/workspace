package quiz11;

public class Sorceress extends Player {
	// 마법사
	
	// 생성자 - 이름을 전달받아서, hp = 500, mp = 1000으로 초기화
	
	// 블리자드 스킬 - 광역공격기
	// 마나 200 소모, 범위 안에 모든 객체에게 5 ~ 15사이의 랜덤한 피해를 한번 발생을 시킵니다.
	// 타격당한 플레이어의 플레이어의 이름을 출력하세요.
	public static void main(String[] args) {
	int ran = (int)(Math.random()*10 +5);
	}
	
	
	Sorceress (String name) {
		this.name = name;
		hp = 500;
		mp = 1000;
	}
	
	public void blizzard(Player[] players) {
		if (mp < 200) {
			System.out.println("마나가 부족합니다.");
			return;
		} else {
			System.out.println("발이 꿩꿩꿩, 손이 꿩꿩꿩");
			this.mp -= 200;
			for(Player p : players) {
				
				int ran = (int)(Math.random()*10 +5);
				p.hp -= ran; // 상대방 hp - 데미지
				System.out.println(p.name + "님이" + ran + " 피해를 입었습니다.");
			}
			
		}
	}
	
}
