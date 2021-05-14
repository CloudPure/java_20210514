package java_20210514;

import java.util.ArrayList;

public class MemberManager {
	// 여기는 반드시 private ArrayList가 있어야 함
	// insert하고 저장할 공간을 찾아야 하기 때문에
	private ArrayList list;
	public MemberManager() {
		list = new ArrayList();
	}
	
	public void insert(String id, String name, int age) {
		list.add(new Member(id, name, age));
	}
	
	public void update(String id, String name, int age) {
		for(int i = 0; i<list.size(); i++) {
			Member m = (Member)list.get(i);
			if(id.equals(m.getId())) {
				// 1.지우고 추가하거나 2.지우지 않고 추가하거나(call by reference)
				// 1.
				// list.remove(i);
				//list.add(i, new Member(id,name,age));
				// 2.
				m.setAge(age); // call by reference로 짤 경우 이런 식으로 하기
				m.setName(name); 
				break;
			}
		}
	}
	public void delete(String id) {
		for(int i = 0; i<list.size(); i++) {
			Member m = (Member)list.get(i);
			if(id.equals(m.getId())) {
				list.remove(i);			
				break;
				
			}
		}
	}
	public ArrayList select() {
		return list;
	}
	public Member select(String id) {
		Member member = null;
		for(int i = 0; i<list.size(); i++) {
			Member m = (Member)list.get(i);
			if(id.equals(m.getId())) {
				member = m;
				break;
			}
		}
		return member;
	}
}
