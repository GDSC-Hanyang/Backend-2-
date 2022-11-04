package hello.hellospring.domain;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /*
    DB에서 만약 Column name이 "username"이라면,
    @Column(name="username")
    이라는 어노테이션을 붙여주면 DB에 있는 username과 맵핑시킬 수 있다.
     */
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
