package com.example.familyinformation.dao;

import com.example.familyinformation.entity.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyRepository extends JpaRepository<FamilyMember,Integer> {
}
