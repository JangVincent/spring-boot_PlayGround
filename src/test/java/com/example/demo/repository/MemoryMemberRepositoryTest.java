package com.example.demo.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import com.example.demo.domain.Member;
import com.example.repository.MemoryMemberRepository;

class MemoryMemberRepositoryTest {
  MemoryMemberRepository repository = new MemoryMemberRepository();

  @AfterEach
  public void afterEach() {
    // 여기서 clearStore를 호출하지 않으면 테스트가 끝나고 다음 테스트를 실행할 때 store에 데이터가 남아있어서 문제가 발생할 수
    // 있다.
    // 테스트 함수의 순서는 보장되지 않기 때문에.
    // 테스트는 서로 의존관계가 없어야 한다
    repository.clearStore();
  }

  @Test
  public void save() {
    Member member = new Member();
    member.setName("spring");

    repository.save(member);

    Member result = repository.findById(member.getId()).get();
    // Assertions.assertEquals(member, result);

    Assertions.assertThat(member).isEqualTo(result);
  }

  @Test
  public void findByName() {
    Member member1 = new Member();
    member1.setName("spring1");
    repository.save(member1);

    Member member2 = new Member();
    member2.setName("spring2");
    repository.save(member2);

    Member result = repository.findByName("spring1").get();

    Assertions.assertThat(result).isEqualTo(member1);
  }

  @Test
  public void findAll() {
    Member member1 = new Member();
    member1.setName("spring1");
    repository.save(member1);

    Member member2 = new Member();
    member2.setName("spring2");
    repository.save(member2);

    Assertions.assertThat(repository.findAll().size()).isEqualTo(2);
  }

}
