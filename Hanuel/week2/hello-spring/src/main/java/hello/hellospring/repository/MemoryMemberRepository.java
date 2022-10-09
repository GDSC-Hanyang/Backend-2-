package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;
    /* map : 키와 값을 하나의 쌍으로 저장하는 방식 (key-value)
        .put(key, value) : 입력
        .get(key) : return value
    */

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream() // 한바퀴 쭉 도는거
                .filter(member -> member.getName().equals(name)) // 람다
                .findAny(); // 하나라도 찾으면 바로 반환
    }

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }
}

/*
optional : findById나 findByName할때 Null일 수 있다
-> null을 그대로 반환하는 대신 optional로 감싸서 반환하는거 요새 선호
*/
