

import java.util.ArrayList;

class Wizerd implements Game {// 마법사

	@Override
	public void supriseAttack(String str) {
		// TODO Auto-generated method stub
		System.out.println("위자드" + " 파이어 볼!");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("몬스터를 잡기위해 이동합니다.");

	}

	@Override
	public void skill() {
		// TODO Auto-generated method stub
		System.out.println("사용 스킬은 파이어볼,라이트닝,얼리기 입니다.");

	}
}

class Warrior implements Game {

	@Override
	public void supriseAttack(String str) {
		// TODO Auto-generated method stub
		System.out.println(str+"어깨 빵!");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("아메리카노를 마시기위해 길드에 출근합니다.");
	}

	@Override
	public void skill() {
		// TODO Auto-generated method stub
		System.out.println("무식하게 때리기...");
	} // 전사

}

class Thief implements Game {

	@Override
	public void supriseAttack(String str) {
		// TODO Auto-generated method stub
		System.out.println(str + "돈안주면 잡아먹지!!!!");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("화장실을 가기위해 이동합니다.");
	}

	@Override
	public void skill() {
		// TODO Auto-generated method stub
		System.out.println("성직자 스킬이 뭐죠?? 무한 힐??");
	} // 도적

}

class Priest { // 도적
	public void supriseAttack() {
		System.out.println("성스러운 치료");
	}
}

interface Game {
	public abstract void supriseAttack(String str);

	// 인터페이스(interface)
	// 개발을 할때 동일한 규격으로 진행하기 위한 하나의 툴
	// 1.인터페이스 안에는 상수와 추상메소드만 존재한다.
	// 2. 인터페이스는 객체를 생성할 수 없다.
	// 3.자바는 다중상속을 지원하지 않지만 인터페이스는 동시에 여러개 사용가능하다.
	// 4. 메소드 앞에 abstract를 적지 않아도 자동으로 적용됨.
	public void move();

	public void skill();
}

class GameAttact implements Game {

	@Override
	public void supriseAttack(String str) {
		// TODO Auto-generated method stub
		if ("wizard".equals(str)) {
			System.out.println("파이어 볼!");
		} else if ("warrior".equals(str)) {
			System.out.println("어깨 빵!");
		} else if ("thief".equals(str)) {
			System.out.println("돈안주면 잡아먹지!!!!");
		} else if ("priest".equals(str)) {
			System.out.println("성스러운 치료");
		} else {
			System.out.println("영구읎다~");
		}
	}
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("화장실을 가기위해 이동합니다.");
	}

	public void skill() {
		// TODO Auto-generated method stub
		System.out.println("성직자 스킬이 뭐죠?? 무한 힐??");
	} // 도적
}

public class Exam001 { // 메인
	public static void main(String[] args) {
		/*
		  Wizerd w=new Wizerd(); w.attact(); w.supriseAttack("위자드");
		  Warrior war=new Warrior(); war.charge();
		  Thief t=new Thief(); t.supriseAttack();
		 

		Wizerd w = new Wizerd();
		w.supriseAttack("위자드");
		w.move();
		w.skill();
		System.out.println("-------------------");// 위자드

		Warrior war = new Warrior();
		war.supriseAttack("빈약한 전사님께서 당황하지 않고 바람의나라에 있는 아메리카노 마시러 ");
		war.move();
		war.skill();
		System.out.println("-------------------");// 전사

		Thief t = new Thief();
		t.supriseAttack("성직자님이 강남스타일을 춤추고있습니다. 라고하며 ");
		t.move();
		t.skill();
		System.out.println("-------------------3");// 도작

//인터페이스 처리.....
		GameAttact ga = new GameAttact();
		
		String strArr[] = { "wizard", "thief", "priest", "warrior", "09" };
		for (int i = 0; i < strArr.length; i++) {
			ga.supriseAttack(strArr[i]);
			if(!"09".equals(strArr[i])) {
				ga.move();
				ga.skill();
			} else {
				System.out.println("아닌가벼");
			}
		}
		*/
		
		  Game w=new Wizerd(); 
		  Game war=new Warrior(); 
		  Game t=new Thief();
		  //		String strArr[] = { "wizard", "thief", "priest", "warrior", "09" };
		  ArrayList<Game> list =new ArrayList<Game>();
		  list.add(w);
		  list.add(war);
		  list.add(t);
		  for(int i=0; i<list.size(); i++) {
			  list.get(i).supriseAttack("강남스타일을 외칩니다.");
		  }
		  
		  String Text=" (1절) 동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라만세\n"
		  		+ "(후렴)무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세\n"
		  		+ "(2절) 남산 위에 저 소나무, 철갑을 두른 듯 바람 서리 불변함은 우리 기상일세.\n"
		  		+ "(후렴)무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세\n"
		  		+ "(3절) 가을 하늘 공활한데 높고 구름 없이 밝은 달은 우리 가슴 일편단심일세.\n"
		  		+ "(후렴)무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세\n"
		  		+ "(4절) 이 기상과 이 맘으로 충성을 다하여 괴로우나 즐거우나 나라 사랑하세.\n"
		  		+ "(후렴)무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세\n";
		  boolean isText=true;
		  while(isText) {
			  System.out.println(isText);
			  String resultText[]=Text.split("");
			  for(int i=0; i<resultText.length; i++) {
				  System.out.print(resultText[i]+" ");
				  try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("에러: "+e.getMessage());
				}
			  }
			 isText=false;
		  }
	}
}
