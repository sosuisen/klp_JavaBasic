import java.util.ArrayList;

public class MemberList {
	private ArrayList<Member> members = new ArrayList<Member>();

	public MemberList() {
		members.add(new Member("佐藤二葉"));
		members.add(new Member("田中一郎"));
		members.add(new Manager("三井翼", "マネージャー"));
	}

	public void show() {
		for (int i = 0; i < members.size(); i++) {
			Member mem = members.get(i);
			System.out.println(mem.getInfo());
		}
	}
}
