package com.mobility.remotedrivingmobility_be.repository;

import com.mobility.remotedrivingmobility_be.domain.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
