package hello.hellospring.domain;



import javax.persistence.*;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // IDENTITY: DB가 생성
    private Long id;

//    @Column(name="username")      // DB 테이블의 username이라는 이름의 컬럼과 매칭됨
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
