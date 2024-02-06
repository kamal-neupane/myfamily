package com.example.familyinformation.service;

import com.example.familyinformation.entity.FamilyMember;

import java.util.List;

public interface FamilyService {
    List<FamilyMember> getAllFamily();
    FamilyMember getFamilyMemberById(int id);

    FamilyMember save(FamilyMember familyMember);

    void delete(int id);

}
