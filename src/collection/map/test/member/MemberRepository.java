package collection.map.test.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {
    private Map<String, Member> memberMap = new HashMap<>();
    public void save(Member member) {
        memberMap.put(member.getId(), member);
    }

    public Member findById(String id) {
        return memberMap.get(id);
    }

    public Member findByName(String name) {
        for(Map.Entry<String, Member> temp : memberMap.entrySet()) {
            if(temp.getValue().getName().equals(name)) {
                return temp.getValue();
            }
        }
        return null;
    }

    public void remove(String id) {
        memberMap.remove(id);
    }
}
