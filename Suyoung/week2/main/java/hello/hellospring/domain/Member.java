package hello.hellospring.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // 이건 이제 jpa가 관리하는 엔티티구나
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //쿼리에 id를 넣는게 아니라 디비가 id를 자동생성
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
